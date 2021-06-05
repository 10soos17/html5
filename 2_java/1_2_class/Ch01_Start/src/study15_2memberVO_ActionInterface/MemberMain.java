package study15_2memberVO_ActionInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
	static ArrayList<MemberVO> members = new ArrayList<>();

	public static void main(String[] args) {
		MemberService ms = new MemberService();
		Action act;
		Scanner sc = new Scanner(System.in);
		boolean isStop = false;

		int select;

		do {

			try {
				System.out.println("[다음 메뉴 중 하나를 입력하세요.]");
				System.out.println("1.회원 가입 2.회원 목록 보기 3. 회원 정보 수정 4. 회원 삭제 5. 종료");
				select = sc.nextInt();
				System.out.println(select);

				switch (select) {

				case 1:
					act = new AddAction();
					ms.process(act, sc);
					break;
				case 2:
					act = new ListAction();
					ms.process(act, sc);
					break;
				case 3:
					act = new UpdateAction();
					ms.process(act, sc);
					break;
				case 4:
					act = new DeleteAction();
					ms.process(act, sc);
					break;
				case 5:
					isStop = !isStop;
				}

			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Wrong Choice. retry!");
				sc.next();
			}

		} while (!isStop);
	}

}
