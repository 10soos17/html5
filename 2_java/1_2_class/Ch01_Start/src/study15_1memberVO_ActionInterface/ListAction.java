package study15_1memberVO_ActionInterface;

import java.util.List;
import java.util.Scanner;

public class ListAction implements Action {

	@Override
	public List getExecute(Scanner sc) {
		return null;
	}

	@Override
	public void execute(Scanner sc) {
		for(List l : MemberVO.hMap.keySet()) {
			System.out.println(MemberVO.hMap.get(l).toString());
			
		}
		
	}
}
