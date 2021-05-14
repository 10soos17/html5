package study06_polymorphism;
//신용카드 
public class CreditLineAccount extends Account {
	public int creditLine;

	@Override
	public int withdraw(int amount) throws Exception{
		if(balance + creditLine < amount)
			throw new Exception("인출이 불가능합니다.");
		return amount;
	}
}
