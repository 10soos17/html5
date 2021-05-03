package study01_classObject;




//class 파일로 가능 : 1. public class 
//				   2.main()가 있는 클래스 
public class AirTest {
	
	public static void main(String[] args) {
		//1.변수에 직접 저장 
		Air a1 = new Air();
		a1.name = "홍길동1";
		
		//2.setter()를 통한 저장 
		Air a2 = new Air();
		a2.setName("홍길동2");
		System.out.println(a2.getName());
		
		String result = a2.getName();
		System.out.println(result);
		
		//3.생성자를 통한 데이터 저장 
		Air a3 = new Air("홍길동3");
		System.out.println(a1.name);
		System.out.println(a3.getName());

		
	}

}
