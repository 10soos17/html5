package study10_thread;
//교재: ~618 정리 

//Synchronized Block, Synchronized Method 구현하기 
public class Account {
	String accountNo;// 계좌번호
	String ownerName;// 예금주
	int balance;// 잔고

	// SharedArea share = new SharedArea();
	TransferThread tr;
	PrintThread pr;

	// 생성자,Getter, Setter...
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void transfer(SharedArea share, Account receiver, int amount) {
		tr = new TransferThread(share, amount, this, receiver);
		tr.start();

	}

	public void printSum(SharedArea share, Account receiver) {
		pr = new PrintThread(share,this,receiver);
		pr.start();
	}

}
