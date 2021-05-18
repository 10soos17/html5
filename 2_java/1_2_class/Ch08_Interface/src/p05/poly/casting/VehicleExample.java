package p05.poly.casting;

public class VehicleExample {

	public static void main(String[] args) {
		// 1.old
		Bus b = new Bus();
		b.run();
		b.checkFare();

		// 2.new:polymorphism1
		Vehicle v = new Bus();
		v.run();
		((Bus) v).checkFare(); // Casting

		// 3. new: polymorphism2
		Vehicle v2 = new Bus();
		v2.run();
		Bus b2 = (Bus) v2;
		b2.checkFare(); // Casting
		
		
	}

}
