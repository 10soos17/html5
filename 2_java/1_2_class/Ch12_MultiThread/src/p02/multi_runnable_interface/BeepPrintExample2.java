package p02.multi_runnable_interface;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread th1 = new Thread(beepTask);
		th1.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}

		// 2 Runnable 익명객체
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit tk = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					tk.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
				}
			}
		});

		// 3 람다식 이용
		Thread th3 = new Thread(() -> {
			Toolkit tk = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				tk.beep();
				try {
					Thread.sleep(500);
				} catch (Exception e) {

				}
			}
		});

	}

}
