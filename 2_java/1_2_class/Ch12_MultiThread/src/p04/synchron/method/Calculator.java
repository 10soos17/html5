package p04.synchron.method;

//공유영역(Shared Area): 일반클래스 
//동기화(synchronized) 메소드 å
public class Calculator {
	private int memory;// 100 50

	public int getMemory() {
		return memory;
	}

	//일시정지: WAITTING: NOTIFY()실행이 돼야 사용가능 
	//일시정지: BLOCKED
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);//일시정지: TIMED_WAITTING
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}

}
