package p01.start;
//메인메소드가 없음: 실행 불가, 그러나 다른 클래스가 호출하면 사용 가능
public class Kind {
	
	String name = "홍길동";
	
	void abc() {
		System.out.println(name);
		System.out.println(age);
	}
	
	static void abc2() {
		Kind kk= new Kind();
		System.out.println(kk.name);
		System.out.println(age);
		kk.abc();
	}
	
	static int age = 20;
}
