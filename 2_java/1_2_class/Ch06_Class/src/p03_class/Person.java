package p03_class;

public class Person {

	// field = 전역변수 = 속성
	// instance변수: 객체 생성
	String name;
	int age;

	String[] str;

	// 생성자: 객체 생성시, 초기값 저장
	public Person(String name, int age) {
		// super();//부모(Object)의 기본 생성자 호출
		this.name = name;// this: 현재 클래스(Person)
		this.age = age;
	}

	// 메소드:: getter(), setter()
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name + ": " + age;
	}
	@Override
	public boolean equals(Object obj) {// p2
		boolean result = false;
		Person p = (Person) obj; // casting(강제형변환)
		if (p.name.equals(this.name) && p.age == this.age) {
			return true;
		}
		return result;
	}


}
