package p08.abstractclass;
//Abstract Class : 추상 메소드가 존재할 때, "abstract"를 붙인다. 
//				 : 일반 클래스가 "설계도"라면, 추상클래스는 "미완성 설계도" 
//				 : 강제성, 일관성을 지키기 위해서 사용 
//				 : 객체 생성 불가 => 자식을 통한 객체 생성 가능, 재정의 가능  
public abstract class AbstractBasic {
	int num = 3;//1. 인스턴스 변수

	//2. 생성자
	public AbstractBasic() {

	}

	public AbstractBasic(int num) {
		super();
		this.num = num;
	}

	//3. 일반 메소드
	public void methodA() {
		System.out.println("methodA");
	}

	//4.추상메소드 : 선언부만 있고, Body가 없는 메소드 
	//			   메소드 앞에 반드시 "abstract"
	public abstract void methodB();

}
