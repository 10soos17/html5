package study09_exception;

import java.util.Scanner;

public class Mem_main {

	public static void main(String[] args) {
		boolean run = true;
		int res = -1;
		int totalMem = -1;

		String[] arr1 = { "님의 키?", "님의 몸무게?", "님의 나이?", "님의 전화번호 뒷자리?" };
		int[] arr2 = new int[4];
		int qNum = 0;
		String name;

		MemHashMap m = new MemHashMap();
		Scanner sc = new Scanner(System.in);

		// 0.시작
		while (run) {
			// 1.전체인원수 입력받기 루프(오류전까지)
			while (totalMem < 0) {

				System.out.println("회원 수 입력?\n");

				totalMem = memException.checkInt(sc.next());

				if (totalMem == -1) {
					sc = new Scanner(System.in);
				} else {
					break;
				}
			}
			// 2.전체인원수만큼 정보입력받기 루프(오류전, 전부 입력 받기 전까지)
			while (totalMem > 0) {

				System.out.println("[회원정보입력]");
				System.out.println("이름?");
				sc = new Scanner(System.in);
				name = sc.next();

				while (qNum < arr1.length) {
					System.out.println(name + arr1[qNum]);
					sc = new Scanner(System.in);

					if (qNum == 3) {
						res = memException.checkTelNo(sc.next());
					} else {
						res = memException.checkInt(sc.next());
					}

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
				res = -1;

			}

			// 3.user 선택값 받기 루프 (4번 입력 전까지)
			while (run) {
				while (res == -1) {
					System.out.println("번호 입력하기?(1.정보입력, 2.정보출력, 3.비만 정도 출력, 4.종료)");
					sc = new Scanner(System.in);
					res = memException.checkNum(sc.next());
				}

				run = m.prn(res);
				res = -1;

			}

		}
	}

}
