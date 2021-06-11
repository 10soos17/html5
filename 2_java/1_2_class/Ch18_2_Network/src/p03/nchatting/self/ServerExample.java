package p03.nchatting.self;

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
	ExecutorService executorService;// 스레드 풀
	ServerSocket serverSocket;

	// 동기화를 위해서 Vector 사용: Client 정보 관리 리스트
	List<Client> connections = new Vector<Client>(); // 연결된 클라이언트 저장, 동기식 스레드를 사용하는 Vector 사용

	// 1. 서버 시작
	void startServer() {

		executorService = Executors.newFixedThreadPool(// 스레드풀 생성
				Runtime.getRuntime().availableProcessors() // CPU 코어의 수 만큼 Thread 생성
		);

		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
		} catch (Exception e) {
			if (!serverSocket.isClosed()) {
				stopServer();
			} // serverScoket이 닫혀 있지 않으면, stopServer()호출
			return;
		}

		Runnable runnable = new Runnable() { // 수락작업 생성
			@Override
			public void run() {
				// JavaFX UI는 스레드에 안전하지 않기 때문에 UI를 생성하고 변경하는 작업은 JavaFX Application Thread가 담당한다
				// 작업스레드가 UI를 처리할수 없기 때문에 UI이 변경이 필요한 경우 2가지 방법 사용
				// 1. Platform.runLater(), 2, javafx.concurrent API인 Task 또는 Service 사용
				Platform.runLater(() -> { // 작업스레드는 UI가 사용 못하므로 이것을 사용
					displayText("[서버 시작]");
					btnStartStop.setText("stop");
				});

				while (true) {
					try {
						Socket socket = serverSocket.accept();// 연결수락
						String message = "[연결 수락: " + socket.getRemoteSocketAddress() + ": "
								+ Thread.currentThread().getName() + "]";
						Platform.runLater(() -> displayText(message));

						Client client = new Client(socket);// 클이언트 객체 생성
						connections.add(client);// 클이언트 객체 배열에 저장
						Platform.runLater(() -> displayText("[연결 개수: " + connections.size() + "]"));// UI로 표시
					} catch (Exception e) {
						if (!serverSocket.isClosed()) {
							stopServer();
						} // 예외 발생시, 서버 정지
						break;
					}
				}
			}
		};
		executorService.submit(runnable);// 스레드풀에 시작된 스레드 저장, 처리
	}

	// 2. 서버 종료 코드
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

			Platform.runLater(() -> {// UI에 표시 - "[stop]"버튼의 글자를 "[start]"로 변경한다.
				displayText("[서버 멈춤]");
				btnStartStop.setText("start");
			});
		} catch (Exception e) {
		}
	}

	// 3. 데이터 통신 코드
	class Client {
		Socket socket;

		Client(Socket socket) {
			this.socket = socket;
			receive();
		}

		void receive() {

			Runnable runnable = new Runnable() {// 받기 작업 생성
				@Override
				public void run() {
					try {
						while (true) {
							byte[] byteArr = new byte[100];
							InputStream inputStream = socket.getInputStream();

							// 데이터 받기:: 클라이언트가 비저상 종료를 했을 경우 IOException 발생
							int readByteCount = inputStream.read(byteArr);

							// 클라이언트가 정상적으로 Socket의 close()를 호출했을 경우
							if (readByteCount == -1) {
								throw new IOException();
							}
							// 문자열로 변환
							String message = "[요청 처리: " + socket.getRemoteSocketAddress() + ": "
									+ Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(message));

							String data = new String(byteArr, 0, readByteCount, "UTF-8");// 바이트 배열의 크기 내에서 받은 바이트 크기만큼 문자열로 읽기
							
							// 문자열을 모든 클라이언트에게 보내기 위해 connections에 저장된 Client를 하나씩 얻어 send() 호출
							for (Client client : connections) {
								client.send(data); // ----------------------send()------------
							}
						}
					} catch (Exception e) {
						try {
							connections.remove(Client.this);// connections컬렉션에서 Client 객체를 제거
							String message = "[클라이언트 통신 안됨: " + socket.getRemoteSocketAddress() + ": "
									+ Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(message));
							socket.close();
						} catch (IOException e2) {
						}
					}
				}
			};
			executorService.submit(runnable); // Thread Pool에서 작업을 처리하기 위해 submit()을 호출
		}

		void send(String data) {
			Runnable runnable = new Runnable() {// 보내기 작업 생성
				@Override
				public void run() {
					try {// 클라이언트로 데이터 보내기 
						byte[] byteArr = data.getBytes("UTF-8");
						OutputStream outputStream = socket.getOutputStream();
						outputStream.write(byteArr);
						outputStream.flush();
					} catch (Exception e) {
						try {
							String message = "[클라이언트 통신 안됨: " + socket.getRemoteSocketAddress() + ": "
									+ Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(message));
							connections.remove(Client.this);
							socket.close();
						} catch (IOException e2) {
						}
					}
				}
			};
			executorService.submit(runnable);
		}
	}

	//// JavaFX를 이용한 UI 생성 코드
	TextArea txtDisplay;
	Button btnStartStop;

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);

		txtDisplay = new TextArea();
		txtDisplay.setEditable(false);
		BorderPane.setMargin(txtDisplay, new Insets(0, 0, 2, 0));
		root.setCenter(txtDisplay);

		btnStartStop = new Button("start");
		btnStartStop.setPrefHeight(30);
		btnStartStop.setMaxWidth(Double.MAX_VALUE);
		// start와 stop버튼을 클릭했을때 이벤트 처리 코드
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
		primaryStage.setScene(scene);
		primaryStage.setTitle("Server");
		// 원도우 우측 ㅓ상단 닫기 버튼을 클릭했을때 이벤트 처리 코드
		primaryStage.setOnCloseRequest(event -> stopServer());
		primaryStage.show();
	}

	// 작업 스레드의 작업 처리 내용을 출력할때 호출하는 메소드
	void displayText(String text) {
		txtDisplay.appendText(text + "\n");
	}

	public static void main(String[] args) {
		launch(args);
	}
}
