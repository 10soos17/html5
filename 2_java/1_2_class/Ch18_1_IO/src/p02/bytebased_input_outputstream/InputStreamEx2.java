package p02.bytebased_input_outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//String[] 이용하기 
public class InputStreamEx2 {
	public static void main(String[] args) {

		FileInputStream fi = null;
		try {
			fi = new FileInputStream(args[0]);
			byte arr[] = new byte[16];

			while (true) {
				try {
					int data = fi.read(arr);

					if (data < 0)
						break;
					for (int i = 0; i < data; i++)
						System.out.println(arr[i]);
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
