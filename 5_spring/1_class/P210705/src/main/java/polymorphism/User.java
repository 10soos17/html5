package polymorphism;

import org.springframework.context.support.GenericXmlApplicationContext;

public class User {

	public static void main(String[] args) {
		//Spring Container 가동 
		GenericXmlApplicationContext container = 
				new GenericXmlApplicationContext("ttt.xml");
		TV tv = (TV)container.getBean("tv"); //ttt.xml 파일 안에 id가 tv인 Bean
		
//		SamsungTV tv = null;
//		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();	
	}

}
