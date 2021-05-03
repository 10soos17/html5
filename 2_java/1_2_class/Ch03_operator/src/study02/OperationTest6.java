package study02;

public class OperationTest6 {

	//비트 연산자 테스트 
	public static void main(String[] args) {
		int x = 8;
		int y = 3;
		int result = 0;
		boolean bResult = false;
	
		/*비트로 변경
		 8: 00000000 00000000 00000000 00001000
		 3: 00000000 00000000 00000000 00000011
		 */
		
		//&
		System.out.println("x & y = "+(x&y));
		System.out.println("true & false = "+bResult);
		
		//|
		System.out.println("x | y = "+(x|y));
		System.out.println("true & false = "+!bResult);
		// ^ : XOR ,두 피연산자의 대응되는 비트에서 서로 같은 경우에는 0을, 다른 경우에는 1을 반환
		System.out.println("x ^ y = "+(x^y));
		System.out.println("true ^ false = "+!bResult);
	}

}
