package p03.priority;

public class PriorityExample {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			Thread th = new CalcThread("thread" + i);
			
			if (i != 10) {
				th.setPriority(Thread.MIN_PRIORITY);
			} else {
				th.setPriority(Thread.MAX_PRIORITY);
			}
			th.start();
		}

	}

}
