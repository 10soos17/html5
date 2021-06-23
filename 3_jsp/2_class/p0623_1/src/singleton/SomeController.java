package singleton;

public class SomeController {
	
	private static final SomeController instance = new SomeController();
	
	public static SomeController getInstance() {
		return instance;
	}
	
	//싱글톤 코드 - 단 한개의 인스턴스만 허용한다.
	private SomeController(){
		//...필요에 따라서 초기화 코드를 작성 
	}
	
	///////////////내용들/////////////////////////
	//속성
	private int value1;
	private int value2;
	
	//기능
	public void printSum() {
		System.out.println(this.value1 + this.value2);
	}
	
	
}
