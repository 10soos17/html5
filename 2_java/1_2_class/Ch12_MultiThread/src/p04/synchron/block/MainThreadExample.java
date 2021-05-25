package p04.synchron.block;
//591
public class MainThreadExample {
	public static void main(String[] args) {
		Calculator c = new Calculator();

		User1 u1 = new User1();
		u1.setC(c);
		u1.start();
		
		User2 u2 = new User2();
		u2.setC(c);
		u2.start();
	}
}
