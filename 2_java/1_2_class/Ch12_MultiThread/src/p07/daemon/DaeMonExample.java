package p07.daemon;

public class DaeMonExample {
	// main Thread(주)
	public static void main(String[] args) {
		AutoSaveThread at = new AutoSaveThread();
		at.setDaemon(true);// Daemon(보조) Thread(주 Thread 종료하면 자동 종료) 설정
		at.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		System.out.println("메인 쓰레드 종료");
	}

}
