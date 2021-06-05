
package study11_weatherApp.answer;

import java.util.Scanner;

import study09_exception.memException;

public class WeaMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WeaCon con = new WeaCon();
		con.inPut();//날씨 배열 저장 
		while (true) {
			System.out.println("1.날씨 검색  2.종료");
			int sel = sc.nextInt();
			if (sel == 1) {
				System.out.println("도시명 입력: ");
				String name = sc.next();
				con.search(name);
			} else {
				System.out.println("종료");
				break;
			}
		}
	}

}
