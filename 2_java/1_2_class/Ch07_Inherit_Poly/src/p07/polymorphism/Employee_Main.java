package p07.polymorphism;

public class Employee_Main {

	public static void main(String[] args) {
		//Polymorphism 사용전 방법 
		Manager m = new Manager("홍길동",10000);
		

		//Polymorphism 사용 방법 
		Employee e1 = new Manager("홍길동2", 20000);
		Employee m1 = new Manager("홍길동2", 20000, "개발부");
		System.out.println(e1.getEmployee());
		System.out.println(m1.getEmployee());
	}

}
