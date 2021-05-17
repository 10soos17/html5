package p03.impl;
import p01.basic.RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc1;
		rc1 = new Television();
		rc1 = new Audio();
		
		RemoteControl rc2 = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Anonymous turnOn()");
				
			}

			@Override
			public void turnOff() {
				System.out.println("Anonymous turnOff()");
				
			}
		};
	}

}
