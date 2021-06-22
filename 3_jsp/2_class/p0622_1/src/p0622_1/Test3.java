package p0622_1;

public class Test3 {

	public static void main(String[] args) {
		
		//2차원 배열 
		//9개의 메모리 공간 생성
		//변수 arr - stack 
		//배열 객체 - heap
		//2개 배열 생성 (각각 1중배열의 주소값 가리킴)
		//1중 배열로 3개 배열 메모리가 2개 생성 
		int [][] arr = new int [2][3];
		
		arr[0][0] = 20;
		arr[1][2] = 50;
		
		//arr[0] = 11;
		arr[0] = null;//첫번째 1중배열 소멸(gc가 소멸)
		arr[0] = new int[5];//첫번째 1중배열 가리키는 주소값 변경 && 5개짜리 배열 메모리 공간 생성 
		
		
		
	}

}
