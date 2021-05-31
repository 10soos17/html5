package p03.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class HashSetLotto {

	public static void main(String[] args) {
		// Set에 로또 번호 넣은 후, 출력하기(45,30,12,5,38,44)

		HashSet<Integer> lotto = new HashSet<>();
		for (int i = 0; i < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			lotto.add(new Integer(num));

		}
		System.out.println(lotto);

		// Set에서 순차 정렬하기

		// 1
		TreeSet myTreeSet = new TreeSet();
		myTreeSet.addAll(lotto);
		System.out.println(myTreeSet);
		// 2
		List<Integer> list = new LinkedList<>(lotto);
		Collections.sort(list);
		System.out.println(list);

		//3 삽입정렬 
		sort(lotto);
	}

	private static void sort(HashSet<Integer> lotto) {

		ArrayList<Integer> sortedList = new ArrayList<Integer>();

		for (Iterator<Integer> it = lotto.iterator(); it.hasNext();) {
			sortedList.add(it.next());
		}

		int index = 0;
		int res = sortedList.get(0);
		for (int i = 0; i < sortedList.size(); i++) {
			index = i;
			res = sortedList.get(i);
			while (index > 0 && sortedList.get(index - 1) > res) {
				sortedList.set(index, sortedList.get(index - 1));
				sortedList.set(index - 1, res);
				index -= 1;
			}
		}
		System.out.println(sortedList);

	}

}
