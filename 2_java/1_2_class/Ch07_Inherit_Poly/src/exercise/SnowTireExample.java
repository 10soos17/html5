package exercise;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		snowTire.run();
		
		Tire tire = new Tire();
		tire.run();

		tire = snowTire;
		tire.run();
		
		

	}

}
