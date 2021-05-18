package p02.nested_class;

public class A {

	A() {
		System.out.println("A 기본 객체");
	}

	// 1. Instance Inner Class: Instance 변수, 메소드만 사용 가능
	class B {
		B() {
			System.out.println("B 기본 객체");
		}

		int field1;
		// static int field2;//static 불가

		void method1() {
			System.out.println("B method1()");
		}

		// static void method2() {//static 불가

		// }
	}

	// 2. static Inner Class: 변수, 메소드 모두 가능(Instance, static)
	static class C {
		public C() {
			System.out.println("C 기본객체");
		}

		int field1;
		static int field2;

		void method1() {
			System.out.println("C method1()");
		}

		static void method2() {
			System.out.println("C method2()");
		}

	}

	void method() {

		// 3.Local Inner Class
		class D {
			public D() {
				System.out.println("D 기본 객체");
			}

			int field1;

			// static int field2; //static 불가
			void method1() {
				System.out.println("D method1()");
			}
			// static void method2() { //static 불가
			// }
		}
		D d = new D();
		d.field1 = 3;
		System.out.println(d.field1);
		d.method1();
	}
}
