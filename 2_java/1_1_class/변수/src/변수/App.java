package 변수;

class 학생{
	//멤버 변수
	public int 나이; //객체인 동안 값 유지
	public String 성명;
	
	public void 공부하다() {
		//메소드 변수
		int 공부시간; //행동하는 동안(메소드 처리 동안)만 값 유지
		공부시간 = 3; 
		
		System.out.println(공부시간);
	}
}

public class App {

	public static void main(String[] args) {
		

	}

}
