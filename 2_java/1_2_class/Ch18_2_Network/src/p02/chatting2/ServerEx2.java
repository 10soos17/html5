<<<<<<< HEAD
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
=======
package p02.chatting2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx2 {

	// 1:1 Chatting
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket sk = null;

		try {

			ss = new ServerSocket(5004);
			sk = ss.accept();

			Thread t1 = new SenderThread(sk,"server");// 송신
			Thread t2 = new ReceiverThread(sk,"server");// 수신
			t1.start();
			t2.start();

		} catch (IOException e) {

		} finally {
			try {
				ss.close();
			} catch (IOException e) {

			}
		}

	}

}
>>>>>>> 49c01621b1576670982d3c8009de3b5ecc7fe7ff
