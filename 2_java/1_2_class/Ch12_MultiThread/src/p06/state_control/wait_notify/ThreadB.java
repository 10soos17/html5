package p06.state_control.wait_notify;

public class ThreadB extends Thread {
	private WorkObject w;

	public ThreadB(WorkObject w) {
		this.w = w;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			w.methodB();
		}
	}
}
