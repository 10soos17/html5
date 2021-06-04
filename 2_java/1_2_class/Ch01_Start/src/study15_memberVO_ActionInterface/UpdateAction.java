package study15_memberVO_ActionInterface;

import java.util.List;
import java.util.Scanner;

public class UpdateAction implements Action {

	@Override
	public void execute(Scanner sc) {
	}

	@Override
	public List getExecute(Scanner sc) {
		System.out.println("수정할 이름을 입력하세요.");
		String name = sc.next();

		for (List l : MemberVO.hMap.keySet()) {
			// System.out.println(MemberVO.hMap.get(l));
			if (l.get(0).equals(name)) {
				List key = getUpdateMember(l);
				return key;
			} else {
				System.out.println("수정할 회원이 존재하지 않습니다.");
			}
		}

		return null;
	}

	private List getUpdateMember(List key) {
		System.out.println(key);
		return key;

	}

}
