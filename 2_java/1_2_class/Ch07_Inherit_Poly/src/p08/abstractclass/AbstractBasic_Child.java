package p08.abstractclass;

public class AbstractBasic_Child extends AbstractBasic {
	//추상 메소드는 반드시 재정의 
	@Override
	public void methodB() {
		System.out.println("추상 메소드 재정의: methodB");
	}

	public void print() {
		System.out.println(num);
	}
}
