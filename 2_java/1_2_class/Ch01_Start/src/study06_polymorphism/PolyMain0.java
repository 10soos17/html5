package study06_polymorphism;

public class PolyMain0 {


	public static void main(String[] args) throws Exception {
		
		Account0 obj1 = new Account0("111-22-3333", "임꺽정", 10000);
		obj1.inPut();
		CheckingAccount0 obj2 = new CheckingAccount0("444-55-666", "홍길동", 20000, "5555-666-777-888");
		obj2.inPut();

		CreditLineAccount0 obj3 = new CreditLineAccount0("777-22-3333", "김선달", 30000, 20000000);
		obj3.inPut();
		BonusPointAccount0 obj4 = new BonusPointAccount0("000-00-00000", "김미", 0, 0);

		obj4.inPut();
		//System.out.println(Account0.ac);
		
		//다양한 Type의 객체를 가지고 같은 메서드를 호출 
		printAccountInfo(obj1);
		printAccountInfo(obj2);
		printAccountInfo(obj3);
		printAccountInfo(obj4);
		
		obj1.deposit(10000);

		obj1.withdraw(10000);
	
		obj2.pay("5555-666-777-888",10000);
		
		obj3.withdraw(10000);
		
		obj4.deposit(10000);

		obj4.withdraw(110000);
		
	}
	//다양한 타입의 객체를 한 타입(Account obj)의 파라메터 변수로 받는다.
	static void printAccountInfo(Account0 obj1) {
		System.out.println(obj1);
	}

}
