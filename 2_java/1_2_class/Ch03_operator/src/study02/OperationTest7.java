package study02;

public class OperationTest7 {
	//시프트 연산자 테스트 
	public static void main(String[] args) {
		
		int x = 3;
		int result = 0;
		
		//<<
		System.out.println("x << 2 = "+(x<<2));
		//>>
		x = -1;
		System.out.println("x >> 1 = "+(x>>1));
		//>>>
		System.out.println("x >>> 1 = "+(x>>>1));

	}

}
