package study19_projMMS.member.controller;

import study19_projMMS.member.action.Action;

public class MemberController {

	public void processRequest(Action action) {
		try {
			action.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
