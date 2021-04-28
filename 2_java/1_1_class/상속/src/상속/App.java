package 상속;
import 상속2.*;


public class App {
	
	public static void main(String[] args) {
		
		B B1 = new B();
		//B1.v1=4;
		B1.g1();
		B1.g2();
		
		A A1 = new A();
		//A1.v1=4;
		A1.g1();
		
		//**B가 A를 상속한 상황이기에 가능하나, B만의 메서드는 사용 불가
		A Z2 = new B();
		Z2.g1();
		

	}
}

