package p04.synchron.block;

//공유영역(Shared Area): 일반클래스 
//공유영역 유지 방법: 동기화 블럭, 동기화 메소드 

//동기화 블럭방법1

public class Calculator {
	private int memory;//100 50

	public int getMemory() {
		return memory;
	}
    //동기화 블럭: 일부 내용만 임계영역(Critical Section)으로 만들때
	public void setMemory(int memory) {
		synchronized (this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
			System.out.println(Thread.currentThread().getName()+" : "+this.memory);
		}
	}

}