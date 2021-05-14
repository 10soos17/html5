package p07.polymorphism;

public class Manager extends Employee {

	/*
	 * String name; int salary;
	 */
	@Override
	public String getEmployee() {
		return name + " : " + salary + ":" + depart;
	}

	String depart;

	public Manager(String name, int salary) {

		this.name = name;
		this.salary = salary;
	}

	public Manager(String name, int salary, String depart) {

		this(name, salary);
		this.depart = depart;

	}

}
