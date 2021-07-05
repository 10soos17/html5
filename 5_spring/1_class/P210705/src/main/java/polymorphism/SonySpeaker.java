package polymorphism;

public class SonySpeaker implements Speaker{

	public SonySpeaker() {
		System.out.println("[!!!소니 스피커 생성자 호출됨!!!]");
	}
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("[소니 스피커] 소리를 올린다.");
		
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("[소니 스피커] 소리를 내린다.");
		
	}

}
