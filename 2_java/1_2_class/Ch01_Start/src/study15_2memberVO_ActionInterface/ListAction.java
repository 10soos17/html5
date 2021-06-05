package study15_2memberVO_ActionInterface;

import java.util.Scanner;

public class ListAction implements Action {

	@Override
	public void execute(Scanner sc) {
		for (MemberVO m : MemberMain.members) {
			System.out.println(m.toString());

		}

	}
}
