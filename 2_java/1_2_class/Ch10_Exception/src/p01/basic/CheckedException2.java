package p01.basic;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class CheckedException2 {

	public static void main(String[] args) {

		method();

	}

	static void method() {

		try {
			FileReader reader = new FileReader("some.txt");
			reader.close();

		} catch (FileNotFoundException e) {
			System.out.println("파일 없음");
		}
		catch (IOException e) {
			System.out.println("입출력 에러");
		}finally {
			System.out.println("정상적인 실행");
		}
		System.out.println("종료");
	}

}
