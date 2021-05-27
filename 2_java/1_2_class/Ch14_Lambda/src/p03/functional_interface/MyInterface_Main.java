package p03.functional_interface;

public class MyInterface_Main {

	public static void main(String[] args) {
		// 1. 구현객체
		MfClass mc = new MfClass();
		mc.calculate(3, 4);

		// 2. 익명구현 객체
		MyInterface mc1 = new MyInterface() {

			@Override
			public void calculate(int x, int y) {
				System.out.println(x * y);

			}
		};
		mc1.calculate(3, 4);

		// 3. Lambda Expression
		MyInterface mc2 = (x, y) -> System.out.println(x * y);

		mc2.calculate(3, 4);

		// 4. Lambda Expression: return 표현
		MyInterface2 mif = (int x, int y) -> {return x * y;};
		
		mif.calculate(5, 6);

	}

}
