package p05.search;

import java.util.NavigableSet;
import java.util.TreeSet;

//Search : TreeSet:Tree구조에 저장, 자동으로 정렬,부모값과 비고해서 작으면 왼쪽, 크면 오른쪽에 저장
public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>();
		int[] score= {80,95,50,35,45,65,10,100};
		
		Integer it = null;
		//방법1
		t.add(new Integer(80));
		
       //방법2
		for(int i=0; i<score.length; i++)
			t.add(new Integer(score[i]));
		
		System.out.println(t);//자동 오름차순
		System.out.println("가장 낮은 점수: "+t.first());//last
		System.out.println("65 아래 점수: "+t.lower(65));//higher
		System.out.println("65이거나 바로 아래 점수: "+t.floor(64));//ceiling
//		while(!t.isEmpty()) {
//			it = t.pollFirst();//pollLast()
//			System.out.println(it+"(남은 객체수: "+ t.size()+")");
//		}
		
		
		//내림차순 정렬
		//NavigableSet<E>	descendingSet()
		NavigableSet<Integer> ns = 	t.descendingSet();
		for(Integer s : ns)
			System.out.print(s+" ");
		
		System.out.println();
		
		//오름차순
		NavigableSet<Integer> ns2 = 	ns.descendingSet();
		for(Integer s : ns2)
			System.out.print(s+" ");
	}

}
