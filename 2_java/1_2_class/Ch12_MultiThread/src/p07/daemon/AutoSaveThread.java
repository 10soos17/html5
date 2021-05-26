package p07.daemon;

public class AutoSaveThread extends Thread {

	public void save() {
		System.out.println("작업 내용을 저장함");
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000); // Checked Exception
			} catch (InterruptedException e) {
				break;
			}
			save();
		}
	}
}
