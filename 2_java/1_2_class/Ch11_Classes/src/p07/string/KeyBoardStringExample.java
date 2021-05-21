package p07.string;

import java.io.IOException;

public class KeyBoardStringExample {

	public static void main(String[] args) throws IOException {
//		byte[] bytes = new byte[100];
//		System.out.println("입력: ");
//		int readByteNo = System.in.read(bytes);
//		String str = new String(bytes, 0, readByteNo-2);// 길이에서 제외(\r,\n)
//		System.out.println(readByteNo);
//		System.out.println(str.length());

		// 숫자 => 문자열
		int ival = 100;
		String str1 = String.valueOf(ival);
		System.out.println(str1);

		double dval = 200.0;
		String str2 = dval + "";
		System.out.println(str2);

		// 문자열 => 숫자
		double sum = Integer.parseInt(str1) + Double.parseDouble(str2);
		System.out.println(sum);
		double sum2 = Integer.valueOf(str1) + Double.valueOf(str2);
		System.out.println(sum2);
		
		String s1 = "abcd efg  ";
		String s2 = s1.trim();//양쪽 공백 제거 
		System.out.println(s2);
		System.out.println(s2.replace('a','k'));
		System.out.println(s2);
	}

}
