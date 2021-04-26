package p1;
//import p1.q1.*;
//import p1.q2.*;

//public class 일 경우에 파일이름과 클래스명이 같아야 
public class A{
	
	public void a() {
		System.out.print("p1.A");
	}
	
	public static void main(String[] args) {
		
		p1.q2.B B1  = new p1.q2.B();
		B1.b();
	/*A A1 = new A();
	A1.a();
	
	p1.q1.A A2 = new p1.q1.A();
	A2.a();

	p1.q1.E E1 = new p1.q1.E();
	E1.e();
	*/
	}
}
