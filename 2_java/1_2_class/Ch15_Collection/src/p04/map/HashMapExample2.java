package p04.map;

import java.util.HashMap;
import java.util.Map;

//745
public class HashMapExample2 {

	public static void main(String[] args) {
		HashMap<Student, Integer> map = new HashMap<Student, Integer>();
		Map<Student, Integer> map2 = new HashMap<Student, Integer>();
		
		map2.put(new Student(1, "홍길동"), new Integer(95));
		map2.put(new Student(1, "홍길동"), 95);
		map2.put(new Student(1, "홍길동"), 5);
		//key: 중복 불가
		System.out.println("총 Entry수 : "+map2.size());//1
		//value값 출력하기
		Integer num = map2.get(new Student(1, "홍길동"));
		System.out.println(num);

	}

}
