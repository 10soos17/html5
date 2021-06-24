package p1;

import java.util.ArrayList;

public class Test7 {

	public static void main(String[] args) {

//		// 반복 ...
//		int a = 10;
//		while (a < 20) {
//			System.out.println("야호" + a);
//			a++;
//		}
//		
//		
//		int xxx = 10;
//		for (; xxx < 20; xxx++) {
//			System.out.println("야호" + xxx);
//		}
//		//int xxx = 20;
//		System.out.println(xxx);
//		
		// https://blog.naver.com/s001lec/222406368567
		// ex1.for문으로 "안녕하세요" 5번출력
		System.out.println("========ex1=======");
		String str = "안녕하세요";
		for (int a = 0; a < 5; a++) {
			System.out.println("ex1: " + str);
		}
		int sum1 = 0;
		// ex2.
		System.out.println("========ex2=======");
		for (int a = 1; a < 77; a++) {
			sum1 += a;
			// System.out.println(sum1);
		}

		System.out.println(sum1);

		// ex3.
		System.out.println("========ex3=======");
		for (int j = 1; j < 10; j++) {
			System.out.println(7 + " * " + j + " = " + 7 * j);
		}

		// ex4.
		System.out.println("========ex4=======");
		for (int i = 2; i < 10; i++) {
			if (i == 7 || i == 6) {
				continue;
			}
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}

		// ex5.
		System.out.println("========ex5=======");
		int sum5 = 0;
		for (int i = 1; i < 201; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum5 += i;
				// System.out.println(sum5+":i="+i);
			}
		}
		System.out.println(sum5);

		// ex6.
		System.out.println("========ex6=======");
		int sum6 = 0;
		for (int i = 1; i < 1001; i++) {
			if (i % 3 == 0) {
				sum6 += i;
				// System.out.println("i:"+i);
			}
		}
		System.out.println(sum6);

		// ex7.
		// 자연수 1부터 시작해서 모든 홀수와 3의 배수인 짝수를 더해 나간다.
		// 그 합이 언제(몇을 더했을 때) 1000을 넘어서는지 ,
		// 그리고 1000을 넘어선 값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성해 보자.
		System.out.println("========ex7=======");
		int sum7 = 0;
		int p;
		int count = 0;
		for (int i = 1; i < 1001; i++) {
			if (i % 2 != 0 || i % 3 == 0) {
				sum7 += i;
				//System.out.println("i:" + i);
				if (sum7 >= 1000 && count == 0) {
					p = i;
					count = sum7;
					//System.out.println("1000: " + p + ", sum:" + count);
				}
			}
		}
		System.out.println(sum7);

		// ex8.
		System.out.println("========ex8=======");
		int sum8 = 0;
		int number = 0;
		while (sum8 <= 100) {
			number += 1;
			if (number % 2 == 0) {
				// System.out.println(number);
				sum8 -= number;
			} else {
				sum8 += number;
			}
		}
		System.out.println(number + ":" + sum8);

		// ex9.
		System.out.println("========ex9=======");
		int sum9 = 0;
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < i + 1; j++) {
				sum9 += j;
				//System.out.println("j" + j + "sum" + sum9);
			}
		}
		System.out.println("0번째: "+sum9);
		
		//---answer
		//1. 정석 
		sum9 = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				sum9 += j;
				//System.out.println("j" + j + "sum" + sum9);
			}
		}
		System.out.println("1번째: "+sum9);
		//2. 변수의 적절한 활용법 - 가장 효율적인 방법 
		int tempSum9 =0;
		sum9=0;
		for(int x=1;x<=10;x++) {
			tempSum9+=x;
			sum9 += tempSum9;
		}
		System.out.println("2번째: "+sum9);
		//3. 문제 재해석?
		sum9 = 0;
		for(int x = 1; x<=10;x++) {
			sum9 += x * (11 - x);
		}
		System.out.println("3번째: "+sum9);
		
		
		// ex10.
		System.out.println("========ex10=======");
		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 2; i < 864; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0 && j == i) {
					arr.add(i);
				}
				if (i % j == 0) {
					// System.out.println(i+":"+j);
					break;
				}
			}

		}
		System.out.println(arr);

		// ex11.
//		System.out.println("========ex11=======");
//		int a11 = 0;
//		int b11 = 1;
//		int c11 = 1;
//		for (int i = 1; i < 9; i++) {
//			a11 = b11;
//			b11 = c11;
//			c11 = a11 + b11;
//			System.out.println("c11:"+c11);
//
//		}
//		System.out.println("10th:" + c11);

//		int sum11 = 0;
//		int sum111 =1;
//		for (int i = 1; i < 11; i++) {
//			sum11+=
//			for() {
//				sum111+=sum11;
//			}
//			
//
//		}
		// ex12.
		// ex12_1.valueOf() -> charAt()
		System.out.println("========ex12=======");
		int count12 = 0;
		for (int i = 1; i < 10000; i++) {
			String str12 = String.valueOf(i);
			for(int j = 0; j < str12.length(); j++) {
				//System.out.println(str12);
				//System.out.println(str12.charAt(j));
				if(str12.charAt(j) == '8') {
					count12++;
				}
				
			}
		}
		System.out.println(count12);
		
//		ex12_2. valueOf() -> split
//		System.out.println("========ex12=======");
//		int count12 = 0;
//		for (int i = 1; i < 10000; i++) {
//			String str12 = String.valueOf(i);
//			System.out.println(arr12.length+":"+arr12[arr12.length-1]);
//			for (int j = 0; j < arr12.length; j++) {
//				if (arr12[j].equals("8")) {
//					//System.out.println(i);
//					count12 += 1;
//					// System.out.println(arr12[j]);
//				}
//			}
//		}
//		System.out.println(count12);
		
//		int ccount =0;
//		for(int i=1; i < 10000; i++) {
//			String s = String.valueOf(i);
//			if(s.contains("8")) {
//				//System.out.println(s);
//				ccount++;
//			}		
//		}
		//System.out.println(ccount);
		
	}
}