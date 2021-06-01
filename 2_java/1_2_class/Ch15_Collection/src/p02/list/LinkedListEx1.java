package p02.list;

import java.util.Iterator;
import java.util.LinkedList;

//LinkedList: List계열(자료가 순차적이고 중복적일때 사용)
//          : 삽입,삭제가 많은 자료일때 유리, 인접 참조를 링크해서 체인(앞방향,역방향)처럼관리
//ArrayList: 자료에 변동성이 적을때 유리,내부배열에 객체를 저장해서 인덱스로 관리
public class LinkedListEx1 {

	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>();
		li.add("소나타");
		li.add("그랜저");
		li.add("그랜저");
		li.add("아이오닉");
		li.add("에쿠스");
		li.add("아우디");
		li.add(2,"키위");
		li.set(0, "오렌지");
		li.remove(1);
	   System.out.println(li);
	   for(int i=0; i<li.size(); i++)
		   System.out.println(li.get(i));
		
	   Iterator<String> it =   li.iterator();
	   while(it.hasNext()) {
		   String str = it.next();
		   System.out.println(str);
	   }
	}

}
