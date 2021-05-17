package study06_polymorphism;

//신용카드 
public class CreditLineAccount extends Account {
	public int creditLine;

	
	public CreditLineAccount(String accountNo, String ownerName, int balance) {
		super(accountNo, ownerName, balance);
	}
	
	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		this(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}

	@Override
	public int withdraw(int amount) throws Exception {// 2단계
		if (balance + creditLine < amount)
			throw new Exception("인출이 불가능합니다.");// 1단계
		balance -= amount; // b = b-a;
		return amount;
	}
}
