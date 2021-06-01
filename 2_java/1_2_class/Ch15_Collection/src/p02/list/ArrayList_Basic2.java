package p02.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayList_Basic2 {

	public static void main(String[] args) {
		
		//PolyMorphism
		List<String> list2 = null;
		list2= new ArrayList<>();
		list2 = new LinkedList<>();
		list2 = new Vector<>();
		
		ArrayList<String> list = new ArrayList<>();
		list.add("포도");//0
		list.add("딸기");//1
		list.add("복숭아");//2
		list.add(2,"키위");//인덱스 위치에 삽입, 기존 내용 밀려나기
		list.set(0, "오렌지");//그 위치 덮어쓰기
		list.remove(1);
		list.remove("키위");
	    //list.add(1);
	    list.add("사과");
	    list.add("앵두");
	    list.add("사과");
	    int num = list.size();
		System.out.println(list);
		
		for(int i=0; i<num; i++) {
		  Object str = 	list.get(i);
		  System.out.println(str);
		}
			
		int index1 = list.indexOf("사과");
		int index2 = list.lastIndexOf("사과");
		
		System.out.println("첫번째 사과(index) : "+ index1);
		System.out.println("마지막 사과(index) : "+ index2);
	}

}
