package p11_final;
//변수 앞에 final: 고정상수(값 변경 불가)
public class C {
	public static final int NUM = 100; //고정상수: 한번 값 입력은 프로그램 종료 시까지 유지(변경 불가)
	
	public static void main(String[] args) {
		final double pi = 3.14159;
		System.out.println(NUM);
		//NUM = 200; //값 변경 불가 
		//pi = 5.5; //값 변경 불가 
		
	}
}
