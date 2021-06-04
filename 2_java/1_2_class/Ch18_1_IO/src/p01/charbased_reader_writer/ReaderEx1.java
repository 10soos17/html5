package p01.charbased_reader_writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Character Stream: 문자기반(2Byte 단위) 스트림, Reader/Writer
//				  : 사람이 이해할 수 있는 문자로 구성된 Stream(text file)
//Byte Stream: Byte단위(1Byte) 스트림, InputStream/OutputStream
//			 : 사람이 보아서 알 수 없지만, 프로그램에서 Binary Data로 구성된 Stream(Binary file)
public class ReaderEx1 {

	public static void main(String[] args) {
		// 파일 저장
		FileReader fr = null;
		try {
			fr = new FileReader("../../maven.txt");
			int i;
			while (true) {
				i = fr.read(); // a=97
				if (i == -1) // -1: end of file
					break;
				char ch = (char) i; // a
				System.out.println(ch);
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일을 없습니다..");
		} catch (IOException e) {
			System.out.println("IO에 문제 있습니다 .");
		}
		try {
			fr.close();
		} catch (IOException e) {

		}

		System.out.println("종료");

	}

}
