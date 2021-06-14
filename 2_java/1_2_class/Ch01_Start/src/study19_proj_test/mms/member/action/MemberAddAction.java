package study19_proj_test.mms.member.action;

import study19_proj_test.mms.member.vo.Member;
import study19_proj_test.mms.member.ui.MemberUI;
import study19_proj_test.mms.member.svc.MemberAddService;

//7-1 회원등록 요청 처리하는 Action 클래스 구현 
public class MemberAddAction implements Action {

	@Override
	public void execute() throws Exception {

		MemberAddService mas = new MemberAddService();
		
		Member m = new Member(MemberUI.qList.get(0), MemberUI.qList.get(1), MemberUI.qList.get(2),
				MemberUI.qList.get(3), Integer.parseInt(MemberUI.qList.get(4)));

		mas.addMember(m);

	}

}
