package exercise;

public class ThreadExample {
	public static void main(String[] args) {
		Thread th1 = new MovieThread();
		Thread th2 = new Thread(new MusicRunnable());
		th1.start();
		th2.start();
	}
}
