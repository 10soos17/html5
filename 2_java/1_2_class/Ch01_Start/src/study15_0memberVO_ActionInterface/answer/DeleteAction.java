package study15_0memberVO_ActionInterface.answer;

import java.util.Scanner;

//4. 회원정보 삭제 
public class DeleteAction implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.println("삭제할 이름을 입력하세요.");
		System.out.println("이름: ");
		String name = sc.next();

		deleteMember(name);
	}

	private void deleteMember(String name) {// 삭제할 이름
		int deleteIndex = -1;
		MemberVO[] members = MemberMain.members;// 회원가입한 배열 정보
		MemberVO[] temp = null;

		for (int i = 0; i < MemberMain.members.length; i++) {
			if (members[i].getName().contentEquals(name)) {
				deleteIndex = i;
			}
		}
		if (deleteIndex == -1) {
			System.out.println("회원정보가 들어있지 않습니다.");
			return;
		}
		// 배열의 회원정보가 있는 경우 - 삭제작업
		if (members.length >= 1) {
			temp = new MemberVO[members.length - 1];// 삭제가 된 후 배열 저장이므로 -1
			for (int i = 0; i < members.length; i++) {
				if (i == deleteIndex)
					continue;// 통과
				else if (i > deleteIndex) {
					temp[i - 1] = members[i];// 해당 배열에 삭제가 된 곳을 찾아서 뒤에 있는 배열 넣기
				}
				temp[i] = members[i];// 삭제할 배열 앞에 있는 배열들은 그대로 저장 temp에 저장
			}
		}
		MemberMain.members = temp;// static에 최신 배열을 저장
	}

}
