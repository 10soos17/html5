package p04.synchron.method;

//595
public class MainThreadExample {
	public static void main(String[] args) {
		Calculator c = new Calculator();

		User1 u1 = new User1(); //상태: NEW
		u1.setC(c);
		u1.start(); //상태: RUNNABLE 

		User2 u2 = new User2();
		u2.setC(c);
		u2.start();
		// 상태: TERMINATED
	}
}
