package p02.chatting2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx2 {
//1:1 Chatting
	public static void main(String[] args) {
		ServerSocket ss =null;
		Socket sk = null;
		try {
			ss = new ServerSocket(5004);
			sk = ss.accept();
			
			Thread t1 = new SenderThread(sk);//송신
			Thread t2 = new ReceiverThread(sk);//수신
			t1.start();			
			t2.start();		
		} catch (IOException e) {
			
		}finally {
			try {
				ss.close();
			} catch (IOException e) {
				
			}
		}

	}

}
