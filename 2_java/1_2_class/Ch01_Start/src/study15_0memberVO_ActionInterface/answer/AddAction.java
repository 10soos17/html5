package study15_0memberVO_ActionInterface.answer;

import java.util.Scanner;

public class AddAction implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.println("등록할 회원정보를 입력하세요.");
		System.out.println("이름: ");
		String name = sc.next();
		System.out.println("나이: ");
		Integer age = sc.nextInt();
		System.out.println("이메일: ");
		String email = sc.next();
		System.out.println("국가: ");
		String nation = sc.next();
		System.out.println("전화 번호: ");
		String tel = sc.next();

		MemberVO m = new MemberVO(age, name, tel, email, nation);

		addMember(m);

	}

	private void addMember(MemberVO member) {

		MemberVO[] temp = new MemberVO[MemberMain.members.length + 1];
		for (int i = 0; i < MemberMain.members.length; i++) { // 길이가 1
			temp[i] = MemberMain.members[i];

		}
		temp[temp.length - 1] = member; // MemberVO를 배열의 첫번째에 저장
		MemberMain.members = temp; // 0->1
	}

}
