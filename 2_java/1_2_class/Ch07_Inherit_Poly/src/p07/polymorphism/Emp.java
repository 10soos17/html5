package p07.polymorphism;
//instanceof : 형변환 가능 확인 
public class Emp {
	//부모 클래스의 눈으로 생성된 자식을 바라보면 
	//Game b2 = new BaseBall();//상속관계에서만 가능
	//b2.type(); //Promotion(자동형변환)
	//((BaseBall)b2).write();//Casting(강제형변환)
	
	//Emp e1 = new Emp();
	
	//Parameter의 다형성 
	public void taxRate(Emp e) { //Emp: Emp, SalesMan, Engineer Class 사용 
		if(e instanceof SalesMan) {
			SalesMan s = (SalesMan)e;
			System.out.println("SalesMan 세금 구하기");
		}else if(e instanceof Engineer) {
			Engineer en = (Engineer)e;
			System.out.println("Engineer 세금 구하기");			
		}else if(e instanceof Emp) {
			System.out.println("Emp 세금 구하기");
		}
	}
}
