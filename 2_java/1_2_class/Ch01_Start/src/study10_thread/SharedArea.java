package study10_thread;

public class SharedArea {


	// 동기화 블럭: 일부 내용만 임계영역(Critical Section)으로 만들때
	public void setBalance(Account sender, Account receiver,int amount) {
		synchronized (this) {

			sender.balance -= amount;
			receiver.balance += + amount;

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

			}
			// System.out.println(Thread.currentThread() + " : " + this.balance);
		}

	}

}
