package exercise;

public class ThreadExample10 {

	public static void main(String[] args) {
		Thread th = new MovieThread10();
		th.setDaemon(true);
		th.start();
		
		try{
			Thread.sleep(500);
		}catch(InterruptedException e) {
			
		}
		
	}

}
