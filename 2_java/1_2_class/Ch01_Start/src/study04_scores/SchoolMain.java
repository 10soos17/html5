package study04_scores;

import java.util.Scanner;

public class SchoolMain {

	public static void main(String[] args) {

		boolean run = true;
		String msg = "";

		String name = "";
		int[] scores = new int[3];
		int sum = 0;
		double avg = 0;

		Teacher t = new Teacher();

		Scanner sc = new Scanner(System.in);

		while (run) {

			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 총점 출력");
			System.out.println("3. 학생 평균 출력");
			System.out.println("4. 프로그램 종료");

			System.out.println("선택");
			int number = sc.nextInt();

			switch (number) {
			
			case 1:
				System.out.println("학생 이름 입력: ");
				name = sc.next();
				System.out.println(name + "의 국어 점수");
				scores[0] = sc.nextInt();
				System.out.println(name + "의 영어 점수");
				scores[1] = sc.nextInt();
				System.out.println(name + "의 수학 점수");
				scores[2] = sc.nextInt();

				t.inPut(name, scores);

				System.out.println("======== 입력 완료 ========");
				break;

			case 2:
				System.out.println("학생 이름 입력: ");
				name = sc.next();

				msg = t.infoCheck(name);

				if (msg != name) {
					System.out.println("학생 정보가 없습니다.");
					break;

				} else {
					sum = t.add(name);
					System.out.println(name + "총점: " + sum);
					break;
				}

			case 3:
				System.out.println("학생 이름 입력: ");
				name = sc.next();
				msg = t.infoCheck(name);

				if (msg != name) {
					System.out.println("학생 정보가 없습니다.");
					break;

				} else {
					avg = t.avg(name);
					System.out.println(name + "평균: " + avg);
					break;
				}

			case 4:
				System.out.println("프로그램 종료");
				run = false;

			}
	
		}

	}

}
