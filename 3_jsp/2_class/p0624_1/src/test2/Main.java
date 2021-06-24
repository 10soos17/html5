package test2;

public class Main {
	//다형성 - 문법 
	//1.부모타입 변수가 자식인스턴스 받은 경우 : 자동형변환
	//									부모의 메소드(재정의 포함)는 호출 가능, 
	//									자식이 만든 메소드는 호출 불가(강제형변환해주면 가능)			    
	//2.자식타입 변수가 부모인스턴스 받은 경우:  강제형변환
	public static void main(String[] args) {
		A a1 = new A(); // 다형성 아닌 이유: 형태가 같음
		A a2 = new B(); // 다형성: 변수의 형태와 메모리의 형태가 다른 ... 자동타입캐스팅 되는 경우
		A a3 = new C(); // 다형성: 변수의 형태와 메모리의 형태가 다른 ... 자동타입캐스팅 되는 경우

		// 다형성: 의문이 드는 문제 - 문법적 제한 걸림 ... 메모리 다 활용 불가능
		a1.v1 = 10;
		// a2.v2 = 20;
		//========================
		Object o1;
		o1 = new A();
		o1 = new B();
		o1 = new C();
		o1 = new String("ddd");

		o1 = new int[10][20];
		//((int[][])o1)[0][0] = 0;
		int[][] arr = (int[][]) o1; // 강제형변환
		//========================
		A a11 = new B(); //다형성 ...
		a11.test();
		//((B)a11).test(1);

	}

}

class A {
	int v1;
	public void test() {
		System.out.println("A test");
	}
}

class B extends A {
	int v2;
	//오버라이딩(재정의) : 상위클래스의 같은 메소드 + 같은 매개변수 / 즉, 완전 동일 형태 
	public void test() {
		System.out.println("B test");
	}
	//오버로딩 : 같은 이름의 메소드, 다른 형태의 매개변수 
	public void test(int a) {
		System.out.println("B test111");
	}
}

class C extends A {
	public void test() {
		System.out.println("C test");
	}
}