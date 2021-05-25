package p04.synchron.block;

//작업Thread1
public class User2 extends Thread {
	private Calculator c;//공유영역 

	public Calculator getC() {
		return c;
	}

	public void setC(Calculator c) {
		this.setName("User2");// Thread Name 저장
		this.c = c;
	}

	@Override
	public void run() {
		c.setMemory(50);

	}
}
