package study15_2memberVO_ActionInterface;

import java.util.Scanner;

public class DeleteAction implements Action {

	@Override
	public void execute(Scanner sc) {
		while (true) {
			System.out.println("삭제할 이름을 입력하세요.");
			String name = sc.next();
			try {
				deleteMember(name);
				return;
			} catch (Exception e) {
				System.out.println("input error! retry!");
				sc.next();
			}
		}

	}

	private void deleteMember(String name) {

		for (MemberVO m : MemberMain.members) {
			if (m.getName().equals(name)) {
				MemberMain.members.remove(m);
				break;
			} else {
				System.out.println("삭제할 회원이 존재하지 않습니다.");
			}
		}

	}

}
