package study06_polymorphism;

import java.util.ArrayList;


public class Account0 {
	String accountNo; // 계좌번호
	String ownerName; // 예금주 이름
	public int balance; // 잔액
	static ArrayList<Account0> ac = new ArrayList<Account0>();


	public Account0(String an, String on, int b) {
		this.accountNo = an;
		this.ownerName = on;
		this.balance = b;

	}

	public void inPut() {
		ac.add(new Account0(this.accountNo, this.ownerName, this.balance));

	}

	public void deposit(int amount) {// 예금
		for (Account0 a : ac) {
			if (a.accountNo.equals(this.accountNo)) {
				// System.out.println(a + "CheckingAccount0");
				a.balance += amount;
				System.out.println(a.ownerName+"님의 계좌에 "+amount+" 입금되었습니다.\n잔액: "+a.balance);
		

			}
		}
	}

	/*
	 
	public int withdraw(int amount) throws Exception {// 인출 2. 예외발생 2단계
		if (balance < amount)
			throw new Exception("잔액이 부족합니다.");// 1. 강제적 예외 발생
		balance -= amount;

		return amount;
	}

	 */
	public int withdraw(int amount) throws Exception {// 인출

		for (Account0 a : ac) {

			if (a.accountNo.equals(this.accountNo)) {
				// System.out.println(a + "CheckingAccount0");
				if(a.balance - amount >= 0) {
					a.balance -= amount;
					System.out.println(a.ownerName+"님의 계좌에서 "+amount+" 인출되었습니다.\n잔액: "+a.balance);
					return a.balance;
				}else {
					System.out.println("잔액이 부족합니다.");
					break;
				}

			}
		}
		
		return 0;
	}

	/*public String toString() {
		return "계좌번호: " + this.accountNo + "\n예금주 이름: " + this.ownerName + "\n잔액: " + this.balance + "\n";
	}*/
}
