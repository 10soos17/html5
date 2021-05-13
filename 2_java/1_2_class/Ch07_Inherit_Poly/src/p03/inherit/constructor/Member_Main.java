package p03.inherit.constructor;

public class Member_Main extends Member{
	int age = 20;
	
	public Member_Main() {
	}
	
	public Member_Main(String name) {
		super(name);

	}
	
	void getInfo() {
		System.out.println("부모 age: "+super.age);
		System.out.println("자식 age: "+this.age);
	}
	
	public static void main(String[] args) {
		Member_Main m = new Member_Main();
		m.getInfo();
		Member_Main m2 = new Member_Main("홍길동");
		m2.getInfo();
		m2.mem();
	}
}
