package p02.datatype;

import java.util.Scanner;

public class DataTypeEx4 {

	public static void main(String[] args) {
		int intValue = 103029770;
		byte byteValue = (byte) intValue;
		System.out.println(byteValue);
		
		intValue = 10;
		byteValue = (byte) intValue;
		System.out.println(byteValue);
		
		//키보드 입력한 것 받는 Scanner Class
		//System.in : 키보드 입력
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt(); //입력
		System.out.println("문자열 저장하지 않고 곧바로 출력: " + sc.next());//입력
		
		//상수 : 프로그램이 끝날 때까지 초기값 유지
		System.out.println("byte의 고정상수 : " + Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		if(i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
			System.out.println("byte타입으로 변환할 수 없습니다. 형변환 불가");
		}else {
			System.out.println("형변환 가능: ");
			byte b = (byte) i; // 형변환 가능
			System.out.println(b);
			
		}
			
	}

}
