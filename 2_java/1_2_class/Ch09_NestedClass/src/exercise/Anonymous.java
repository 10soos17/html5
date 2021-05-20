package exercise;

public class Anonymous {

	//익명구현객체 
	Vehicle field = new Vehicle() {

		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");

		}
	};

	void method1() {
		//Local Inner Class: 익명구현객체 
		Vehicle localVar = new Vehicle() {
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		localVar.run();

	}

	void method2(Vehicle v) {
		v.run();
	}


}
