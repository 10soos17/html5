package p03_for_while_dowhile;

import java.io.IOException;

public class WhileKeyControlEx1 {
	// 3: JVMs
	public static void main(String[] args) throws IOException {// 2
		boolean run = true;
		int keyCode = 0;
		int speed = 0;

		while (run) {
			// 키보드 "Enter' 누르면: 코드값 10(Line Feed) + 13(Carriage Return) 동작
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("------------------");
				System.out.println("1.종속 2.감속 3.중지 ");
				System.out.println("------------------");
				System.out.println("------------------");
				System.out.println("선택: ");

			}

			keyCode = System.in.read();
			// System.out.println(keyCode);

			if (keyCode == 49) {// 키보드에서 1을 눌렀을 때 - 종속
				speed++;
				System.out.println("현재속도: " + speed);

			} else if (keyCode == 50) {// 키보드에서 2을 눌렀을 때 - 속
				speed--;
				System.out.println("현재속도: " + speed);
			}

			else if (keyCode == 51) {// 키보드에서 3을 눌렀을 때
				run = false;
			}
			System.out.println("프로그램 종료");
		}

	}

}
