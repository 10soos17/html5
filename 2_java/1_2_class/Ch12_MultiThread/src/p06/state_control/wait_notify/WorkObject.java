package p06.state_control.wait_notify;

//공유영역(Shared Area, 임계영역(Critical Section))
public class WorkObject {

	// 동기화 메소드
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업실행");
		notify();

		try {
			wait();
		} catch (InterruptedException e) {
		}
	}

	// 동기화 메소드
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업실행");
		notify();

		try {
			wait();
		} catch (InterruptedException e) {
		}
	}

}
