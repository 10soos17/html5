package 행동정의3;

class A{
	//두 정수를 입력받아 합을 출력하는 행동
	//메소드 헤더 
	int 합하다(int 수1, int 수2)
		//메소드 바디
	{
		//1. 두 수의 입력 받는다.
		//2. 두 수의 합을 구한다.
		int 합 = 수1 + 수2;
		//3. 합을 출력한다.
		return 합;
		
	}
	void 열까지화면출력하다() {
		int 회 = 1;
		while(회 <= 10){
			//반복 
			System.out.println(회);
			회 += 1;
		}
	}
	int 큰수를구하다(int 수1, int 수2) {
		int 큰수 = 0;
		if(수1 > 수2)
			큰수 = 수1;
		else
			큰수 = 수2;

		return 큰수;
	}
}


public class App {

	public static void main(String[] args) {
		A A1 = new A();
		System.out.println(A1.합하다(3,4));
		A1.열까지화면출력하다();
		System.out.println(A1.큰수를구하다(4,9));

	}

}
