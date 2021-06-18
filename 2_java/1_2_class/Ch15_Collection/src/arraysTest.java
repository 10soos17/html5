package mvc1.op;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class arraysTest {

	public static void main(String[] args) {
		
		//Arrays, List 정리 
		
		// Object----Collection-List-ArrayList
		// Object-Arrays(모든 메소드가 static) 
		
		// List는 인터페이스(객체 생성 x)-ArrayList의 부모
		//ex. List<Object> arr = Arrays.asList(1,2,"aaa");
		// Arrays.asList(1,"aaa")는 List<Object>()에 담기
		

//		ArrayList<Object> res = new ArrayList<>();
//		res.add(Arrays.asList("아이언맨", "헐크", "토르", "스파이더맨"));
//		res.add(Arrays.asList("아이언맨1", "헐크1", "토르1", "스파이더맨1"));
//
//		System.out.println(res.size());
//		for (int i = 0; i < res.size(); i++) {
//		
//			List l = (List)res.get(i);
//			System.out.println(l.size());
//			for(int j = 0; j< l.size();j++) {
//				System.out.println(l.get(j));
//			}
//		}
//		

		// 문자 쪼개기
		List<Object> sl = new ArrayList<>();

		String str = "[a,b,c],[a1,b1,c1]";

		// 1.split
		String[] tokens = str.split("\\[|\\]|,");
		for (int j = 0; j < tokens.length; j++) {
			System.out.println(tokens[j]);

		}

		// 2.StringTokenizer
		StringTokenizer stk = new StringTokenizer(str, "[|]|,");
		while (stk.hasMoreTokens()) {
			Object obj = stk.nextElement();
			sl.add(obj);
		}
		for (Object obj : sl) {
			System.out.println(obj);
		}

	}

}
