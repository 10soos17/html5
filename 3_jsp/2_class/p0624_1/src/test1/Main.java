package test1;

//파일 1개에 public class는 1개만 존재해야함 
public class Main {

	public static void main(String[] args) {

		// 상속 - 다형성 - 재정의(오버라이딩)
		A aa;
		B bb;
		C cc;
		
		aa = new A(); //다형성 아님 
		bb = new B(); //다형성 아님 
		cc = new C(); //다형성 아님 
		
		aa = new B(); //다형성 ... 자동타입캐스팅
		//bb = new A(); //자동타입캐스팅 안됨 
		bb = (B)new A(); // 강제타입캐스팅 가능 ... 단 문제 발생 가능성 
		//둘 다 허용된다라는 가정하에...
		aa.v2 = 10;
		//aa.v3 = 10;
		bb.v3 = 10;
		
		//=========================
		aa = new A(); //다형성 아님 
		bb = new B(); //다형성 아님 
		cc = new C(); //다형성 아님 
		
		aa = new A(); //다형성 아님 
		aa = new B(); //다형성
		aa = new C(); //다형성
		
		bb = new B();
		bb = new C(); 
		//bb = new A();
		
		
		//=========================
		A obj = new A();
		obj.testA();

		B obj2 = new B();
		obj2.testA();

		C obj3 = new C();
		obj3.testA();

		int a = 10;
		double b = 10.0;

		b = a; //자동 형변환 가능 - 논리적으로 가능하기에 
		//a = b; //자동 형변환 불가 - 논리적으로 불가능하기에 
		a = (int) b; //강제 형변환은 가능 ... 단, 손실 발생할 수 있음 ... 위험 요소 존재 
		
		
	}

}

class A {
	public int v1;
	public int v2;

	public void testA() {
		System.out.println("test A");

	}
}

class B extends A {
	public int v3;

	public void testA() {
		System.out.println("test B");

	}

}

class C extends B {
	public int v4;

	public void testA() {
		System.out.println("test C");

	}

}