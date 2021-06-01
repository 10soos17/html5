package p03.set;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
	return name+" : "+age;
	}
	
	@Override
	public int hashCode() {
		return (name+age).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			return this.name.equals(p.name) && this.age == p.age;
		}
		return super.equals(obj);
	}
}
