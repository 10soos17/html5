package p01.variable;

//Cpu - RAM - SSD
//자바는 대소문자를 구분 
//Variable(변수): 하나의 값을 저장할 수 있는 메모리(RAM)공간 
//				 선언된 범위 안에서만 사용 
public class VariableEx {
	//전역(field)변수 - 초기화 불필요, 기본값이 들어 있음 
	//Instanace 변수 - 객체를 생성해야 사용할 수 있는 변수 
	int a; //기본값(default) 저장됨 (int의 기본값은 0)
	boolean b;//boolean의 기본값은 false
	float c; //0.0
	
	int result;
	//int while; 예약어는 사용 불가 
	
	//정적(static)변수 - "클래스명.변수" 형태로 사용 
	public static void main(String[] args) {
		//primitive type variable: 실제
		int value = 10; //초기화된것 
		//Reference type variable : 주소값 
		String s = new String("홍길동");
		
		//local variable(지역) : 메서드 안에서 선언된 변수, 반드시 초기화 - 시작할 때 값이 있어야 한다. 
		VariableEx v = new VariableEx();
		System.out.println(v.a);
		System.out.println(v.b);
		System.out.println(v.c);
		
		v.result = value + 10;
		
		double a = 5.0;
		float b = 4.1f;
		int r2 = v.add(a, b);
		
		System.out.println(v.add(a, b)); //Argument(인수)
		System.out.println(v.r);
	}
	
	
	int r = a + result;

	
	//Parameter 변수: double a, float b
	//local 변수 
	int add(double a, float b) {
		double result = a + b; 
		return (int) result; //강제형변환(casting)
	}
}
