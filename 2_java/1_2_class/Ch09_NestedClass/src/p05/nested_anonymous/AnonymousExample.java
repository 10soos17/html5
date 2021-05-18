package p05.nested_anonymous;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous a = new Anonymous();
		a.field.wake();
		a.method1();
		
		/*
		Person p = new Person() {
			void study() {
				System.out.println("공부");
			}
			void wake() {
				System.out.println("8시 기상");
				study();
			}
			
			
		};
		*/
		
		a.method2(new Person() {
			void study() {
				System.out.println("공부");
			}
			void wake() {
				System.out.println("8시 기상");
				study();
			}
			
			
		});
	}

}
