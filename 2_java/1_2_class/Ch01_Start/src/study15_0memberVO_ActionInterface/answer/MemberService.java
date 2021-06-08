package study15_0memberVO_ActionInterface.answer;

import java.util.Scanner;

public class MemberService {

	void process(Action action, Scanner sc) {
		action.execute(sc);
	}

}
