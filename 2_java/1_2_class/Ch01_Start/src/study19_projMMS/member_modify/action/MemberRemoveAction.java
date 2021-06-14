package study19_projMMS.member_modify.action;

import java.util.Scanner;

import study19_projMMS.member_modify.util.ConsoleUtil;
import study19_projMMS.member_modify.ui.MemberUI;
import study19_projMMS.member_modify.svc.MemberRemoveService;

//7-4 회원 정보 수정 요청을 처리하는 Action 클래스 구현
public class MemberRemoveAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {

		// input값 받기(삭제할 이름)
		ConsoleUtil cu = new ConsoleUtil();
		//String name = cu.getName("삭제할", sc);
		// db처리(삭제)
		MemberRemoveService memberRemoveService = new MemberRemoveService();
		boolean removeSuccess = memberRemoveService.removeMember(MemberUI.m.getName());
		// 결과물 출력
		if (removeSuccess) {
			cu.printRemoveSuccessMessage(MemberUI.m.getName());
		} else {
			cu.printRemoveFailMessage(MemberUI.m.getName());
		}
	}

}
