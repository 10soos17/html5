package p01.basic;

public class Demo_Main {

	public static void main(String[] args) {
		//1. 기존의 객체 생성
		DemoImpl di = new DemoImpl();
		
		//2. PolyMorphism 방식
		ADemo ad1 = new DemoImpl();
		ad1.write();
		((DemoImpl)ad1).print();
		BDemo bd1 = new DemoImpl();
		ad1.write();
		((DemoImpl)ad1).write();
		
		//3. 익명 구현 객체 
		ADemo ad2 = new ADemo() {
			public void write() {
				System.out.println("Anonymous write");
			}
			//사용불가
			public void print() {
				System.out.println("print()");
			}
		
		};
		
		BDemo bd2 = new BDemo() {
			@Override
			public void print() {
				System.out.println("Anonymous print");
			}
			//사용불가
			public void write() {
				System.out.println("write()");
			}
		};
		ad2.write();
		//ad2.print();//사용불가 
		((DemoImpl)ad2).print();
		
		//bd2.write();//사용불가
		((DemoImpl)bd2).write();
		bd2.print();
		
	}

}
