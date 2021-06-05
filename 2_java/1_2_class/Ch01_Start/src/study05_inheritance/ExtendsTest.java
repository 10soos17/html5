package study05_inheritance;
//하나의 파일 안에 여러개 클래스를 만드는 경우(Old):
//(1) public 있는 파일
//(2) main()메소드가 클래스가 파일이름이 된다.
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





