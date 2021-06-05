package study13_login;

import java.util.Scanner;

public class Jumsu {
	static Student std = new Student();

	public static void main(String[] args) {
		boolean idCheck = true;
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		
		while (idCheck) {

			System.out.println("0. 계정 생성");
			System.out.println("1. 로그인");
			int select = sc.nextInt();

			if (select == 0) {
				idCheck = std.makeId();
				check = std.checkIdPw();
				idCheck = false;

			} else if (select == 1) {
				check = std.checkIdPw();
				idCheck = false;
			}
		}

		while (check) {

			// System.out.println(check);

			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 총점 출력");
			System.out.println("3. 학생 평균 출력");
			System.out.println("4. 프로그램 종료");

			int select = sc.nextInt();

			if (select == 1) {
				std.Info();
			} else if (select == 2) {
				std.getSum();
			} else if (select == 3) {
				std.getAvg();
			} else {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
		System.out.println("로그인 실패");

	}

}
