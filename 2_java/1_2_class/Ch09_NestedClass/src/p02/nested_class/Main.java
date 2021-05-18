package p02.nested_class;

//nested class에서는 class 앞에 "static" 사용 
public class Main {

	public static void main(String[] args) {
		A a = new A();
		a.method();

		// Instance Inner Class 사용방법
		A.B b = a.new B();
		System.out.println(b.field1);
		b.method1();

		// static Inner Class 사용하는 방법
		A.C c = new A.C();
		System.out.println(c.field1);
		System.out.println(A.C.field2);
		c.method1();
		A.C.method2();

	}

}
