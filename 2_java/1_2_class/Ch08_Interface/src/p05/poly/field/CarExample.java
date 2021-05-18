package p05.poly.field;

public class CarExample {

	public static void main(String[] args) {
		Car c = new Car();
		c.run();
		//Interface의 배열의 다형성 
		c.tires[0] = new KumhoTire();
		c.tires[1] = new KumhoTire();
		c.run();

	}

}
