package p03.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ServerExample extends Application {

	ExecutorService executorService;
	ServerSocket serverSocket;
	List<Client> connections = new Vector<Client>();

	// 서버 시작 코드
	void startServer() {
		executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
		} catch (Exception e) {
			if (!serverSocket.isClosed()) {
				stopServer();
			}
			return;
		}

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				Platform.runLater(() -> {
					displayText("[서버 시작]");
					btnStartStop.setText("stop");
				});
				while (true) {
					try {
						Socket socket = serverSocket.accept();
						String msg = "[연결 수락: " + socket.getRemoteSocketAddress() + ": "
								+ Thread.currentThread().getName() + "]";
						Platform.runLater(() -> displayText(msg));

						Client client = new Client(socket);
						connections.add(client);
						Platform.runLater(() -> displayText("[연결 개수: " + connections.size() + "]"));

					} catch (Exception e) {
						if (!serverSocket.isClosed()) {
							stopServer();
						}
						break;
					}
				}
			}
		};
		executorService.submit(runnable);
	}

	// 서버 종료 코드
	void stopServer() {
		try {
			Iterator<Client> iterator = connections.iterator();
			while (iterator.hasNext()) {
				Client client = iterator.next();
				client.socket.close();
				iterator.remove();
			}
			if (serverSocket != null && !serverSocket.isClosed()) {
				serverSocket.close();
			}
			if (executorService != null && !executorService.isShutdown()) {
				executorService.shutdown();
			}
			Platform.runLater(() -> {
				displayText("[서버 멈춤]");
				btnStartStop.setText("start");

			});

		} catch (Exception e) {
		}
	}

	// 데이터 통신 코드
	class Client {
		Socket socket;

		Client(Socket socket) {
			this.socket = socket;
			receive();
		}

		// 데이터 받기 코드
		void receive() {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					try {
						while (true) {
							byte[] byteArr = new byte[100];
							InputStream inputStream = socket.getInputStream();

							// 클라이언트가 비정상 종료를 했을 경우 IOException 발생
							int readByteCount = inputStream.read(byteArr);

							// 클라이언트가 정상적으로 Socket의 close()를 호출했을 경우
							if (readByteCount == -1) {
								throw new IOException();
							}

							String msg = "[요청 처리: " + socket.getRemoteSocketAddress() + ":"
									+ Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(msg));

							String data = new String(byteArr, 0, readByteCount, "UTF-8");

							for (Client client : connections) {
								client.send(data);
							}

						}
					} catch (Exception e) {
						try {
							connections.remove(Client.this);
							String msg = "[클라이언트 통신 안됨: " + socket.getRemoteSocketAddress() + ": "
									+ Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(msg));
							socket.close();
						} catch (Exception e2) {

						}
					}
				}
			};
			executorService.submit(runnable);
		}

		void send(String data) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {

					try {
						byte[] byteArr = data.getBytes("UTF-8");
						OutputStream outputStream = socket.getOutputStream();
						outputStream.write(byteArr);
						outputStream.flush();
					} catch (Exception e) {
						try {
							String msg = "[클라이언트 통신 안됨: " + socket.getRemoteSocketAddress() + ": "
									+ Thread.currentThread().getName() + "]";

							Platform.runLater(() -> displayText(msg));
							connections.remove(Client.this);
							socket.close();
						} catch (Exception e2) {

						}
					}
				}
			};
			executorService.submit(runnable);
		}

	}

	//////////////////////////////////////////////////
	// UI 생성 코드
	TextArea txtDisplay;
	Button btnStartStop;

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);

		txtDisplay = new TextArea();
		txtDisplay.setEditable(false);
		BorderPane.setMargin(txtDisplay, new Insets(0, 0, 2, 0));
		root.setCenter(txtDisplay);

		btnStartStop = new Button("start");
		btnStartStop.setPrefHeight(30);
		btnStartStop.setMaxWidth(Double.MAX_VALUE);

		btnStartStop.setOnAction(e -> {
			if (btnStartStop.getText().equals("start")) {
				startServer();
			} else if (btnStartStop.getText().equals("stop")) {
				stopServer();
			}
		});
		root.setBottom(btnStartStop);

		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		stage.setScene(scene);
		stage.setTitle("Server");
		stage.setOnCloseRequest(e -> stopServer());
		stage.show();
	}

	void displayText(String text) {
		txtDisplay.appendText(text + "\n");
	}

	public static void main(String[] args) {
		launch(args);

	}

}
