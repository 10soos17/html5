package p03.inherit.constructor;
//this: 현재 클래스
//this(): 현재 클래스의 기본 생성자 호출
//super: 부모 클래스
//super(): 부모의 기본 생성자 호출 

public class Member {
	int age = 100;
	String name;
	
	public Member() {
		
	}
	public Member(String name) {
		super();
		this.name = name;
	}
	
	void mem() {
		System.out.println(age);
		System.out.println(name);
	}

	/*
	public Member(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public Member(String name,int age) {
		super();
		this.age = age;
		this.name = name;
	}
	*/
	
}
