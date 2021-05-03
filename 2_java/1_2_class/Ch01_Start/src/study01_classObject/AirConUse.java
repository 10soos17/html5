package study01_classObject;

public class AirConUse {
	//main(): 프로그램의 시작 
	public static void main(String[] args) {
		//객체 생성 
		AirCon airCon = new AirCon();
		// 1. 변수 사용 저장 
		airCon.color = "white";
		airCon.temp = 10;
		airCon.price = 10000;
		//메소드 사용 
		airCon.tempUp();
		System.out.println("airCon.temp = " + airCon.temp + ", airCon.colr = " + airCon.color + ", airCon.price = " + airCon.price + "원");
		airCon.powerOn();
		airCon.powerOff();
		airCon.tempDown();
		System.out.println("airCon.temp = " + airCon.temp + ", airCon.colr = " + airCon.color + ", airCon.price = " + airCon.price + "원");

		
		//2. 변수에 값 저장 
		airCon.setColor("blue");
		airCon.setTemp(20);
		airCon.setPrice(20000);

		
		System.out.println("airCon.temp = " + airCon.getTemp()+ ", airCon.colr = " + airCon.getColor() + ", airCon.price = " + airCon.getPrice() + "원");
		airCon.powerOn();
		airCon.powerOff();
		airCon.tempDown();
		System.out.println("airCon.temp = " + airCon.getTemp()+ ", airCon.colr = " + airCon.getColor() + ", airCon.price = " + airCon.getPrice() + "원");
	
	}

	
}
