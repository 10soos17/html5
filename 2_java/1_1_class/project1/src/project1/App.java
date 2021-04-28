package project1;

//클래스란? 객체 설명서(Object description)로 이해하기 
//정의(설명) 준비(생성) 식별(지정) 이용 정리 
class 학생{
	public void 보드를닦는다() {
		System.out.println("보드를 닦는다");
	}
	public void 바닥을닦는다() {
		System.out.println("바닥을 닦는다");
	}
	
}

public class App {

	public static void main(String[] args) {
		//객체 생성하는 법? 클래스명 참조변수명 = new 클래스명 
		//식별자? 참조변수명
		학생 철수 = new 학생();
		학생 순이 = new 학생();
		철수.바닥을닦는다();
		순이.보드를닦는다();

	}

}
