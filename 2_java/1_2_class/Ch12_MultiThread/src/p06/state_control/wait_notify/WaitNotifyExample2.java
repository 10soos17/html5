package p06.state_control.wait_notify;

public class WaitNotifyExample2 {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();

		ProducerThread pth = new ProducerThread(dataBox);
		ConsummerThread cth = new ConsummerThread(dataBox);

		pth.start();
		cth.start();

	}

}
