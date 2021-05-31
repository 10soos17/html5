package p04.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Map계열: 자료가 Key, Value 쌍으로 되어 있으면 사용 
//Entry: Key + Value 
public class HashMapEx1 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put(new String("홍길동"), new Integer(90));
		hm.put(new String("홍길동"), new Integer(90));
		hm.put(new String("홍길동3"), new Integer(80));
		hm.put(new String("홍길동4"), new Integer(60));

		System.out.println(hm);

		// Iterator()
		
		Set<Map.Entry<String, Integer>> set = hm.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Entry<String, Integer> e = it.next();
			System.out.println("이름: " + e.getKey() + ", 점수: " + e.getValue());
		}
		
		System.out.println("참가자 명단: " + hm.keySet());
		System.out.println("참가자 명단: " + hm.values());
	}

}
