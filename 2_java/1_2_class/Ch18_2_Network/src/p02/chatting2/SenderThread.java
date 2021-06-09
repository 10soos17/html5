package p02.chatting2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread extends Thread {
	Socket sk;

	public SenderThread(Socket sk) {
		this.sk = sk;
	}

	@Override
	public void run() {

		try {
			InputStreamReader ir = new InputStreamReader(System.in); // 주스트림
			BufferedReader br = new BufferedReader(ir); // 보조스트림
			PrintWriter pw = new PrintWriter(sk.getOutputStream());

			while (true) {

				String str = br.readLine();
				if (str.equals("bye"))// "bye"입력하면 채팅 종료
					break;
				
				pw.println(str); // 송신
				pw.flush(); // 버퍼 비우기
			}

		} catch (IOException e) {
			//System.out.println(e.getMessage());
		
		}
		finally {
			try {
				sk.close();
			} catch (IOException e) {
				
			}
		}

	}

}
