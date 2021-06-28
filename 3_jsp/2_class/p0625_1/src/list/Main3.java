package list;

import java.util.*;

public class Main3 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		List<String> list3 = new Vector<>();
		List<String> list4 = new Stack<>();

		list1.add("안녕하세요1");
		list1.add("안녕하세요1");
		list1.add("안녕하세요1");
		list1.add("안녕하세요1");

		// queue는 linkedlist로 만들어서 쓰는 게 유용하다
		// offer, poll 메소드만 사용하는 것이 queue 구조에 맞는 사용법
		Queue<String> list = new LinkedList<>();
		list.offer("주문1");
		list.offer("주문2");
		list.offer("주문3");
		list.offer("주문4");
		list.offer("주문5");

		String value = list.poll();

		// stack 배열로 만들어서 쓰는 게 유용하다
		// push, pop 메소드만 사용하는 것이 stack 구조에 맞는 사용법
		Stack<String> st = new Stack<String>();

		st.push("1111");
		st.push("1111");
		st.push("1111");
		st.push("1111");

		String value1 = st.pop();

		//////////////////////////////
		int a = 10;
		int b = 10;
		int c = 10;
		int d = 10;
		{
			int e = 10;
			int f = 10;
		}
		{
			int g = 10;
			int h = 10;
		}
		int i = 10;
		// 최종 stack에 남아있는 형태 ->abcdi

		//////////////////////////////
		a();
		c();
		// life cycle ->main호출-a호출-b호출-b종료-a종료-c호출-c종료-main종료
		// stack 공간 - main공간 a공간 b공간 c공간별로 생김
	}

	public static void a() {
		b();
	}

	public static void b() {

	}

	public static void c() {

	}

}
