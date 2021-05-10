package study03;

import java.util.Scanner;

public class SchoolMain {
	// 프로그램 시작
	public static void main(String[] args) {

		Teacher te = new Teacher();// 기본생성자
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. 학생정보 입력");
			System.out.println("2. 학생총점 출력");
			System.out.println("3. 학생편균 출력");
			System.out.println("4. 종료");
			System.out.println();

			int select = sc.nextInt();

			if (select == 1) {
				te.inPut();
			} else if (select == 2) {
				te.sum();
			} else if (select == 3) {
				te.avg();
			} else {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
		
		sc.close();

	}

}
