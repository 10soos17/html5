package p01.basic;

public class RemoteControl_Main {

	public static void main(String[] args) {
		RemoteControl_Impl ri = new RemoteControl_Impl();
		ri.turnOn();
		ri.turnOff();
		ri.setMute(false);
		RemoteControl.changeBattery();
	}

}
