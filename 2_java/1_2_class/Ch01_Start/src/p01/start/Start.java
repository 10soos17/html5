package p01.start;

//CPU - (RAM+ROM) - SSD
//6MB   16GB  1000GB
//Class: 자동차 공장의 설계도, 벽돌 공장의 벽돌을 만들기
public class Start {
	//메인메소드: 프로그램의 시작
	public static void main(String[] args) {
		//참조(Reference)변수:RAM안에서 복사된 클래스가 주소값
		Start B = new Start();//객체생성 - 주소값 저장, class를 전체 복사해서 RAM으로 (CPU에서 사용하기 위해서)
		//B.b; -> error
		System.out.println(a+"\n"+B.b);
		System.out.println(B);
		
		//Array, String(참조형변수)
		int[] d = new int[] {10,20,30,40};
		String str = new String("abcd");
		
		System.out.println("Array: " + d[0]);
		System.out.println(str.charAt(3));//charAt(index번호)
		B.abs();
		
	}
	//반환타입이 있는지 없는지에 따라 메소드 구분
	//1. 변수
	//datatype 변수 = 리터럴;
	//static : RAM에 존재
	//primitive 변수: 실제값 저장
	static int        a = 10;
	
	//instance(메소드 or 변수)
	//instance 변수
	double 	  b = 10.1;
	
	//2. 메소드(함수)
	//instance 메소드
	void abs() {
		System.out.println("abc");
	}
	
	//3.생성자
	public Start() {
		
	}
	//4. 초기화 블럭
	static {
		
	}
}
