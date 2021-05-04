package p02_if_switch;

import java.util.Scanner;

public class IFEx1 {

	public static void main(String[] args) {

		int score = 30;
		if (score >= 90) {
			System.out.println("A");
			System.out.println("최고 등급입니다.");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		// Math.random():난수 얻기(0.0 ~ 0.99999999)
		int num = (int) (Math.random() * 6) + 1;

		System.out.println("----------------------------");

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		int y = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		int z = sc2.nextInt();

		if (y > x) {
			if (y < z) {
				System.out.println("y는 x보다 크고 z보다 작다.");
			} else {
				System.out.println("y는 x보다 크고 z보다 크다.");
			}
		} else {
			System.out.println("y는 x보다 작다.");
		}

	}

}
