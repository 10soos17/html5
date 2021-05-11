package study05_member;

import java.util.Scanner;

//이름으로 검색 예제
public class SearchMain {

	public static void main(String[] args) {
		// 객체 생성
		String name;
		boolean r = false;
		SearchService ss = new SearchService();

		Scanner sc = new Scanner(System.in);
		// 입력

		do {
			System.out.println("검색할 회원 이름을 입력하세요.");
			name = sc.next();
			r = ss.searchMember(name);
			if(!r) {
				System.out.println("해당 회원이 없습니다.");
				break;
			}
			
		} while (true);

		sc.close();
	}

}
