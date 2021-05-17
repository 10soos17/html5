package p01.basic;

public class RemoteControl_Impl implements RemoteControl {
	//추상 메소드 반드시 재정의 
	@Override
	public void turnOn() {
		System.out.println("Overriding turnOn()");
	}

	@Override
	public void turnOff() {
		System.out.println("Overriding turnOff()");
	}
	
}
