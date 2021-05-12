package p10_static_singleton;

public class Bank_Main {

	public static void main(String[] args) {

		//Singleton 사용하기 전 방식 
		//Bank b1 = new Bank("신한은행");
		//System.out.println(b1.getName());
		
		String s1 = "홍길동";//객체 생성 
		String s2 = "홍길동";//위에서 생성된 주소값 
		String s3 = new String("홍길동");
		String s4 = new String("홍길동");
		//Singleton 사용
		Bank b2 = Bank.getBank();
		System.out.println(b2.getName());

		Bank b3 = Bank.getBank();
		System.out.println(b3.getName());
		//변수가 같은 객체를 참조(같은 객체의 주소를 저장하는지) 비교 
		if(b2 == b3) {
			System.out.println("같은 Singleton객체 입니다.");
		}else {
			System.out.println("같은 Singleton객체 입니다.");
		}
	}

}
