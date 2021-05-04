package p02_if_switch;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		//키보드 입력을 받아서
		//'A', 'a' : 사과
		//'P', 'p' : 배
		//'G', 'g' " 포도
		//그 나머지는 "?" 출력 
		
		//hasNext() / next() / nextInt() / close()
		System.out.println("과일 문자를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		char c = sc. next().charAt(0);

		
		switch(c) {
		case 'A':
		case 'a': System.out.println("사과");break;
		case 'P':
		case 'p': System.out.println("배");break;
		case 'G':
		case 'g': System.out.println("포도");break;
		
		default: System.out.println("?");; break;
		}
		
		System.out.println("종료");
		sc.close();
	}

}
