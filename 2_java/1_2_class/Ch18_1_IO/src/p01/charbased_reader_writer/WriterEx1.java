package p01.charbased_reader_writer;

import java.io.FileWriter;
import java.io.IOException;

//Character Stream: 문자기반(2Byte 단위) 스트림, Reader/Writer
//				  : 사람이 이해할 수 있는 문자로 구성된 Stream(text file)
//Byte Stream: Byte단위(1Byte) 스트림, InputStream/OutputStream
//			 : 사람이 보아서 알 수 없지만, 프로그램에서 Binary Data로 구성된 Stream(Binary file)
public class WriterEx1 {

	public static void main(String[] args) {
		// 파일 저장
		FileWriter fw = null;
		try {
			fw = new FileWriter("../../maven.txt");
			char[] arr = { 'a', 'b', 'c', 'd' };
			// 반복문장을 통한 arr 출력
			for (char c : arr) {
				System.out.println(c);
				fw.write(c);
			}

		} catch (IOException e) {
			System.out.println("파일을 출력할 수 없습니다.");
		} finally {
			try {
				fw.close();
			} catch (IOException e) {

			}
		}
		System.out.println("종료");

	}

}
