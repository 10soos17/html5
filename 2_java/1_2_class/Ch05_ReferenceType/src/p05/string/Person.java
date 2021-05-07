package p05.string;

public class Person {
	int age; //30 31 32
	String name; //홍길동0 홍길동1 홍길동2
	
	public Person(){
		
	}
	
	public Person(int age, String name) {
		super(); //부모의 기본생성자, 안써도됨
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return age + ":" + name; 
	}
}
