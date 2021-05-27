package exercise;

public class ThreadExample8 {

	// Main Thread
	public static void main(String[] args) {

		// Work Thread 시작
		Thread th = new MovieThread8();
		th.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		th.interrupt();// Thread의 안전한 종료: interrupt()는 new, stop()은 old

	}

}
