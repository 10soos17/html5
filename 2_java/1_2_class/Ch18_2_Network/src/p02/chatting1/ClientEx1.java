<<<<<<< HEAD
package p02.chatting1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx1 {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			// localhost: 127.0.0.1 :: 자기자신 컴퓨터 주소
			socket = new Socket("127.0.0.1", 9191);
			InputStream in = socket.getInputStream(); // Server에서 오는 데이터
			OutputStream out = socket.getOutputStream(); // Server에 보내는 데이터

			// OutputStream
			String str = "Hello Server!";
			out.write(str.getBytes()); // str.getBytes(): 문자열을 byte[]로 바꾸기
			
			// InputStream
			byte[] arr = new byte[100];
			in.read(arr);
			System.out.println(new String(arr));

			
		} catch (UnknownHostException e) {

		} catch (IOException e) {

		}
		try {
			socket.close();
		} catch (IOException e) {
		}

	}

}
=======
package p02.chatting1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx1 {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			//localhost: 127.0.0.1  :: 자기자신 컴퓨터 주소
			socket = new Socket("127.0.0.1", 9000);
			InputStream in =  socket.getInputStream();//Client에서 오는 데이터
			OutputStream out = socket.getOutputStream();//Client에 보내는 데이터
			
			//OutputStream
			String str ="Hello,Server!";
			out.write(str.getBytes());//str.getBytes(): 문자열을 byte[]바꾸기
			
			
			//InputStream
			byte[] arr = new byte[100];
			in.read(arr);
			System.out.println(new String(arr));
			
		} catch (UnknownHostException e) {
			
		} catch (IOException e) {
			
		}
		try {
			socket.close();
		} catch (IOException e) {
			
		}
	}

}
>>>>>>> 49c01621b1576670982d3c8009de3b5ecc7fe7ff
