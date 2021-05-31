package p06.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

//Queue: FIFO(First In First Out), LinkedList로 구성 가능 
public class QueueEx1 {

	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<String>();
		queue.offer("토끼");// 입력
		queue.offer("사슴");
		queue.offer("거북이");

		System.out.println(queue);

		while (!queue.isEmpty()) {
			String str = queue.poll();// 출력 후 데이터 제거 
//			String str = queue.peek();// 출력 후 데이터 제거X
			System.out.println(str);
		}

		Queue<String> q = new LinkedList<String>();
		q.add("Java");
		q.add("JavaScript");
		q.add("Jsp");
		while (!queue.isEmpty()) {
//		String str = q.poll();//출력 후 데이터 제거
//		System.out.println(str);

			String str3 = q.remove();
			System.out.println(str3);
		}

	}

}
