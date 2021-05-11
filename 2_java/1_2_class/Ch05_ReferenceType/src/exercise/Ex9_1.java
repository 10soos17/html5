package exercise;

import java.util.Scanner;

public class Ex9_1 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int max = 0;
		int sum = 0;
		double avg=0;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료 ");
			System.out.println("----------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = sc.nextInt();
			if (selectNo == 1) {
				System.out.println("학생수(3명)>");
				studentNum = sc.nextInt();
				scores = new int[studentNum];// 학생수=배열의 크기

			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]>");
					scores[i] = sc.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]>" + scores[i]);
				}
			} else if (selectNo == 4) {
				for (int i = 0; i < scores.length; i++) {
					//if(scores[i] > max)max = scores[i];
					max = (scores[i] > max)? scores[i] : max; //삼항 연산자 
					sum +=scores[i];
				}
				avg =(double)sum / studentNum;
				System.out.println("최고점수: " + max);
				System.out.println("최고점수: " + avg);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("Done");
	}
}
