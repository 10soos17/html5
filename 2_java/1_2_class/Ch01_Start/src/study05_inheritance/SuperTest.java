package study05_inheritance;

class Sawon {
	String name;
	String dept;
	int salary;

	String displayInfo() {

		return "이름 : " + this.name + ", 부서 : " + this.dept + ", 연봉 : " + this.salary;
	}
}

class Sales extends Sawon {
	int commition;

	@Override
	String displayInfo() {

		return super.displayInfo() + ", 수당 : " + commition;
	}
}

public class SuperTest {

	public static void main(String[] args) {
		Sales sales = new Sales();
		System.out.println(sales.displayInfo());

	}

}
