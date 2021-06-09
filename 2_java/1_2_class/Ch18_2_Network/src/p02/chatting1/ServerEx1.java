package p02.chatting1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//서버: 먼저 실행하고 Client 요청을 기다린다. 
public class ServerEx1 {
	public static void main(String[] args) {
		ServerSocket sk = null;
		Socket socket = null;
		try {
			sk = new ServerSocket(9191);
			socket = sk.accept();
			InputStream in = socket.getInputStream(); // Client에서 오는 데이터
			OutputStream out = socket.getOutputStream(); // Client에 보내는 데이터

			// InputStream
			byte[] arr = new byte[100];
			in.read(arr);
			System.out.println(new String(arr));

			// OutputStream
			String str = "Hello Client!";
			out.write(str.getBytes()); // str.getBytes(): 문자열을 byte[]로 바꾸기

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				sk.close();
				socket.close();
			} catch (IOException e) {
			}
		}
	}

}
