package p02.chatting2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//서버: 먼저 실행하고 Client 요청을 기다린다. 
public class ServerEx2 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket sk1 = null;
		try {
			ss = new ServerSocket(9888);
			sk1 = ss.accept();

			Thread t1 = new SenderThread(sk1); // 송신
			Thread t2 = new ReceiverThread(sk1); // 수신
			t1.start();
			t2.start();

		} catch (IOException e) {
			//System.out.println(e.getMessage());

		} finally {
			try {
				ss.close();
			} catch (IOException e) {
				
			}
		}
	}

}
