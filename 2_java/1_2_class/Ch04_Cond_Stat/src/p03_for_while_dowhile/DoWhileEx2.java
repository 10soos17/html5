package p03_for_while_dowhile;

import java.util.Scanner;

public class DoWhileEx2 {

	public static void main(String[] args) {
		
		int input; //키보드 입력
		Scanner sc = new Scanner(System.in);
		
		int answer;//난수(
		answer = (int) (Math.random()*100)+1;//1~100
		
		
		do {
			System.out.println("1~100 정수 입력하세요?");
			input = sc.nextInt();
			if(input > answer)
			System.out.println("더 작은 수로 다시 시도해보세요.");
			else if(input <answer)
			System.out.println("더 큰수로 다시 시도해보세요.");
		}while(input != answer);
		System.out.println("정답입니다.");

	}

}
