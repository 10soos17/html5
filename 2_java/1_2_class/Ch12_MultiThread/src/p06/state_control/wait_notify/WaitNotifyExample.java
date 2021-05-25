package p06.state_control.wait_notify;

public class WaitNotifyExample {
	// Main Thread
	public static void main(String[] args) {
		WorkObject w = new WorkObject();
		// Work Thread 1, 2
		ThreadA ta = new ThreadA(w);
		ThreadB tb = new ThreadB(w);
		ta.start();
		tb.start();

	}

}
