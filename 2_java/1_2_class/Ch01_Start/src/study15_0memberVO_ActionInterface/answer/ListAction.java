package study15_0memberVO_ActionInterface.answer;

import java.util.Scanner;

//2. 회원목록 보기 
public class ListAction implements Action {

	@Override
	public void execute(Scanner sc) {
		MemberVO[] members = MemberMain.members;// 회원가입 배열
		if (members.length >= 1) {
			for (int i = 0; i < members.length; i++) {
				System.out.println("이름: " + members[i].getName() + "나이: " + members[i].getAge() + "국가: "
						+ members[i].getNation() + "전화번호: " + members[i].getTel() + "이메일: " + members[i].getEmail());
			}

		} else {
			System.out.println("회원 정보가 존재하지 않습니다.");
		}

	}
}
