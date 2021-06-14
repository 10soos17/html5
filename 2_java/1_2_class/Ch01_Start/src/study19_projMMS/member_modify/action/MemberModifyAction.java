package study19_projMMS.member_modify.action;

import java.util.Scanner;

import study19_projMMS.member_modify.ui.MemberUI;
import study19_projMMS.member_modify.util.ConsoleUtil;
import study19_projMMS.member_modify.svc.MemberModifyService;

//7-3 회원 정보 수정 요청을 처리하는 Action 클래스 구현
public class MemberModifyAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		
//		// input값 받기(수정할 이름)
		ConsoleUtil cu = new ConsoleUtil();
//		String name = cu.getName("수정할", sc);
//		// db처리(불러오기)
		MemberModifyService memberModifyService = new MemberModifyService();
//		Member oldMember = memberModifyService.getOldMember(name);
//		// input값 받기(수정할 정보들)
//		Member updateMember = cu.getUpdateMember(sc, oldMember);
		// db처리(수정)
		boolean isModifySuccess = memberModifyService.modifyMember(MemberUI.m);
		//System.out.println(MemberUI.m.getName());
		// 결과물 출력
		if (isModifySuccess)
			cu.printModifySuccessMessage(MemberUI.m);
		else
			cu.printModifyFailMessage(MemberUI.m);

	}

	
}
