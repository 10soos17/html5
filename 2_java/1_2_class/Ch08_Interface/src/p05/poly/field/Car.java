package p05.poly.field;

public class Car {

	// String str2 = new String(); //자기자신 객체생성 가능
	// String str = new Car(); //동등한 형제관계 객체생성 불가

	// Interface의 필드 다형성
	// Tire frontLeftTire = new HankookTire();
	// Tire frontRightTire = new HankookTire();
	// Tire backLeftTire = new HankookTire();
	// Tire backRigthTire = new HankookTire();

	// Tire[] tires = new Tire[4];
	// tires[0] = new HankookTire();
	// tires[1]= new HankookTire();
	// tires[2] = new HankookTire();
	// tires[3] = new HankookTire();

	Tire[] tires = { new HankookTire(), new HankookTire(), new HankookTire(), new HankookTire() };

	void run() {
		for (Tire t : tires)
			t.roll();

	}
}
