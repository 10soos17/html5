package 연습프로젝트;

class A{
	public int v;
	public void g() {
		v = 7;
	}
	public void h() {
		v = 5;
	}
}

class B{
	public int v;
	public void g() {
		
	}
}

public class App {

	public static void main(String[] args) {
		
		A A1 = new A();
		A1.g(); System.out.println(A1.v);
		A1.h(); System.out.println(A1.v);
		
		B B1 = new B();
		B1.v = 7;
		B1.g(); 
		System.out.println(B1.v + " 작동됨");
		
		
	}

}
