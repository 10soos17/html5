package study10_thread.answer1.synchronized_method;

//계좌 잔액합계(3번)를 출력하는 Thread Class
public class PrintThread extends Thread {
	SharedArea sa;

	public PrintThread(SharedArea sa) {
		this.sa = sa;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			int sum = sa.getTotal();
			System.out.println("계좌 잔액 합계: " + sum);
		}

	}
}
