package study19_projMMS.member_answer.ui;

import java.util.Scanner;

import study19_projMMS.member_answer.controller.MemberController;
import study19_projMMS.member_answer.action.Action;
import study19_projMMS.member_answer.action.MemberListAction;
import study19_projMMS.member_answer.action.MemberAddAction;
import study19_projMMS.member_answer.action.MemberModifyAction;
import study19_projMMS.member_answer.action.MemberRemoveAction;

//MemberUI(menu선택 받은후)-> (Action, Scanner 매개변로 받는)MemberController 호출 ->
//~Action 클래스들(Action interface상속한)들 호출 -> 
//~Action클래스 내에서(ConsoleUtil클래스(입력값받기)->
//					(결과값받아서)~Service클래스들 호출->
//                  (결과값받아서)ConsoleUtil클래스(결과값출력))
public class MemberUI {

	public static void main(String[] args) {

		MemberController memberController = new MemberController();
		Scanner sc = new Scanner(System.in);
		boolean isStop = false;

		do {
			System.out.println("*********회원관리 프로그램*********");
			System.out.println("1.회원등록\n2.회원목록보기\n3.회원정보수정\n4.회원정보삭제\n5.프로그램종료\n");
			System.out.println("메뉴번호: ");

			int menu = sc.nextInt();
			Action action = null;

			switch (menu) {

			case 1:
				action = new MemberAddAction();
				break;
			case 2:
				action = new MemberListAction();
				break;
			case 3:
				action = new MemberModifyAction();
				break;
			case 4:
				action = new MemberRemoveAction();
				break;
			case 5:
				System.out.println("프로그램종료");
				isStop = true;
				break;

			}
			if (action != null) {
				memberController.processRequest(action, sc);
			}
		} while (!isStop);
	}

}
