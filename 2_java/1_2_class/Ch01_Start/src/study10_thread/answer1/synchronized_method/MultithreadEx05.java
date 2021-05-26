package study10_thread.answer1.synchronized_method;

//synchronized method
public class MultithreadEx05 {

	public static void main(String[] args) {

		SharedArea sa = new SharedArea();
		sa.a1 = new Account("1111", "알파고", 200000000);
		sa.a2 = new Account("2222", "베타고", 100000000);
		TransferThread ta = new TransferThread(sa);
		PrintThread tb = new PrintThread(sa);
		ta.start();
		tb.start();

	}
}
