package study19_projMMS.member_modify.action;

import java.util.Scanner;

import study19_projMMS.member_modify.util.ConsoleUtil;
import study19_projMMS.member_modify.svc.MemberAddService;
import study19_projMMS.member_modify.ui.MemberUI;


//7-1 회원등록 요청 처리하는 Action 클래스 구현
public class MemberAddAction implements Action {
	
	@Override
	public void execute(Scanner sc) throws Exception {

		//input값 받기
		ConsoleUtil cu = new ConsoleUtil();
		//Member newMember = cu.getNewMember(sc);
		//db처리
		MemberAddService memberAddService = new MemberAddService();
		boolean isAddSuccess = memberAddService.addMember(MemberUI.m);
		//결과물 출력
		if(isAddSuccess)
			cu.printAddSuccessMessage(MemberUI.m);
		else
			cu.printAddFailMessage(MemberUI.m);
		
	}

}
