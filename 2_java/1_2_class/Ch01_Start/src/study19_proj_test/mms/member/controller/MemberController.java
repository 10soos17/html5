package study19_proj_test.mms.member.controller;

import study19_proj_test.mms.member.action.Action;

public class MemberController {

	public void processRequest(Action action) {
		try {
			action.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
