package p07.polymorphism;

public class Employee {
	String name;
	int salary;
	
	public Employee() {
		
	}

	public Employee(String name, int salary) {

		this.name = name;
		this.salary = salary;
	}

	public String getEmployee() {
		return name + " : " + salary;
	}


	
}
