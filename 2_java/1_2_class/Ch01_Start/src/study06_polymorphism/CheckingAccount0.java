package study06_polymorphism;

public class CheckingAccount0 extends Account0 {
	String cardNo;


	public CheckingAccount0(String an, String on, int b, String cn) {
		super(an, on, b);
		this.cardNo = cn;

	}

	public void inPut() {
		// super.inPut();
		Account0.ac.add(new CheckingAccount0(super.accountNo, super.ownerName, super.balance, this.cardNo));

	}
	
	/*
	 
	public int withdraw(int amount) throws Exception {// 인출 2. 예외발생 2단계
		if (balance < amount)
			throw new Exception("잔액이 부족합니다.");// 1. 강제적 예외 발생
		balance -= amount;

		return amount;
	}

	 */

	int pay(String cardNo, int amount) throws Exception {

		for (Account0 a : ac) {
			if ((a instanceof CheckingAccount0 && !((CheckingAccount0) a).cardNo.equals(cardNo))|| balance < amount) {
				throw new Exception("인출이 불가능합니다.");//1단계 

			}
		}

		return withdraw(amount);
	}

	/*public String toString() {
		return super.toString() + "체크카드번호: " + this.cardNo + "\n";
	}*/
}
