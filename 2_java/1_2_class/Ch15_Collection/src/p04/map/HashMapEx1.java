package p04.map;
//Map계열: 자료가 Key,Value쌍으로 되어 있으면 사용
//Entry : 키+Value
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//743 보충하기
public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put(new String("홍길동"),new Integer(90) );
		hm.put(new String("홍길동"),new Integer(90) );
		hm.put(new String("홍길동3"),new Integer(80) );
		hm.put(new String("홍길동4"),new Integer(60) );
		
		System.out.println(hm);
		//entrySet(), iterator()
		Set<Map.Entry<String, Integer>> set = hm.entrySet();
		Iterator<Entry<String, Integer>> it =  set.iterator();
        while(it.hasNext()) {
        	Entry<String, Integer> e = it.next();
        	System.out.println("이름: "+e.getKey()+", 점수: "+e.getValue());
        }
        
        //keySet(), iterator()
        Set<String> keySet =  hm.keySet();
        Iterator<String> it2 =  keySet.iterator();
        while(it2.hasNext()) {
          String key = 	it2.next();
          Integer value = hm.get(key);
          System.out.println("이름: "+key+", 점수: "+value);
        }
        
        
        
        
        System.out.println("참가자 명단: "+hm.keySet());
	}

}
