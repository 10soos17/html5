package p05.anonymous.implement;
//익명구현객체 
public class Anonymous {
	//1. 인터페이스를 사용하는 방법: 자식객체 생성 
	RemoteControl ri = new RemoteControl_impl();
	//2.익명구현 객체
	RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOff() {System.out.println("Audio 켜기");};
		@Override
		public void turnOn() {System.out.println("Audio 끄기");};
	};
	
	void method1() {
		
		RemoteControl rc2 = new RemoteControl() {
			@Override
			public void turnOff() {System.out.println("Audio 켜기");};
			@Override
			public void turnOn() {System.out.println("Audio 끄기");};
		};
		rc2.turnOn();

	}

	void method2(RemoteControl rc) {//주소값 전달 
		rc.turnOn();
	}
}
