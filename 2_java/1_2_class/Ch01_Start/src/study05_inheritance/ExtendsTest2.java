package study05_inheritance;

public class ExtendsTest2{
	public static void main(String[] args) {
		Subsub ss = new Subsub();
		System.out.println("ss.x = " + ss.x);
		System.out.println("ss.y = " + ss.y);
		System.out.println("ss.z = " + ss.z);
		ss.superMethod();
		ss.subMethod();
		ss.subSubMethod();
	}
}

class Super{
	int x = 90;
	void superMethod() {
		System.out.println("super Method");
	}
}

class Sub extends Super{
	int y = 10;
	void subMethod() {
		System.out.println("sub method");
	}
}

class Subsub extends Sub{
	int z = 20;
	void subSubMethod() {
		System.out.println("subSub method");
	}
}





