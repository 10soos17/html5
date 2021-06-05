package study15_2memberVO_ActionInterface;

import java.util.Scanner;

public class UpdateAction implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.println("수정할 이름을 입력하세요.");
		String name = sc.next();
		getUpdateMember(sc, name);

	}

	private void getUpdateMember(Scanner sc, String name) {

		for (MemberVO m : MemberMain.members) {

			if (m.getName().equals(name)) {

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
				return;
			}

		}

		System.out.println("수정할 회원이 존재하지 않습니다.");

	}

}
