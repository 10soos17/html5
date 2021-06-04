package study15_memberVO_ActionInterface;

import java.util.List;
import java.util.Scanner;

public class MemberMain {
	static MemberVO[] memebers;

	public static void main(String[] args) {
		MemberService ms = new MemberService();
		AddAction aAct = new AddAction();
		ListAction lAct = new ListAction();
		UpdateAction uAct = new UpdateAction();
		DeleteAction dAct = new DeleteAction();
		Scanner sc = new Scanner(System.in);
		boolean isStop = false;

		int select;

		do {

			System.out.println("[다음 메뉴 중 하나를 입력하세요.]");
			System.out.println("1.회원 가입 2.회원 목록 보기 3. 회원 정보 수정 4. 회원 삭제 5. 종료");
			select = sc.nextInt();

			switch (select) {

			case 1:
				ms.process(aAct, sc);
				break;

			case 2:
				ms.process(lAct, sc);
				break;
			case 3:
				List key = ms.getProcess(uAct, sc);
				System.out.println(key);
				aAct.update(key, sc);
				break;
			case 4:
				ms.process(dAct, sc);
				break;

			case 5:
				isStop = !isStop;

			}

		} while (!isStop);
	}

}
