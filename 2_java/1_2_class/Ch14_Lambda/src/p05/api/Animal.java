package p05.api;

public class Animal {
	String kind;
	int age;

	public Animal(String kind, int age) {
		this.kind = kind;
		this.age = age;
	}

	@Override
	public String toString() {

		return "[" + kind + ":" + age + "]";
	}

}
