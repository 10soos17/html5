package p03.set;

import java.util.HashSet;
import java.util.Iterator;

//Set : 2가지 의미(1.저장, 2. 집합)중 여기서는 집합(주머니)개념이다
//    : 주머니속의 데이터이므로, 데이터의 순서, 중복이 없음
//      HashSet(가장많이 사용), TreeSet(검색용)
public class HashSetEx1 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Java");
		hs.add("JavaScript");
		hs.add("jQuery");
		hs.add("AJax");
		hs.add("AJax");
		
		System.out.println("주머니의 크기: "+hs.size());
		System.out.println(hs);
		
		//advanced for
		for(String s : hs)
			System.out.print(s+" ");
		System.out.println();
		
		//iterator()
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			String element = it.next();
			System.out.print("\t"+element);
		}

	}

}
