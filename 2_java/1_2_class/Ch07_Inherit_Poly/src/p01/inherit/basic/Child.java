package p01.inherit.basic;

public class Child extends Parent {
/*부모의 변수 메소드는 자식이 사용 가능, 재정의도 가능 
  	int pv = 10;
	void pMethod() {
		System.out.println("pMethod()");
	}
*/
	
	int cv = 20;
	void cMethod() {
		System.out.println("cMethod()");
	}
	
	int pv = 200;
	
	@Override
	void pMethod() {
		System.out.println("pMehod()-Overriding");
	}
}
