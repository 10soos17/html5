package study10_thread;

//계좌 잔액합계를 출력하는 Thread Class
public class PrintThread extends Thread {
	SharedArea sharedArea;
	Account sender;
	Account receiver;

	public PrintThread(SharedArea area, Account sender, Account receiver) {
		sharedArea = area;
		this.sender = sender;
		this.receiver = receiver;
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.print("계좌 잔액 합계: ");
			System.out.println(this.sender.balance + this.receiver.balance);
		
		}
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
