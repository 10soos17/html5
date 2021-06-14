package study19_projMMS.member.action;

import study19_projMMS.member.ui.MemberUI;
import study19_projMMS.member.svc.MemberRemoveService;

//7-4 회원 정보 수정 요청을 처리하는 Action 클래스 구현
public class MemberRemoveAction implements Action {

	@Override
	public void execute() throws Exception {
		
		MemberRemoveService mrs = new MemberRemoveService();
		mrs.removeMember(MemberUI.m.getName());

	}

}
