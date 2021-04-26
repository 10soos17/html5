package p1;

public class A {
	public int v1;
	       int v2;
	private int v3;
	public void h() {}
	       void k() {}
	private void m() {}
	
	void x() {//this 생략 가능 
		this.v3=7; 
		this.m();
	}

}
