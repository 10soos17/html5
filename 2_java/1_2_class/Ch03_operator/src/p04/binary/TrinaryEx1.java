package p04.binary;

import java.util.Scanner;

public class TrinaryEx1 {

	//Main()은 JVM(자바가상머신)이 호출해서 사용(실행)
	
	public static void main(String args[]) {
		System.out.println("String[] : "+args[0]);
		System.out.println("String[] : "+args[1]);
		System.out.println("String[0]+String[1] : "+(args[0] + args[1]));
	
		int result1 = Integer.parseInt(args[0]); //String -> int
		int result2 = Integer.parseInt(args[1]);
		int result3 = result1 + result2;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		

		int result4 = Integer.valueOf(args[0]);
		System.out.println(result4);
		
		//배열의 첫번째 수를 받아서 삼항연산자를 이용한 짝수 홀수를 출력하기
		String msg = ((result1%2 == 0) ? "짝수" : "홀수");
		System.out.println(result1 + "은 " + msg+"입니다.");

		//배열의 첫번째 수를 받아서 삼항연산자를 이용한 짝수 홀수를 출력하기
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		System.out.println(s);
		
		String msg2 = ((s%2 == 0) ? "짝수" : "홀수");
		System.out.println(s + "은 " + msg2+"입니다.");
		
		

		
	}

}
