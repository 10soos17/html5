package p08_method;

public class A {

	static int sv = 2;
	int iv = 1;

	// Method Overloading
	static void stMethod() {
		System.out.println("stMethod()");
		System.out.println(sv);
		A a = new A();
		System.out.println(a.iv);
		
		int r1 = stMethod(20, 30);// "메소드명": 같은 클래스 안에 있으므로
		System.out.println(r1);
		a.itMethod();

	}

	static int stMethod(int a, int b) {
		System.out.println("stMethod(a,b)");
		int result = a + b;
		return result;
	}

	void itMethod() {
		System.out.println("itMethod()");
		System.out.println(sv);
		// A a = new A();
		System.out.println(iv);
		//stMethod(20,30);
		//itMethod();
	}

	void itMethod(String s, int b) {
		System.out.println("itMethod(s,b)");

	}

}
