package set;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// Set : 순서가 없음, 용도가 많이 한정적
		// Set : 값의 중복을 허용하지 않음
		// 탐색(존재 여부) : 최상
		// 정렬 : 최상
		//사실상 값 넣을때 정렬되어있는 것
		//쓸 일이 많지 않음 

		TreeSet<Integer> set = new TreeSet<Integer>();

		set.add(4);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(5);

		for (int value : set) {
			System.out.println(value);
		}

		// 아래 용도가 주인 경우 사용
		if (set.contains(3)) {

		}
	}

}

class Node {
	int value;
	Node left;
	Node right;
}