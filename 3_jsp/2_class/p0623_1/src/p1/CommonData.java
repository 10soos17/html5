package p1;

//import java.util.HashMap;

public class CommonData {
	
	//static - 많이 사용하지 말 것, 인스턴스와 상관없음, this로 접근 불가
	//ex.Math : 클래스 내부 속성값 활용 없이 외부 값만 받아서 메소드 만들 경우, static으로 만드는 경우가 많다
	static int count = 0;
	
	static void printHelp() {
		System.out.println("설명서...");
	}

//	public void test() {
//		HashMap<String, Integer> m = new HashMap<>();
//
//		for(String s: m.keySet()) {
//			m.get(s);
//		}
//	}
}
