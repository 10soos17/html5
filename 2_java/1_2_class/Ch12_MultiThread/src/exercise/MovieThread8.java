package exercise;

public class MovieThread8 extends Thread {
	@Override
	public void run() {

		while (true) {
			System.out.println("동영상을 재생합니다.");
			if (this.isInterrupted()) {
				break;
			}

		}
		System.out.println("exit");

	}
}
