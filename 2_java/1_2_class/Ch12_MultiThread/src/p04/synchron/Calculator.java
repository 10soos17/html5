package p04.synchron;

//공유영역(Shared Area): 일반클래스 
public class Calculator {
	private int memory;// 100 50

	public int getMemory() {
		return memory;
	}

	// 일반 메소드: 동기화메소드(x), 동기화블럭(x)
	// : 특정 사용자가 사용중이더라도 새로운 사용자가 사용 가능
	public void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}

}
