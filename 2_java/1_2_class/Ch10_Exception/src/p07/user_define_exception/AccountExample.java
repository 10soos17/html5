package p07.user_define_exception;

public class AccountExample {

	public static void main(String[] args) throws Exception {
		Account a = new Account();
		a.deposit(10000);
		System.out.println("예금액: "+a.getBalance());
		
		
		try {//3
			a.withdraw(30000);
			System.out.println("인출금액: "+ a.getBalance());
		} catch (BalanceInsufficientException e) {
			System.out.println(e.getMessage());
		}
	}

}
