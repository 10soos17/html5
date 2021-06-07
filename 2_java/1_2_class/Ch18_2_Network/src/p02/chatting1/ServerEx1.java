package p02.chatting1;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerEx1 {
	public static void main(String[] args) {
		try {
			ServerSocket sk = new ServerSocket(9000);
		} catch (IOException e) {
		}
	}
}
