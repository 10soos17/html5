package p01.inherit.basic;

public class Child_Main {
//상속대상 : 변수, 메소드
//상속대상자에서 제외: constructor, 초기화블럭, private
	public static void main(String[] args) {
		//자식클래스 
		Child c1 = new Child();
		System.out.println(c1.pv);
		c1.pMethod();//Overriding
		System.out.println(c1.cv);
		c1.cMethod();

		//일반클래스
		Parent p = new Parent();
		System.out.println(p.pv);
		p.pMethod();
	}

}
