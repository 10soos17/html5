package p01.basic;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx1 {

	public static void main(String[] args) {
		String name = "www.google.com";
       try {
		InetAddress id = InetAddress.getByName(name);
		String hostname = id.getHostName();
		String hostAddress = id.getHostAddress();
		System.out.println(hostname+" : "+ hostAddress);
	} catch (UnknownHostException e) {
		
	}
	}

}
