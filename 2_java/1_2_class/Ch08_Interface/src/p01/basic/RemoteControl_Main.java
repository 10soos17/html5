package p01.basic;

public class RemoteControl_Main {

	public static void main(String[] args) {
		RemoteControl_Impl ri = new RemoteControl_Impl();
		ri.turnOn();
		ri.turnOff();
		ri.setMute(false);
		RemoteControl.changeBattery();

		System.out.println("----------------PolyMorphism-----------------");
		// PolyMorphism 1
		RemoteControl rc = new RemoteControl_Impl();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(false);
		((RemoteControl_Impl) rc).print();
		RemoteControl.changeBattery();

		// PolyMorphism 2
		RemoteControl rc2 = new RemoteControl_Impl();
		RemoteControl_Impl rci = (RemoteControl_Impl) rc2;
		rci.turnOn();
		rci.turnOff();
		rci.setMute(false);
		rci.print();
		RemoteControl.changeBattery();

		// Anonymous 구현 객체
		RemoteControl rc3 = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("Anonymous turnon()");
			}

			@Override
			public void turnOff() {
				System.out.println("Anonymous turnoff()");

			}
			//사용불가 
			void print() {
				System.out.println("일반 메소드: Anonymous Print()");
			}
		};
		rc3.turnOn();
		rc3.turnOff();
		rc3.setMute(false);
		//rc3.print(); 사용불가 
		RemoteControl.changeBattery();
	}

}
