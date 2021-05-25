package p02.multi_runnable_interface;

public class ThreadB extends Thread {
	public ThreadB() {
		setName("ThreadB");//Thread 이름 저장 
		

	}      
	@Override
	public void run() {
		for(int i=0;i<2;i++) {
			System.out.println(getName()+"Thread이름 출력");
		}
	};
}
