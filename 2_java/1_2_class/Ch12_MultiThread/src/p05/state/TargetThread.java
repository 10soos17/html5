package p05.state;

public class TargetThread extends Thread {
	@Override
	public void run() {
		for (long i = 0; i < 1000; i++) {
			System.out.println("a");

		}
		try {//TIMED_WAITTING
			Thread.sleep(1500);
			System.out.println("step");
		} catch (InterruptedException e) {
		}

		for (long i = 0; i < 1000; i++) {
			System.out.println("b");
		}
	}
}
