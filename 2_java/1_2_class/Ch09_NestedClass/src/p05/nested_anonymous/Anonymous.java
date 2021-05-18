package p05.nested_anonymous;

public class Anonymous {

	Person p1 = new Person();
	Person_Sub ps = new Person_Sub();
	
	//익명 객체 
	Person field = new Person() {

		void work() {
			System.out.println("출근");
		}

		@Override
		void wake() {
			System.out.println("6시 기상");
			work();
		}
	};

	void method1() {
		//익명 객체 
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책");
			}
 
			@Override
			void wake() {
				System.out.println("7시 기상");
				walk();
			}
		};
		localVar.wake();
	}
	
	void method2(Person p) {
		p.wake();
		
	}
}
