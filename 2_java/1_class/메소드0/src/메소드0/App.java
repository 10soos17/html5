package 메소드0;
//클래스
class 수학{
	//메소드
	//더하다 메소드 정의
	int 합하다(int 수1, int 수2) {//요약(헤더) 행동
		//상세 행동
		int 합 = 0;
		합 = 수1 + 수2;
		return 합; //return(=짝지어라=출력=반환)
		
	}
	int g() {
		return 7;
	}
	int h() {
		int a=6;
		int b=3;
		return a+b;
	}
	float x() {

		return 3.14f;
	}
}

class A{
	void g() {//void 는 리턴값이 없음
		System.out.println("aaa");
	}
}
class B{
	void g() {
		System.out.println("bbb");
	}
}

public class App {

	public static void main(String[] args) {
		수학 수학자 = new 수학();
		//System.out.println(수학자.합하다(3,4));
		//System.out.println(수학자.g());
		//System.out.println(수학자.h());
		
		//System.out.println(수학자.x());
		 
		A z1 = new A(); //z1은 A형 객체
		B z2 = new B(); //z2는 B형 객체
		z1.g();
		z2.g();
		
		수학 a = new 수학();
		System.out.println(a.합하다(7, 6));
	
	}

}
