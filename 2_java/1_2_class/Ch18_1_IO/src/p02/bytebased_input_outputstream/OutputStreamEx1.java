package p02.bytebased_input_outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamEx1 {

	public static void main(String[] args) {
		FileOutputStream fo = null;
		try {
			fo = new FileOutputStream("../../output.dat");
			byte[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };

			for (int i = 0; i < arr.length; i++) {
				try {
					fo.write(arr[i]);
				} catch (IOException e) {
					System.out.println("error");
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수가 없습니다.");
		} finally {
			try {
				fo.close();
			} catch (IOException e) {

			}
		}

	}

}
