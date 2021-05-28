package p02.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayList_Basic2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		// PolyMorphism
		List<String> list2 = null;
		list2 = new ArrayList<>();
		list2 = new LinkedList<>();
		list2 = new Vector<>();

		ArrayList<String> list3 = new ArrayList<>();
		list3.add("포도");// 0
		list3.add("딸기");// 1
		list3.add("복숭아");// 2
		list3.add(2, "키위");// 인덱스 위치에 삽입, 기존 내용 밀려나기
		list3.set(0, "오렌지");// 그 위치 덮어쓰기
		//list3.remove(1);
		list3.remove("키위");
		//list3.add(1);
		list3.add("사과");
		list3.add("앵두");
		list3.add("사과");
		int num = list3.size();
		System.out.println(list3);

		for (int i = 0; i < num; i++) {
			System.out.println(list3.get(i));
		}
		
		int index1 = list3.indexOf("사과");
		int index2 = list3.lastIndexOf("사과");
		
		System.out.println("첫번째 사과(index) : "+index1);
		System.out.println("마지막 사과(index) : "+index2);
		System.out.println("----------------------");
		for(Object i:list3) {
			System.out.println(i);
		}
//		Iterator<Object> it = list3.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		for(Iterator<Object> it2 = list3.iterator();it2.hasNext();) {
//			System.out.println(it2.next());
//		}
	}

}
