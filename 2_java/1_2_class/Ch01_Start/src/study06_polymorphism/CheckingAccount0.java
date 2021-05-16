package study06_polymorphism;

public class CheckingAccount0 extends Account0 {
	String cardNo;

	public CheckingAccount0() {

	}

	public CheckingAccount0(String an, String on, int b, String cn) {
		super(an, on, b);
		this.cardNo = cn;

	}

	public void inPut() {
		// super.inPut();
		Account0.ac.add(new CheckingAccount0(super.accountNo, super.ownerName, super.balance, this.cardNo));

	}

	int pay(String cardNo, int amount) throws Exception {

		for (Account0 a : ac) {
			if (a instanceof CheckingAccount0 && ((CheckingAccount0) a).cardNo.equals(cardNo)) {
				// System.out.println(a + "CheckingAccount0");
				if (a.balance >= amount) {
					a.balance -= amount;
					System.out.println(a.ownerName + "님의 계좌애서 " + amount + " 지불되었습니다.\n잔액: " + a.balance);
				}

				return a.balance;

			}
		}

		return 0;
	}

	public String toString() {
		return super.toString() + "체크카드번호: " + this.cardNo + "\n";
	}
}
