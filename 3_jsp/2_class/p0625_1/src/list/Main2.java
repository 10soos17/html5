package list;

import java.util.LinkedList;

public class Main2 {

	public static void main(String[] args) {

		// 2.LinkedList
		// LinkedList<LinkedList<Integer>> list = new LinkedList<>(); //2중
		LinkedList<Integer> list = new LinkedList<>();

		list.add(1111);
		list.add(2222);
		list.add(3333);

//		//LinkedList에서 아래 형태로 반복문 돌리면 안됨 -> 접근속도
//		for (int i = 0; i < list.size(); i++) {
//			int value = list.get(i);
//			System.out.println(value);
//		}

		// LinkedList는 로직에 가리키는 변수가 구현되어 있음 -> 따라서 아래같이 for문 돌려야 함
		for (int value : list) {
			System.out.println(value);
		}

	}

}
