package study05_inheritance;

public class ExtendsTest{
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println("ch.parentVar = "+ ch.parentVar);
		System.out.println("ch.childVar = "+ ch.childVar);
		ch.parMethod();
		ch.chMethod();
		
	}
}

class Parent {
	int parentVar = 10;
	void parMethod(){
		System.out.println("parent Method");
	}
}

class Child extends Parent{
	int childVar = 20;
	void chMethod(){
		System.out.println("child Method");
	}
	
}





