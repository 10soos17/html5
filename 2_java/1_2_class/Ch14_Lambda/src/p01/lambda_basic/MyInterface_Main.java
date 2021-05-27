package p01.lambda_basic;

public class MyInterface_Main {

	public static void main(String[] args) {
		// 인터페이스 사용방법
		// 1. 구현클래스를 만들어서 사용

		// 2. 익명구현객체
		MyInterface m1 = new MyInterface() {

			@Override
			public void add() {
				System.out.println("익명구현객체 재정의");

			}
		};
		m1.add();

		// 3. Lambda Expression: 익명구현객체
		MyInterface m2 = () -> System.out.println("익명구현객체 재정의");
		m2.add();

	}

}
