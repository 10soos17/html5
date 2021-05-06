package exerxise;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		boolean run = true;
		int balance =0;
		int answer = 0;
		
		while(run) {
			
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.println("선택 >");
			Scanner sc = new Scanner(System.in);
			answer = sc.nextInt();

			
			switch(answer) {
				case 1:
					
					System.out.println("선택 > "+answer);
					System.out.println("예금액입력");
					Scanner sc2 = new Scanner(System.in);
					balance += sc2.nextInt();
					System.out.println("예금액 > "+balance);
					break;
					
				case 2:
					System.out.println("선택 > "+answer);
					System.out.println("출금액입력");
					Scanner sc3 = new Scanner(System.in);
					balance -= sc3.nextInt();
					System.out.println("출금액 > "+balance);
					break;
				case 3:
					System.out.println("선택 > "+answer);
					System.out.println("잔고 > "+balance);
					break;
				case 4:
					
				default:
					System.out.println("선택 > "+answer);
					System.out.println("프로그램 종료");
					run = false;
					break;
			}
					
		}
	}
	

}
