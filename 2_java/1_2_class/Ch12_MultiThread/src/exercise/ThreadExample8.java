package exercise;

public class ThreadExample8 {

	public static void main(String[] args) {
		Thread th = new MovieThread8();
		th.start();

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
		th.interrupt();

	}

}
