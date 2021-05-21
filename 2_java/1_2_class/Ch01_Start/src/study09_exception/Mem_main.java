package study09_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mem_main {

	public static void main(String[] args) {
		boolean run = true;
		Integer qNum = 0;
		int res = -1;
		int totalMem = -1;
		String name;

		String[] arr1 = { "님의 키?", "님의 몸무게?", "님의 나이?", "님의 전화번호 뒷자리?" };
		int[] arr2 = new int[4];

		Mem m = new Mem();
		Scanner sc = new Scanner(System.in);

		while (run) {
			while (totalMem < 0) {

				System.out.println("회원 수 입력?\n");

				totalMem = checkInfo(sc.next());
				if (totalMem == -1) {
					sc = new Scanner(System.in);
				} else {
					break;
				}
			}

			while (totalMem > 0) {

				System.out.println("[회원정보입력]");
				System.out.println("이름?");
				sc = new Scanner(System.in);
				name = sc.next();

				while (qNum < arr1.length) {
					System.out.println(name + arr1[qNum]);
					sc = new Scanner(System.in);
					res = checkInfo(sc.next());
					if (res == -1) {
						// System.out.println("false");
						sc = new Scanner(System.in);
					} else {
						System.out.println("true" + res);
						arr2[qNum] = res;
						qNum += 1;
					}

				}
				qNum = 0;
				m.in(name, arr2);
				totalMem -= 1;

			}
			
			res = -1;
			while (run) {
				while (res == -1) {
					System.out.println("번호 입력하기?(1.정보입력, 2.정보출력, 3.비만 정도 출력, 4.종료)");
					sc = new Scanner(System.in);
					res = checkNum(sc.next());
				}

				run = m.prn(res);
				res = -1;

			}

		}
	}

	public static int checkInfo(String n) {// 2
		int i;

		try {
			i = Integer.valueOf(n);
			if (i < 0) {
				return -1;
			}
			return i;

		} catch (Exception e) {
			return -1;
		}

	}

	public static int checkNum(String n) {// 2
		int i;

		try {
			i = Integer.valueOf(n);
			if (i > 4 || i < 0) {
				return -1;
			}
			return i;

		} catch (Exception e) {
			return -1;
		}
	}
}
