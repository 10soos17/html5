package polymorphism;

import org.springframework.stereotype.Component;

@Component //어노테이션 - 아이디 지정하지 않으면 자동 소문자클래스명으로 
public class AppleSpeaker implements Speaker{

	public AppleSpeaker() {
		System.out.println("[!!!애플 스피커 생성자 호출됨!!!]");
	}
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("[애플 스피커] 소리를 올린다.");
		
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("[애플 스피커] 소리를 내린다.");
		
	}

}
