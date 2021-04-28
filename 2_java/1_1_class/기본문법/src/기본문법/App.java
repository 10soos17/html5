package 기본문법;
//0.객체 설명서 만들기-클래스 작성

class 자동차{
	//상태-변수
	int 기름양;
	//행동-메소드
	void 달린다() {
		System.out.println("뿌우웅");
	}
}
public class App {

	public static void main(String[] args) {
		//1. 준비 new 클래스() & 이름붙이기-참조
		자동차 내차 = new 자동차();
		//2. 식별 & 이용
		내차.달린다();//메소드 호출
	}

}
