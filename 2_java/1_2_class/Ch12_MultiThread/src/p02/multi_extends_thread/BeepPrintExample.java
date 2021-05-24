package p02.multi_extends_thread;

//Main Thread: 독자적인 실행흐름 
public class BeepPrintExample {
//Multi Thread: Thread가 1개 이상일때
	public static void main(String[] args) {

		Thread t1 = new BeepThread();
		t1.start();// run() 찾아서 실행

		for (int i = 0; i < 5; i++) {
			System.out.println("띵!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}

	}

}
