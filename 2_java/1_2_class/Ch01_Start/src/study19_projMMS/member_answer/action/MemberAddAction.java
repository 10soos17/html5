package study19_projMMS.member_answer.action;

import java.util.Scanner;

import study19_projMMS.member_answer.vo.Member;
import study19_projMMS.member_answer.util.ConsoleUtil;
import study19_projMMS.member_answer.svc.MemberAddService;


//7-1 회원등록 요청 처리하는 Action 클래스 구현 
public class MemberAddAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		
		//input값 받기 
		ConsoleUtil cu = new ConsoleUtil();
		Member newMember = cu.getNewMember(sc);
		//db처리 
		MemberAddService memberAddService = new MemberAddService();
		boolean isAddSuccess = memberAddService.addMember(newMember);
		//결과물 출력 
		if(isAddSuccess)
			cu.printAddSuccessMessage(newMember);
		else
			cu.printAddFailMessage(newMember);
		
	}

}
