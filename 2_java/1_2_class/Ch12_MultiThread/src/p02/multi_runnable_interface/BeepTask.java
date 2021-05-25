package p02.multi_runnable_interface;

import java.awt.Toolkit;

//Thread 만드는 법2
//Runnable: start()가 없으므로 Thread 객체 생성해서 start
public class BeepTask implements Runnable{

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
