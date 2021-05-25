package study10_thread;

public class MultithreadEx05 {

	public static void main(String[] args) {
		SharedArea share = new SharedArea();

		Account ac1 = new Account("1111", "이수일", 200000000);
		Account ac2 = new Account("2222", "심순애", 100000000);

		ac1.transfer(share, ac2, 10000000);

	}
}
