package study05_member0;

import java.util.Scanner;

import study05_member.SearchService;

//이름으로 검색 예제
public class SearchMain0 {

	public static void main(String[] args) {
		// 객체 생성
		String name;
		boolean r = false;

		Scanner sc = new Scanner(System.in);
		SearchService0 ss = new SearchService0();
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
