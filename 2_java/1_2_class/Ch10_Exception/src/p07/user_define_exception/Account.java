package p07.user_define_exception;

public class Account {

	private long balance;

	public Account() {

	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	// 예금
	public void deposit(int money) {
		balance += money;

	}

	// 출금
	public void withdraw(int money) throws Exception {//2
		if (balance < money)
			throw new Exception("잔고 부족: " + (money - balance) + " 모자람");//1

		balance -= money;
	}
}
