package p03.nchatting;

import java.net.ServerSocket;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;

import javafx.application.Application;
import javafx.stage.Stage;

public class ServerExample extends Application {

	ExecutorService executorService; // Thread Pool
	ServerSocket sercerSocker;

	List<Client> connections = new Vector<>();

	// 1. 서버 시작
	void startServer() {

	}

	// 2. 서버 종료
	void stopServer() {

	}

	// 3.중첩 클래스(데이터 통신)
	class Client {

	}

	public void start(Stage arg0) throws Exception {

	}

	void displayText(String text) {

	}

	public static void main(String[] args) {
		launch(args);
	}

}
