package study06_polymorphism;

public class BonusPointAccount0 extends Account0 {
	int bonusPoint;


	public BonusPointAccount0(String an, String on, int b, int bb) {
		super(an, on, b);
		this.bonusPoint = bb;

	}

	public void inPut() {
		// super.inPut();
		Account0.ac.add(new BonusPointAccount0(super.accountNo, super.ownerName, super.balance, this.bonusPoint));

	}

	@Override
	public void deposit(int amount) {// 예금한다 기능을 다시 구현하는 메소드

		super.deposit(amount);
		bonusPoint += amount * 0.001;
	}
/*
	public String toString() {
		return super.toString() + "보너스포인트: " + this.bonusPoint + "\n";
	}*/
}
