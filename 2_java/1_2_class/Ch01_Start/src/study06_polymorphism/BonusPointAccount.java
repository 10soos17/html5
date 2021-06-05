package study06_polymorphism;
//보너스 포인트 카드 

//super: 부모 클래스
//super(): 부모 클래스의 기본 생성자 호출 
public class BonusPointAccount extends Account {
	int bonusPoint; // 100점당 1포인트 적립

	public BonusPointAccount(String accountNo, String ownerName, int balance) {
		super(accountNo, ownerName, balance);
	}
	
	public BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint) {
		this(accountNo, ownerName, balance);
		this.bonusPoint = bonusPoint;
	}

	@Override
	public void deposit(int amount) {// 적립

		super.deposit(amount);
		bonusPoint += amount * 0.001;
	}
}
