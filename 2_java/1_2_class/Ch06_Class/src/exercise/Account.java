package exercise;

public class Account {
	private int balance;
	int MIN_BALANCE = 0;
	int MAX_BALANCE = 1000000;
	
	public void setBalance(int b){
		this.balance +=b;
		if (this.balance <MIN_BALANCE) {
			this.balance = MIN_BALANCE;
		}else if(this.balance > MAX_BALANCE) {
			this.balance = MAX_BALANCE;
		}
	}
	
	public int getBalance() {
		
		return balance;
	}
	}
