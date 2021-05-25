package study10_thread;

public class SharedArea {

	private int balance;

	public int getBalance() {
		return balance;
	}

	// 동기화 블럭: 일부 내용만 임계영역(Critical Section)으로 만들때
	public void setBalance(int balance) {
		synchronized (this) {
			this.balance=0;
			this.balance += balance;

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

			}
			//System.out.println(Thread.currentThread() + " : " + this.balance);
		}

	}

}
