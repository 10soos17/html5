package p03.nchatting;

import java.net.InetSocketAddress;
import java.net.Socket;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

//1078
public class ClientExample extends Application {

	Socket socket;

	// 1. 연결
	void startClient() {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					socket = new Socket();
					socket.connect(new InetSocketAddress("localhost", 5001));
					Platform.runLater(()->{displayText("[연결 완료: " + socket.getRemoteSocketAddress() + "]");
					btnConn.setText("stop");
					btnSend.setDisable(false);
					});
				}catch(Exception e){
					Platform.runLater(()->displayText("[서버 통신 안됨]"));
					if(!socket.isClosed()) {stopClient();}
					return;
				}
				receive();
			}
		};
		thread.start();
	}

	// 2. 연결 끊기
	void stopClient() {

	}

	// 3. 수신
	void receive() {

	}

	// 4. 송신
	void send(String data) {

	}

	public void start(Stage arg0) throws Exception {

	}

	void displayText(String text) {

	}

	public static void main(String[] args) {
		launch(args);
	}

}
