package study06_polymorphism;

public class Account {
	String accountNo; // 계좌번호
	String ownerName; // 예금주 이름
	public int balance; // 잔액

	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public void deposit(int amount) {// 예금
		balance += amount;
	}

	public int withdraw(int amount) throws Exception {// 인출 2. 예외발생 2단계
		if (balance < amount)
			throw new Exception("잔액이 부족합니다.");// 1. 강제적 예외 발생
		balance -= amount;

		return amount;
	}

}
