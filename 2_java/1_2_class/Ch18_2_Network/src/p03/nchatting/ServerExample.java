package p03.nchatting;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.omg.CORBA.portable.OutputStream;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class ServerExample extends Application {

	ExecutorService executorService; // Thread Pool
	ServerSocket serverSocket;

	List<Client> connections = new Vector<>();

	// 1. 서버 시작
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
					// btnStartStop.setText("stop");
				});
				while (true) {
					try {
						Socket socket = serverSocket.accept();
						String message = "[연결 수락: " + socket.getRemoteSocketAddress() + ": "
								+ Thread.currentThread().getName() + "]";
						Platform.runLater(() -> displayText(message));

						 Client client - new Client(socket);
						 connections.add(client);
						 Platform.runLater(()->displayText("연결 개수: "+connections.size()+"]"));

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

	// 2. 서버 종료
	void stopServer() {
		try {
			Iterator<Client> iterator = connections.iterator();
			while (iterator.hasNext()) {
				Client client = iterator.next();
				client.socket.close();
				iterator.remove();

			}
			if (serverSocket != null && !executorService.isShutdown()) {
				serverSocket.close();
			}
			if (executorService != null && !executorService.isShutdown()) {
				executorService.isShutdown();
			}
			Platform.runLater(() -> {
				displayText("[서버 멈춤]");
				btnStartStop.setText("start");

			});
		} catch (Exception e) {
		}
	}

	// 3.중첩 클래스(데이터 통신)
	class Client {
		Socket socket;

		Client(Socket socket) {
			this.socket = socket;
			receive();
		}

		void receive() {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					try {
						while (true) {
							byte[] byteArr = new byte[100];
							InputStream inputStream = socket.getInputStream();

							int readByteCount = inputStream.read(byteArr);

							if (readByteCount == -1) {
								throw new IOException();
							}

							String msg = "요청 처리: " + socket.getRemoteSocketAddress() + ": "
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
							String msg = "클라이언트 통신 안됨: " + socket.getRemoteSocketAddress() + ": "
									+ Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(msg));
							socket.close();
						} catch (IOException e2) {

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
					}catch(Exception e) {
						try {
							String msg = "클라이언트 통신 안됨: "+
										 socket.getRemoteSocketAddress()+":"+
										 Thread.currentThread().getName() + "]";
							Platform.runLater(()->displayText(msg));
							connections.remove(Client.this);
							socket.close();
						}catch(IOException e2) {
							
						}
					}
				};
				executorService.submit(runnable);
			
	
	}

		public void start(Stage arg0) throws Exception {

		}

		void displayText(String text) {

		}

		public static void main(String[] args) {
			launch(args);
		}

}
