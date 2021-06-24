package polymorphism;

public class User {

	private TVContainer container = new TVContainer();
	
	public void watchingTV(String tvName) {

		TV tv = container.getTV(tvName);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();

	}

}
