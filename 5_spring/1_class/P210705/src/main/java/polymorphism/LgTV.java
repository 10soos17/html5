package polymorphism;

public class LgTV implements TV{
	public LgTV() {
		System.out.println("[엘지 TV] 생성자 호출됨!!!]");
	}

	@Override
	public void powerOn() {
		System.out.println("[엘지 TV] 전원을 켠다.");

	}

	@Override
	public void powerOff() {
		System.out.println("[엘지 TV] 전원을 끈다.");

	}

	@Override
	public void volumeUp() {
		System.out.println("[엘지 TV] 소리를 올린다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("[엘지 TV] 소리를 내린다.");

	}
}
