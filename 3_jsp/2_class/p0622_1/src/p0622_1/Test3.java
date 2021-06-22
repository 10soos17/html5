package p0622_1;

public class Test3 {

	public static void main(String[] args) {
		//배열 생성할 때
		//변수 - stack 주소값 
		//객체 - heap 
		//[] - 배열에서 메모리 접근 연산자 ex) .
		int [] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		
		//arr 변수에 새로운 주소값 들어감 & heap에 새로운 주소값에 4개짜리 배열 생성
		//그 전에 생성했던 heap영역의 주소값 공간은 소멸 
		arr = new int[4]; 
		
		System.out.println(arr[0]);
		
		//그 전에 생성했던 heap영역의 주소값 공간은 소멸 
		arr = null;
		
		//nullPointerException - []때문에 오류가 발생함 
		System.out.println(arr[0]); 
		
	}

}
