package study10_thread.answer0;

// 12번 인출, 입금
public class TransferThread extends Thread {
	SharedArea sa;

	public TransferThread(SharedArea sa) {
		this.sa = sa;
	}

	@Override
	public void run() {
		for (int i = 0; i < 12; i++) {
			sa.a1.withdraw(1000000);
			System.out.print("알파고 계좌: 100만원 인출,");
			sa.a2.deposit(1000000);
			System.out.print("베타고 계좌: 100만원 입금,");
		}
	}

}
