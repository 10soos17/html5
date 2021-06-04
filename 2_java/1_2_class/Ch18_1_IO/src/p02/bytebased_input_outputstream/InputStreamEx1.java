package p02.bytebased_input_outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamEx1 {
	public static void main(String[] args) {
		FileInputStream fi = null;
		try {
			fi = new FileInputStream("../../output.dat");
			int i;
			while (true) {
				try {
					i = fi.read();
					byte b = (byte) i;
					if (b == -1)
						break;
					System.out.print(b);
				} catch (IOException e) {
					System.out.println("파일을 읽을 수가 없습니다.");
				}

			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수가 없습니다.");
		} finally {
			try {
				fi.close();
			} catch (IOException e) {

			}
		}
		System.out.println("종료");
	}
}
