package p05.secondary_stream;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamEx1 {

	public static void main(String[] args) {
//		FileInputStream fi = null;
//		DataInputStream dis = null;
		try {
			// 상대경로 파일
			FileInputStream fi = new FileInputStream("../../DataOuput.dat");
			DataInputStream dis = new DataInputStream(fi);
//			// 절대경로 파일 1 Window (ex. "C:Users/soos/Desktop/git/lecture/lecture_choongang/2_java/DataOuput.dat")
//			// 절대경로 파일 2 Linux (ex. C:/Users/soos/java/DataOuput.dat")
//			FileInputStream fi = new FileInputStream("C:\\Users\\soos\\java/DataOuput.dat");
//			DataInputStream dis = new DataInputStream(fi);

			while (true) {
				int i = dis.readInt();

				System.out.println(i);

			}

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound");
		} catch (EOFException e) {
			System.out.println("The End");

		} catch (IOException e) {
			System.out.println("저장 또는 출력에 문제 있습니다.");
		}

	}

}
