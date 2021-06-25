package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// 데이터의 분류(대분류) : 숫자, 문자, 날짜

		{
			// 숫자를 문자로
			int a = 1;
			// String b = a + "";
			String b = String.valueOf(a);
		}

		{
			// 문자를 숫자로
			String a = "1234";
			int b = Integer.parseInt(a);

		}

		{
			// 날짜 타입
			int a = 0;
			Date d = new Date(a);
			System.out.println(d);

			// 날짜를 숫자로
			long b = d.getTime();
			System.out.println(d);
		}
		{
			// 숫자를 날짜로
			long a = System.currentTimeMillis(); // 프로그램 코드의 실행시간 확인할 때 많이 사용
			Date d = new Date(a);
			System.out.println(d);
		}
		{
			// 날짜를 문자로 ... 원하는 형태로?
			Date d = new Date();
			// String s = d.toGMTString();
			// String s = d.toString();
			SimpleDateFormat sdf = new SimpleDateFormat("yy.M.dd");
			String s = sdf.format(d);
			System.out.println(s);
		}

		{
			// 문자를 날짜로
			String s = "2021/06/12";
			Date d = new Date(s);
			System.out.println(d);
		}

		////////////////////////////////////
		// String ... 클래스API
		String str1 = "안녕하세요.반갑습니다.잘부탁드립니다.";
		// 글자 존재 유무
		if (str1.contains("안녕")) {

		}
		int i1 = str1.indexOf(".");
		int i2 = str1.lastIndexOf(".");

		System.out.println(i1 + "," + i2);
		// 시작이 "안녕"으로 시작하냐?
		if (str1.startsWith("안녕")) {
			System.out.println("-");
		}

		String str2 = str1.replaceAll(".", "/");
		String[] arr = str1.split(".");

	}

}
