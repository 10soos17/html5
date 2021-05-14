package p07.polymorphism.casting;
//326
public class ChildExample {

	public static void main(String[] args) {
		Parent p = new Parent(); //자식이란 개념 없음 
		
		Parent p1 = new Child();
		p1.field1 = "data1";
		System.out.println(p1.field1);
		p1.method1();
		p1.method2();
		
		((Child)p1).field2 = "data2";
		System.out.println(((Child)p1).field2);
		((Child)p1).method3();

		//p1.method3();
		
	
		Child c1 = (Child)p1;

		c1.field2 = "data2";
		System.out.println(c1.field1);
		System.out.println(c1.field2);
		c1.method1();
		c1.method2();
		c1.method3();
	}

}
