package polymorphism;

public class MyTV implements TV {

	public void powerOn() {
		System.out.println("[MY] 전원 켠다.");

	}

	public void powerOff() {
		System.out.println("[MY] 전원 끈다.");

	}

	public void volumeUp() {
		System.out.println("[MY] 소리 올린다.");

	}

	public void volumeDown() {
		System.out.println("[MY] 소리 내린다.");

	}

}
