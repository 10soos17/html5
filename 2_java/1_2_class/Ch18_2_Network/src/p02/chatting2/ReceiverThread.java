<<<<<<< HEAD
package p02.chatting2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiverThread extends Thread {
	Socket sk;

	public ReceiverThread(Socket sk) {
		this.sk = sk;
	}

	@Override
	public void run() {
		try {
			InputStreamReader ir = new InputStreamReader(sk.getInputStream()); // 주스트림
			BufferedReader br = new BufferedReader(ir); // 보조스트림

			while (true) {
				String str = br.readLine();
				if (str == null)
					break;

				System.out.println("수신>" + str);

			}

		} catch (IOException e) {
			//System.out.println(e.getMessage());
		}

	}

}
=======
package p02.chatting2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiverThread extends Thread {
	Socket sk;
	String name;

	public ReceiverThread(Socket sk, String name) {
		this.sk = sk;
		this.name = name;
	}

	@Override
	public void run() {
		try {
			InputStreamReader ir = new InputStreamReader(sk.getInputStream());// 주스트림
			BufferedReader br = new BufferedReader(ir);// 보조스트림

			while (true) {
				System.out.println(this.name+"receiveth");
				System.out.println(Thread.getAllStackTraces());
				String str = br.readLine();

				if (str == null) // 채팅 종료
					break;

				System.out.println("수신>" + str);
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
>>>>>>> 49c01621b1576670982d3c8009de3b5ecc7fe7ff
