package p0622_1;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("안녕하세요.");
		
		//ex1.
		//a라는 이름을 가진 int형 변수에 10의 값을 초기화(4byte크기를 가진 저장공간을 RAM 에 생성-stack영역) 
		int a = 10;
		a = 20;
		
		//a라는 이름을 가진 메모리 공간이 이미 존재하고 소멸되지 않았기에 아래 불가능
		//소멸시점 - scope를 빠져나갈때
		//int a = 30; 
		
		//ex2.
		int b = 15;
		int c = 0;
		if(b<20) {
			//int c = 50; 
			c = 50; 
			System.out.println(c);
		}
		
		System.out.println(c);
		
		//RAM - stack(변수생성) heap(인스턴스 생성)
	}
	
	

}
