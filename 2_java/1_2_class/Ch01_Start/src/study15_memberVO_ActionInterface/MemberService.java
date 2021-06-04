package study15_memberVO_ActionInterface;

import java.util.List;
import java.util.Scanner;

public class MemberService {
	void process(Action action, Scanner sc) {
		action.execute(sc);
	}

	List getProcess(Action action, Scanner sc) {
		List key = action.getExecute(sc);
		return key;
	}
}
