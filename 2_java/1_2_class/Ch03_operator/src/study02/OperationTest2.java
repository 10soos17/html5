package study02;

import java.util.Scanner;

public class OperationTest2 {
	//총점, 평균 구하기 예제 
	public static void main(String[] args) {
		
		int total = 0;
		int avg = 0;

		int kor = Integer.parseInt(args[0]);
		int mat = Integer.parseInt(args[1]);
		int eng = Integer.parseInt(args[2]);
		
		total = kor + mat + eng;
		avg = total /3;
		
		System.out.println("total = " + total);
		System.out.println("avg = " + avg);
		
		//2.scanner 
		int total2 = 0;
		int avg2 = 0;
		
		Scanner sc = new Scanner(System.in);
		int kor2 = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		int mat2 = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		int eng2 = sc2.nextInt();
		
		total2 = kor2 + mat2 + eng2;
		avg2 = total /3;
		
		
		System.out.println("total2 = " + total2);
		System.out.println("avg2 = " + avg2);
	}

}
