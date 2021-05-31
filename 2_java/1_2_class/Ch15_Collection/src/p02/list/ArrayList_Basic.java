package p02.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


//List계열: 자료가 순차적이고, 중복적인 자료가 있을 때 사용 
//		   ArrayList, Vector, LinkedList,,,
//		   Vector: Synchronized 메소드 적용, 속도가 늦음, 초기에 나옴
//		   ArrayList: 비동기화 메소드 적용, 속도가 빠름, 배열의 단점을 극복(배열 크기 가변), 수정삭제에 유리 

public class ArrayList_Basic {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add("홍길동");
		ar.add(10);
		ar.add(true);
		ar.add(12.5);
		ar.add('A');
		ar.add('A');
		System.out.println(ar);
		System.out.println("--------------------------------");
		// Generic
		ArrayList<Object> ar2 = new ArrayList<Object>();
		ar2.add("홍길동");
		ar2.add(10);
		ar2.add(true);
		ar2.add(12.5);
		ar2.add('A');
		ar2.add('A');
		System.out.println(ar2);
		System.out.println("--------------------------------");
		// Generic- Casting(강제 형변환 불필요)
		ArrayList<String> ar3 = new ArrayList<>();
		ar3.add("홍길동");
		ar3.add("홍길동2");
		System.out.println(ar3);
		System.out.println("--------------------------------");
		// 일반 for
		for (int i = 0; i < ar3.size(); i++) {
			// System.out.println(ar3[i]); 배열인경우
			System.out.println(ar3.get(i));
		}
		// 향상된 for
		for (String i : ar3) {
			System.out.println(i);
		}
		System.out.println("------------------------");
		// ArrayList<Man> am = new ArrayList<Man>();
		List<Man> am = new ArrayList<Man>();
		am.add(new Man("홍길동", 20));
		am.add(new Man("알파고", 30));

		// 1. 일반 for
		for (int i = 0; i < am.size(); i++) {
			System.out.println(am.get(i).name + "," + am.get(i).age);
		}
		System.out.println("------------------------");
		// 2. 향상된 for
		for (Man m : am) {
			System.out.println(m.name + "," + m.age);
		}
		System.out.println("------------------------");
		// 3. Iterator1
		Iterator<Man> it = am.iterator();
		while (it.hasNext()) {
			Man m1 = it.next();
			System.out.println(m1.name + "," + m1.age);
		}

		Collections.sort(ar3);// 재정의 불필요
		System.out.println("ar3 sort(): " + ar3);
		System.out.println("------------------------");
		// 4. Iterator2
		for (Iterator<Man> it2 = am.iterator(); it2.hasNext();) {
			Man m2 = it2.next();
			System.out.println(m2.name + "," + m2.age);
		}


	}
}
