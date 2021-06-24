package p1;

public class Test2 {

	public static void main(String[] args) {
		int a = 10;
		byte b = 20;
		double c = 0.1;
		
		//참조형 변수 생성과 초기화할 때, 저장 방식 
		//변수 생성 - stack에 d라는 변수 생성(그안에 주소값)
		//객체 생성 - heap에 변수 d가 갖고있는 주소값에 객체 "안녕하세요"저장 
		String d = new String("안녕하세요");
		
		//a = null; // primitive 타입에 null값 넣을 수 없음
		d = null; // reference 타입에 null값 넣는 것의 의미 -> 아무 메모리도 가리키지 않음 ->  이 경우, heap에 생성되었던 객체 소멸(gc가 자동처리)  
		
		{
			String e = new String("안녕하세요");
		}

	}

}
