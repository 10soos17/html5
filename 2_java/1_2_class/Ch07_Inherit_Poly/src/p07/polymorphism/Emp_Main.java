package p07.polymorphism;

public class Emp_Main {

	public static void main(String[] args) {
		//메모리에 3가지 동시에 존재 
		Emp em = new Emp();
		SalesMan sa = new SalesMan();
		Engineer en = new Engineer();
		//Parameter의 다형성
		//Field의 다형성 
		em.taxRate(em);
		sa.taxRate(sa);
		en.taxRate(en);
		
		//Polymorphism: 하나의 부모 타입으로 생성된 여러 자식객체를 가리키는 것 
		//메모리에 1개 존재 
		//Field(변수) 다형성 
		Emp emp = null;
		emp = new Emp();

		emp.taxRate(emp);
		emp = new SalesMan();
		emp.taxRate(emp);
		emp = new Engineer();
		emp.taxRate(emp);
		
		

	}

}
