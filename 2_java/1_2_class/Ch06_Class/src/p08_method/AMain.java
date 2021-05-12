package p08_method;

public class AMain {

	public static void main(String[] args) {

		A a = new A();
		A.stMethod();
		
		int r2 = A.stMethod(100,200);
		System.out.println(r2);// or System.out.println(A.stMethod(100,200));
		
		a.itMethod();
		a.itMethod("hong",6);
		
	}

}
