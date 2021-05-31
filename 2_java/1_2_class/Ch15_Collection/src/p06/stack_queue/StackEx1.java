package p06.stack_queue;

import java.util.LinkedList;
import java.util.Stack;

//Stack: Last In First Out, LinkedList 로 구성 가능 
public class StackEx1 {

	public static void main(String[] args) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		stack.add(12);
		stack.add(new Integer(59));
		stack.add(7);
		System.out.println(stack);
		while (!stack.isEmpty()) {
			Integer num = stack.removeLast();
			System.out.println(num);
		}
		System.out.println();
		Stack<String> s = new Stack<String>();
		// "강남구", "송파구", "마포구"

		s.push("강남구");
		s.push("송파구");
		s.push("마포구");

		while (!s.isEmpty()) {
			System.out.println(s.pop());// 출력 후 데이터 제거
			// System.out.println(s.peek());
		}
	}

}
