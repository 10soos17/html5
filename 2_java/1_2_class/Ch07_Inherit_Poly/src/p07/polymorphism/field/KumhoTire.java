package p07.polymorphism.field;

public class KumhoTire extends Tire {
	//필드
	//생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation; //누적 회전수 1회 증가 
		if(accumulatedRotation<maxRotation) { //정상회전 
			System.out.println(location + " KumhoTire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
			
		}else {//펑크 
			System.out.println("***" + location + " KumhoTire 펑크 ***");
			return false;
			
		}
	}
	
	
}
