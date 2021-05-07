package p01.reference;

public class PointEx3 {

	public static void main(String[] args) {

		int a;
		String str;// 선언과 객체 생성은 다름
		
		//2.클래스 타입의 변수 선언
		Point p1;// 아무 값도 참조하지 않은 상태

		// System.out.println(p1);
		// System.out.println(p1.x);//아무도 대입하지 않음

		//3.예외처리(try~catch)
		Point p2 = null;// 참조
		// System.out.println(p2.x);//NullPointerException
		// System.out.println(p2.y);//NUllPointerException

		try {
			Point p3 = null;
			System.out.println(p3.y);// NullPointerException
			System.out.println(p3.y);// NullPointerException
		} catch (NullPointerException e) {
			System.out.println("참조하는 값이 없습니다.");
			;
		} catch (Exception e) {

		}
		System.out.println("Done");

		//4.예외처리 (if, return을 이용한)
		Point p4 = null;
		if(p4 == null) {
			System.out.println("p4가 가리키는 객체가 없습니다.");
			return;//메인 메소드를 호출한 JVM(자바시스템)으로 가겠다
		}
		System.out.println(p4.y);// NullPointerException
		System.out.println(p4.y);// NullPointerException
		
		System.out.println("return이 있으므로 실행하지 않음...");
		
		abc();
		
	}
	
	static public int abc() {
		return 10;
	}

}
