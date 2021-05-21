package p05.system;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemEx1 {

	public static void main(String[] args) {
		// [출력] : SPRING
		// 입력된 문자: S
		// 입력된 문자: P
		// 입력된 문자: R
		// 입력된 문자: I
		// 입력된 문자: N
		// 입력된 문자: G
		// 입력된 문자: . -> 종료
		InputStreamReader reader = new InputStreamReader(System.in);

		try {
			while (true) {

				char ch = (char) reader.read();
				System.out.println("입력된 문자: " + ch);

				if (ch == '.') {
					break;
					// System.exit(0);
				}
			}
		} catch (IOException e) {
			System.out.println("키보드 입력 에러");

		}
		System.out.println("Done");

	}

}
