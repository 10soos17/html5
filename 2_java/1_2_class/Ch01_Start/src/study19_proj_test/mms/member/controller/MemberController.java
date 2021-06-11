package study19_proj_test.mms.member.controller;

import study19_proj_test.mms.member.action.Action;
import java.util.Scanner;


public class MemberController {

	public void processRequest(Action action, Scanner sc) {
		try {
			action.execute(sc);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
