package p03_for_while_dowhile;

import java.util.Scanner;

public class DoWhileEx1 {
//do~while : 반드시 한번은 실행
	public static void main(String[] args) {
		
		System.out.println("메시지 입력하기?");
		System.out.println("프로그램 종료하려면 q를 눌러주세요");
		
		Scanner sc = new Scanner(System.in);
		String s;
		do {
		   s = 	sc.nextLine();
		   System.out.println(s);
		} while (!s.equals("q"));
		System.out.println("종료");
	}

}
