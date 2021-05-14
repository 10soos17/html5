package study06_polymorphism;

public class PolyMain {

	public static void main(String[] args) throws Exception {
		Account obj1 = new Account("111-22-3333", "임꺽정", 10000);
		
		CheckingAccount obj2 = new CheckingAccount("444-55-666", "홍길동", 20000, "5555-666-777-888");
		CreditLineAccount obj3 = new CreditLineAccount("444-55-666", "김선달", 30000, 20000000);
		BonusPointAccount obj4 = new BonusPointAccount("000-00-00000", "김미", 0,0);
		//다양한 Type의 객체를 가지고 같은 메서드를 호출 

		
	}
	//다양한 타입의 객체를 한 타입(Account obj)의 파라메터 변수로 받는다.
	static void printAccountInfo(Account obj) {
		

		
	}

}
