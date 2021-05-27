package exercise;

public class ThreadExample10 {

	// Main Thread
	public static void main(String[] args) {

		// Work Thread 시작
		Thread th = new MovieThread10();

		th.setDaemon(true);// Main Thread가 종료하면, 보조 Thread(Daemon)자동 종료
		th.start();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

		}

	}

}
