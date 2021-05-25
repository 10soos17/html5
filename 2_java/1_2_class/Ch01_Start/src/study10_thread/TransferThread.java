package study10_thread;

public class TransferThread extends Thread {
	SharedArea sharedArea;
	int amount;
	Account sender;
	Account receiver;

	public TransferThread(SharedArea area, int amount, Account sender, Account receiver) {
		this.sharedArea = area;
		this.amount = amount;
		this.sender = sender;
		this.receiver = receiver;
	}
	
	

	public void run() {
		for (int i = 0; i < 12; i++) {
			sharedArea.setBalance(this.amount);
			System.out.println(sender.ownerName +" 계좌: "+this.amount+"원 인출, "+receiver.ownerName+"계좌: "+this.amount+"원 입금");
			sender.balance = this.sender.getBalance() - sharedArea.getBalance();
			receiver.balance = this.receiver.getBalance() + sharedArea.getBalance();
		}
		System.out.println("exit");
		System.out.println(sender.balance);
		System.out.println(receiver.balance);		
		sender.printSum(sharedArea,receiver);
		
		

	}
}
