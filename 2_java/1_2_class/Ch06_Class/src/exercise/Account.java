package exercise;

public class Account {
	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	//저장 
	public void setBalance(int b){
		if(b < Account.MIN_BALANCE || b > Account.MAX_BALANCE)
			return;
		this.balance = b;
	
	}
	
	public int getBalance() {
		
		return balance;
	}
	}
