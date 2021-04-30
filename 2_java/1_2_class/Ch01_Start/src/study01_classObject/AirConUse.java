package study01_classObject;

public class AirConUse {

	//AirCon airCon = new AirCon();
	public static void main(String[] args) {
		//Object
		AirCon airCon = new AirCon();
		//Variable
		airCon.color = "white";
		airCon.temp = 10;
		airCon.price = 10000;
		
		//method
		airCon.tempUp();
		System.out.println("airCon.temp = " + airCon.temp + ", airCon.colr = " + airCon.color + ", airCon.price = " + airCon.price + "원");
		airCon.powerOn();
		airCon.powerOff();
		airCon.tempDown();
		System.out.println("airCon.temp = " + airCon.temp + ", airCon.colr = " + airCon.color + ", airCon.price = " + airCon.price + "원");

	}

	
}
