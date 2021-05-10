package exercise;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores =  null;
		Scanner sc = new Scanner(System.in);
		
		int max=0;
		int sum=0;
		double avg = 0;
		
		while(run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료 ");		
			System.out.println("----------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {

				System.out.println("학생수> ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
				
			}else if(selectNo == 2) {
				int i = 0;

				while(studentNum > 0) {
					System.out.print("scores["+i+"]> ");
					scores[i] = sc.nextInt();
					i+=1;
					studentNum-=1;
				}
			}else if(selectNo == 3) {
				for(int i=0;i<scores.length;i++) {
					System.out.println("scores["+i+"]> " + scores[i]);
				}
				
			}else if(selectNo == 4) {
				for(int i : scores) {
					if(i > max) {
						max = i;
					}
					sum+= i;
				}
				avg = (double)sum/scores.length;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			}else if(selectNo == 5) {
				run = false;
			}
			
			
		}
		System.out.println("프로그램 종료");
	}
}
