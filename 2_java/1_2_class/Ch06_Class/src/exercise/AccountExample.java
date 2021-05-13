package exercise;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();//저장방법1-생성자 만든 후에 사용 가능
		//account.balance = 10000;//저장방법2 - private 없애고 쓰기 
		account.setBalance(1000);//저장방법3 -setter메소드
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고: " + account.getBalance());

		account.setBalance(3000000);
		System.out.println("현재 잔고: " + account.getBalance());
	}

}
