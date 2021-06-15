package study19_projMMS.member_modify.action;

import java.util.Scanner;
import java.util.ArrayList;

import study19_projMMS.member_modify.vo.Member;
import study19_projMMS.member_modify.util.ConsoleUtil;
import study19_projMMS.member_modify.svc.MemberListService;

//7-2 회원등록 보기 요청 처리하는 Action 클래스 구현
public class MemberListAction implements Action {
	
	@Override
	public void execute(Scanner sc) throws Exception {
		
		//db처리
		MemberListService memberListService = new MemberListService();
		ArrayList<Member> memberList = memberListService.getMemberList();
		//결과값 출력
		ConsoleUtil cu = new ConsoleUtil();
		cu.printMemberList(memberList);
		
	}

}
