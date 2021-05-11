package p06_field;

public class CarExample {

	public static void main(String[] args) {
		//1.변수를 통한 저장/출력
		Car car1 = new Car();
		car1.speed = 60;
		System.out.println("제작회사: " + car1.company + "\n모델명: "+car1.model + "\n색깔: "+car1.color+ "\n최고속도: "+car1.maxSpeed + "\n현재속도: "+car1.speed);
		
		//2.생성자를 통한 저장/출력
		Car car2 = new Car("현대자동차","소나타","빨강", 200, 100);
		System.out.println("-------------------------------");
		System.out.println(car2);
		
		//3.getter(), setter()를 통한 저장/출력
		Car car3 = new Car();
		car3.setCompany("아우디");
		car3.setModel("");
		car3.setColor("검정");
		car3.setMaxSpeed(350);
		car3.setSpeed(60);
		System.out.println("-------------------------------");
		System.out.println("제작회사: " +car3.getCompany() + "\n모델명: " + car3.getModel() + "\n색깔: " + car3.getColor()+ "\n최고속도: " + car3.getMaxSpeed() + "\n현재속도:" + car3.getSpeed());
		
	}

}
