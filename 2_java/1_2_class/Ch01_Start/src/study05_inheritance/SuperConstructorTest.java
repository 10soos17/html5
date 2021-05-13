package study05_inheritance;
class Sawon2{
	String name;
	String dept;
	int salary;
	public Sawon2() {
		
	}
	public Sawon2(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	String displayInfo() {
		
		return "이름 : " + this.name + ", 부서 : " + this.dept + ", 연봉 : " + this.salary;
	}
}

class Sales2 extends Sawon2{
	int commition;
	public Sales2() {
		
	}
	public Sales2(String name, String dept, int salary, int commition) {
		super.name = name;
		super.dept = dept;
		super.salary = salary;
		this.commition=commition;
		
	}
	
	String displayInfo() {
		
		return super.displayInfo() + ", 수당 : "+commition  ;
	}
}
public class SuperConstructorTest {

	public static void main(String[] args) {
		Sales2 s = new Sales2("홍길동", "영업부", 100000000, 70000000);
		System.out.println(s.displayInfo());
	}

}
