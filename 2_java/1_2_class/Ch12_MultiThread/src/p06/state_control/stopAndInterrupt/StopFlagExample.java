package p06.state_control.stopAndInterrupt;

public class StopFlagExample {

	public static void main(String[] args) {
		PrintThread1 pth = new PrintThread1();
		pth.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			pth.setStop(true);
		}

	}

}
