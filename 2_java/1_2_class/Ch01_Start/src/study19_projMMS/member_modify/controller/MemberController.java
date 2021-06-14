package study19_projMMS.member_modify.controller;

import java.util.Scanner;

import study19_projMMS.member_modify.action.Action;

public class MemberController {

	public void processRequest(Action action, Scanner sc) {
		try {
			action.execute(sc);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
