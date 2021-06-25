package map;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// Map: 키, 값의 쌍으로 넣는다
		// 가장 좋다!
		// 순서 없음(입력 순서 알 수 없다)
		// 값의 중복을 허용, 단 키의 중복은 불가
		// 장점 : 대부분 장점, 키로 값 접근은 최상, 삽입, 삭제
		// 단점 : 탐색(탐색용도로 잘 안씀)

		// 키는 항상 String으로 만들면 된다. 99.9999999%

		HashMap<String, Integer> map = new HashMap<>();

		map.put("한조", 70);
		map.put("트레", 90);
		map.put("메르시", 50); // 값을 중복은 허용 : 70
		map.put("한조", 15); // 키의 중복은 불가 ... 수정됨

		int value = map.get("한조");
		System.out.println(value);

		//////////////// 일반적 사용법//////////////////////
		HashMap<String, Object> st1 = new HashMap<String, Object>();
		st1.put("name", "한조");
		st1.put("math", 10);
		st1.put("eng", 30);

		HashMap<String, Object> st2 = new HashMap<String, Object>();
		st2.put("name", "메르시");
		st2.put("math", 60);
		st2.put("eng", 70);

		HashMap<String, Object> st3 = new HashMap<String, Object>();
		st3.put("name", "트레");
		st3.put("math", 90);
		st3.put("eng", 90);

		ArrayList<HashMap<String, Object>> students = new ArrayList<>();
		students.add(st1);
		students.add(st2);
		students.add(st3);

		for (HashMap<String, Object> st : students) {
			System.out.println(st);

			System.out.println("이름: " + st.get("name"));
			System.out.println("영어: " + st.get("eng"));
			System.out.println("수학: " + st.get("math"));
			System.out.println("=================================");

		}
	}

}
