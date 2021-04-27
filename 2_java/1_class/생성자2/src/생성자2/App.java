package 생성자2;

class T{
	//public T(){System.out.println("T기본생성자");}
	public T(int v){System.out.println(v);}
}

class Z extends T{//T(super)를 상속 
	//public Z(){System.out.println("Z기본생성자");}
	//기본 제공되는 생성자는 super의 기본생성자를 호출함
	public Z() {
		super(7);//상위클래스의 생성자는 정수 1개인(7) 것을 호출해라
		//super();
	}
	
}

public class App {

	public static void main(String[] args) {
		new Z();//T의 기본생성자 -> Z의 기본생성자 순서로 호출 

	}

}
