package exercise;

public class ThreadExample {
	public static void main(String[] args) {
//		MovieThread th1 = new MovieThread();
//		MusicThread th2 = new MusicThread();
//		th1.start();
//		th2.start();

//		Thread th1 = new MovieThread();
//		Thread th2 = new MusicThread();
//		th1.start();
//		th2.start();

		Thread th1 = new Thread(new MovieRunnable());
		Thread th2 = new Thread(new MusicRunnable());
		th1.start();
		th2.start();

	}
}
