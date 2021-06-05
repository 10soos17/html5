package study15_1memberVO_ActionInterface;

import java.util.List;
import java.util.Scanner;

public class DeleteAction implements Action {

	@Override
	public List getExecute(Scanner sc) {
		return null;
	}

	@Override
	public void execute(Scanner sc) {
		System.out.println("삭제할 이름을 입력하세요.");
		String name = sc.next();

		for (List l : MemberVO.hMap.keySet()) {
			if (l.get(0).equals(name)) {
				deleteMember(l);
			} else {
				System.out.println("삭제할 회원이 존재하지 않습니다.");
			}
		}
	}

	private void deleteMember(List key) {
		MemberVO.hMap.remove(key);
		System.out.println("삭제되었습니다.");

	}

}


