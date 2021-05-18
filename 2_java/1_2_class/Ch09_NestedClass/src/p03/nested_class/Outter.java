package p03.nested_class;

public class Outter {

	//Java7 이전 버전: final이 반드시 붙어 있음 
	public void method1(final int arg) {
		final int localVariable = 1;
		//고정 상수(final)이므로 값 변경 불가 
		//arg = 200;
		//localVariable = 200;
		
		class Inner{
			public void method() {
				int result = arg + localVariable;
				System.out.println(result);
			}
		}
		Inner in = new Inner();
		in.method();
	}

	//Java8 이후: final 생략 
	public void method2(int arg) {
		int localVariable = 1;
		//고정 상수(final)이므로 값 변경 불가 
//		arg = 300;
//		localVariable = 100;
//		System.out.println(arg);
//		System.out.println(localVariable);		
		
	/*	class Inner{
			public void method() {
				int result = arg + localVariable;
				System.out.println(result);
			}
		}
		Inner in = new Inner();
		in.method();*/
	}

}
