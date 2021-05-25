package p06.state_control.stopAndInterrupt;

public class PrintThread2 extends Thread {
	public void run() {
//		try {
//			while (true) {
//				System.out.println("실행중");
//				Thread.sleep(1);
//			}
//		} catch (InterruptedException e) {
//
//		}
//		System.out.println("자원 정리");
//		System.out.println("실행 종료");
//		
		
		//interrupted() 메서드 사용 
		while(true) {
			System.out.println("실행중");
			if(Thread.interrupted()) {
				break;
			}
			
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
