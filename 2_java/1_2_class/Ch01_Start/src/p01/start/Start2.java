package p01.start;

//static -RAM / static 아닌 변수,메소드 사용하려면 객체(주소값저장)생성해서 RAM에 저장해야함

public class Start2 {
	//System.out.println(b);->error, 반드시 메소드 안에서 사용
	short b = 20;
	//메인 메소드 :: 프로그램 시작
	public static void main(String[] args) {
		int a = 10;
		
		Start2 S = new Start2();
		
		System.out.println(a);
		
		int bb = S.b;
		System.out.println(bb);
		
		//클래스가 다른 경우 반드시 "클래스명.메소드"
		//같은 클래스안에 있는 static 메소드인 경우 클래스명 생략
		S.add();
		add2(); //or Start2.add2(); or S.add2();-좋지않은 방법
		System.out.println(S.add3());
		
		char[] c = {'a', 'b', 'c'};
		
		//static String copyValueOf(char[] data)
		//copyValueOf 메소드는 String class 내의 메소드임
		//char[] 내용들을 String으로 바꿔주는 메소드
		String s1 = String.copyValueOf (c);
		System.out.println("s1:: " + s1);// = String s2 = new String();	s2.copyValueOf(c);
	
	}
	
	void add() {
		System.out.println(5+4);
	}
	static void add2() {
		
		System.out.println(4);
	}
	boolean add3() {
		return false;
		//System.out.println(5+4);
	}
}
