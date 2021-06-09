package p02.chatting2;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx2 {

	public static void main(String[] args) {
		Socket sk2 = null;
		try {
			// localhost: 127.0.0.1 :: 자기자신 컴퓨터 주소
			sk2 = new Socket("127.0.0.1", 9888);

			Thread t3 = new SenderThread(sk2); // 송신
			Thread t4 = new ReceiverThread(sk2); // 수신
			t3.start();
			t4.start();

		} catch (UnknownHostException e) {

		} catch (IOException e) {

		}
//		try {
//			sk2.close();
//		} catch (IOException e) {
//		}
	

	}

}
