package study01_classObject;

public class AirCon {

	//variable
	String company;
	String color;
	int price;
	int size;
	int temp;
	
	//method
	void powerOn() {
		System.out.println("power on");
	}
	void powerOff() {
		System.out.println("power off");
	}
	void tempUp() {
		temp++;
	}
	void tempDown() {
		temp--;
	}
}
