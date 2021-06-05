package study09_exception;

import java.util.Scanner;

public class Mem_main0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원수 입력? ");
		Mem[] m = new Mem[sc.nextInt()];

		while (true) {
			System.out.println("번호입력하기? (1. 입력  2. 출력  3. 비만정도  4. 종료)");
			int sel = sc.nextInt();
			if (sel == 1) {
				System.out.println("[회원정보 입력]");
				for(int i=0;i<m.length;i++) {
					m[i] = new Mem();
					m[i].in();
				}
			} else if (sel == 2) {
				for(int i=0;i<m.length;i++) {
					m[i].prn();
				}
			} else if (sel == 3) {
				for(int i=0;i<m.length;i++) {
					System.out.println("차이값은?"+m[i].jung());
					System.out.println("---------------------");
				}
			} else if (sel == 4) {
				System.out.println("[종료]");
				break;

			}else {
				System.out.println("[다시선택하기]");
			}
		}

	}

}
