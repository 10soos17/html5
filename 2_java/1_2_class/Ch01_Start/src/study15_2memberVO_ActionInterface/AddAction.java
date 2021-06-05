package study15_2memberVO_ActionInterface;

import java.util.Scanner;

public class AddAction implements Action {
	MemberVO m;

	@Override
	public void execute(Scanner sc) {
		m = new MemberVO();
		System.out.println("등록할 회원의 정보를 입력하새요.");
		System.out.println("이름: ");

		m.setName(sc.next());

		while (true) {
			try {
				System.out.println("나이: ");
				m.setAge(sc.nextInt());
				break;

			} catch (Exception e) {
				System.out.println("age input error! retry!");
				sc.next();
			}
		}

		System.out.println("이메일: ");
		m.setEmail(sc.next());
		System.out.println("국가: ");
		m.setNation(sc.next());
		System.out.println("전화 번호: ");
		m.setTel(sc.next());

		addMember(m);

	}

	private void addMember(MemberVO member) {
		MemberMain.members.add(member);
	}

}
