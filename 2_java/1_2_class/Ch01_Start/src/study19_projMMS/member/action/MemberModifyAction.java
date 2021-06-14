package study19_projMMS.member.action;

import study19_projMMS.member.vo.Member;
import study19_projMMS.member.ui.MemberUI;
import study19_projMMS.member.svc.MemberModifyService;

//7-3 회원 정보 수정 요청을 처리하는 Action 클래스 구현
public class MemberModifyAction implements Action {

	@Override
	public void execute() throws Exception {

		MemberModifyService mms = new MemberModifyService();
		MemberUI.m = new Member(MemberUI.qList.get(0), MemberUI.qList.get(1), MemberUI.qList.get(2),
								MemberUI.qList.get(3), Integer.parseInt(MemberUI.qList.get(4)));

		mms.modifyMember(MemberUI.m);

	}

}
