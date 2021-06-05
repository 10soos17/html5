package study06_polymorphism;

public class PolyMain {

	public static void main(String[] args) throws Exception {
		System.out.println("-PolyMorphism 방법1----------------------------------------");
		Account obj1 = new Account("1111", "홍길동", 10000);
		CheckingAccount obj2 = new CheckingAccount("2222", "홍길동", 20000, "5555");
		CreditLineAccount obj3 = new CreditLineAccount("3333", "알파고", 3000, 20000000);
		BonusPointAccount obj4 = new BonusPointAccount("4444", "드론", 0, 0);
		// 다양한 Type의 객체를 가지고 같은 메서드를 호출
		printAccountInfo(obj1);
		printAccountInfo(obj2);
		printAccountInfo(obj3);
		printAccountInfo(obj4);
		
		System.out.println("-PolyMorphism 방법2----------------------------------------");
		Account ob = null;
		ob = new Account("1111", "홍길동", 10000);
		printAccountInfo(ob);
		ob = new CheckingAccount("2222", "홍길동", 20000, "5555");
		printAccountInfo(ob);
		ob = new CreditLineAccount("3333", "알파고", 3000, 20000000);
		printAccountInfo(ob);
		ob = new BonusPointAccount("4444", "드론", 0, 0);
		printAccountInfo(ob);

	}

	// 다양한 타입의 객체를 한 타입(Account obj)의 파라메터 변수로 받는다.
	static void printAccountInfo(Account obj) {
		System.out.println("계좌번호: " + obj.accountNo);
		System.out.println("예금주: " + obj.ownerName);
		System.out.println("잔액: " + obj.balance);
		System.out.println();

	}

}
