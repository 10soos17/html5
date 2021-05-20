package exercise;

public class SoundableExample {
	// Parameter polyMorphism
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {

		printSound(new Cat());
		printSound(new Dog());
		
		//익명구현 객체 
		Soundable s = new Soundable() {
			@Override
			public String sound() {
				return "구구";
			}
		};
		
		printSound(s);

	}

}
