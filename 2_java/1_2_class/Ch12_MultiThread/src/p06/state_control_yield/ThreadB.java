package p06.state_control_yield;

public class ThreadB extends Thread {
	
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		
		while(!stop) {
			if(work)
				System.out.println("ThreadB 작업내용");
			else
				Thread.yield();//실행 => 실행대기 
		}
		System.out.println("ThreadB 종료");
	}
}
