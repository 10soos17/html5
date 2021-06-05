package study10_thread.answer1.synchronized_method;

public class SharedArea {
	Account a1;
	Account a2;

	synchronized void transfer(int amount) {

		a1.withdraw(amount);
		System.out.print("알파고 계좌: " + amount + "원 인출,");
		a2.deposit(amount);
		System.out.println("베타고 계좌: " + amount + "원 입금,");

	}

	synchronized int getTotal() {
		return a1.balance + a2.balance;
	}
}
