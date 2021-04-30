package p04.binary;

import java.util.Scanner;

public class OperatorEx {

	public static void main(String[] args) {
		//문자를 키보드 입력 받아서 받은 문자가 숫자(0~9)이면 "입력하신 문자가 숫자입니다." 출력하기
		//							영문자(a~z,A~Z)이면 "입력하신 문자는 영문자입니다." 출력하기
		
		System.out.println("입력:");
		
		Scanner sc = new Scanner(System.in);
		char i = sc.next().charAt(0); //입력
		int i2 = i;
		
		System.out.println(i);
		System.out.println(i2);
		
		if(48 <= i2 && i2 < 57) {
			System.out.println("입력하신 문자가 숫자입니다.");
		}else if((65 <= i2 && i2 <= 90) ||(97 <= i2 && i2 <= 122)) {
			System.out.println("입력하신 문자가 영문자입니다.");
		}else {
			System.out.println("입력하신 문자가 숫자나 영문자가 아닙니다.");
		}

		System.out.println("입력2:");
		String input = sc.next();
		
		char c = input.charAt(0);
		System.out.println(c);
		if('0' <= c && c <= '9') {
			System.out.println("입력하신 문자가 숫자입니다.");
		}
		if(('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) {
			System.out.println("입력하신 문자가 영문자입니다.");
		}
	}

}
