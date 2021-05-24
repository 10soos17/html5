package p02.multi_extends_thread;

import java.awt.Toolkit;

//작업쓰레드1: Thread를 상속 받음 - 메인 쓰레드와 다른 독자적인 실행흐름 
public class BeepThread extends Thread {

	@Override
	public void run() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			tk.beep();
			System.out.println("aaa!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
