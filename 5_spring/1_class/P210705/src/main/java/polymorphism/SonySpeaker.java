package polymorphism;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component : 잘 안씀 
//@Controller : MVC 에서 Controller에 해당하는 
//@Service : MVC에서 Model에 해당하는 (비지니스 코어 로직)
//@Repository : DB 연동 객체 (잘 안씀 ... DB연동을 다른 프레임 워크를 사용할 것이기에) 
public class SonySpeaker implements Speaker {

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
