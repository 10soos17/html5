package 상속2;

class A{
	//결과형 표기가 없고 이름이 클래스명과 동일한 메소드 
	A(){//생성자 - 객체가 생성되었을 때, 해야할 행동을 적은 메소드
		System.out.println("나 나왔어요.");
	}
}
public class App {

	public static void main(String[] args) {
		new A();

	}

}
