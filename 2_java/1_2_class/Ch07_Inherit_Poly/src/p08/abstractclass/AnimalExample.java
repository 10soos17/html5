package p08.abstractclass;

public class AnimalExample {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();

		Cat c = new Cat();
		c.sound();
		animalSound(d);
		animalSound(c);
	/*	
		//PolyMorphism1
		Animal a = null;
		a = new Dog();
		a.sound();
		a = new Cat();
		a.sound();

		//PolyMorphism2
		Animal a2 = new Dog();
		Dog d2 = (Dog) a2;
		d2.sound();
		Animal a3 = new Cat();
		Cat c3 = (Cat) a3;
		d2.sound();*/
	}
	

	public static void animalSound(Animal a) {
		a.sound();
		
		Dog ani1 = new Dog();
		Cat ani2 = new Cat();
		/*
		boolean bool = ((Dog)a).equals(ani1);
		System.out.println(bool);
		bool = ((Cat)a).equals(ani2);
		System.out.println(bool);
		*/
	}
}
