package p02.multi_runnable_interface;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread maint = Thread.currentThread();
		System.out.println("main Thread이름: "+maint.getName());
		
		ThreadA ta = new ThreadA();
		ta.start();
		System.out.println("ThreadA: "+ta.getName());
		
		ThreadB tb = new ThreadB();
		ta.start();
		System.out.println("ThreadB: "+tb.getName());
	}

}
