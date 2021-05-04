package p04.binary;

public class StringEqualsEx1 {
// "==" : 숫자 비교시 사용
// equals() : 문자열 비교, 객체 비교시 사용	
	
	//모든 클래스의 부모 클래스인 Object class 안에 있는 메소드, 모든 클래스가 자동으로 상속받아 사용
	public static void main(String[] args) {
		
		//제조사가 만든 클래스
		String str1 = "홍길동"; //생성된 객체가 있으면 연결해서 사용
		String str2 = "홍길동"; //생성된 객체가 있으면 연결해서 사용
		String str3 = new String("홍길동"); //객체생성
		String str4 = new String("홍길동"); //객체생성
		
		System.out.println(str1); //1주소값이 아닌 생성자값이 출력됨 : 제조사 개발자 프로그램 변경
		System.out.println(str1.toString()); //1주소값이 아닌 생성자값이 출력됨 : 제조사 개발자 프로그램 변경
		
		//우리가 만든 클래스
		Hello h = new Hello("홍길동");
		System.out.println(h); //2내가 만든 객체는 주소값 출력됨 -> 값 출력하려면 @Override public String toString()
		System.out.println(h.toString());
		System.out.println("--------------------------");
		System.out.println(str1 == str2); //true
		System.out.println(str1 == str3); //false
		System.out.println();
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1.equals(str3)); //true
		
	}

}
