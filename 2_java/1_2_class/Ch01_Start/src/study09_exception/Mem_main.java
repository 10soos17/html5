package study09_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mem_main {

	public static void main(String[] args) {
		boolean run = true;
		int total;
		Integer num = 4;
		String[] arr1 = { "님의 키?", "님의 몸무게?", "님의 나이?", "님의 전화번호 뒷자리?" };
		String name;
		int inputValue = -1;
		int[] arr2 = new int[4];

		Mem m = new Mem();
		Scanner sc = new Scanner(System.in);
		System.out.println("회원 수 입력?\n");

		while (run) {
			try {
				total = sc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("올바른 숫자를 입력해주세요.");
				sc = new Scanner(System.in);
				total = sc.nextInt();
			} catch (Exception e) {
				System.out.println("올바른 숫자를 입력해주세요.");
				sc = new Scanner(System.in);
				total = sc.nextInt();
			}

			while (total > 0) {

				System.out.println("[회원정보입력]");
				System.out.println("이름?");
				sc = new Scanner(System.in);
				name = sc.next();

				while (num > 0) {
					System.out.println(name + arr1[4 - num]);
					sc = new Scanner(System.in);
					inputValue = checkInfo(sc.next());
					if (inputValue == -1) {
						// System.out.println("false");
						sc = new Scanner(System.in);
					} else {
						System.out.println("true" + inputValue);
						arr2[4 - num] = inputValue;
						num -= 1;
					}

				}
				num = 4;
				m.in(name, arr2);
				total -= 1;

			}
			inputValue = -1;
			while (run) {
				while (inputValue == -1) {
					System.out.println("번호 입력하기?(1.정보입력, 2.정보출력, 3.비만 정도 출력, 4.종료)");
					sc = new Scanner(System.in);
					inputValue = checkNum(sc.next());
				}

				run = m.prn(inputValue);
				inputValue = -1;

			}

		}
	}

	public static int checkInfo(String n) {// 2
		int i;

		try {
			i = Integer.valueOf(n);
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
