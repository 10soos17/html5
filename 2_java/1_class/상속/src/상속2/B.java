package 상속2;

public class B extends A {
	public int v2;
	public void g2() {
		System.out.println("B"+ v1);//v1은 부모 A의 protected 변수
	}
	
}
