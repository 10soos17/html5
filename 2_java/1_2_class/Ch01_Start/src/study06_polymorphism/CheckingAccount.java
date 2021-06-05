package study06_polymorphism;

//직불카드 
public class CheckingAccount extends Account {
	String cardNo;// 직불 카드 번호

	public CheckingAccount(String accountNo, String ownerName, int balance) {
		super(accountNo, ownerName, balance);

	}
	
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		this(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}

	// 인출
	int pay(String cardNo, int amount) throws Exception {// 2단계
		if (cardNo.equals(this.cardNo) || balance < amount) {
			throw new Exception("인출이 불가능합니다.");// 1단계
		}

		return withdraw(amount);
	}
}
