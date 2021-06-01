package p03.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class HashSetLotto {

	public static void main(String[] args) {
		// Set 로또 번호(1~45) 넣은후 출력하기(45,30,12,5,38,44)
		HashSet<Integer>  hs = new HashSet<Integer>();
		
		for(int i=0; hs.size()<6; i++) {
		int num = 	(int) (Math.random()*45)+1;
		hs.add(new Integer(num));
		
		}
		System.out.println(hs);	
		
		
        //Set에서 순자정렬하기
		List<Integer> list = new LinkedList<>(hs);
		Collections.sort(list);
		System.out.println(list);
	}

}
