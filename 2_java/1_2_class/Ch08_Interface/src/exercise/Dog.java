package exercise;

public class Dog implements Soundable {

	//강제성, 일관성 
	@Override
	public String sound() {
		String str = "멍멍";
		return str;
	}

}
