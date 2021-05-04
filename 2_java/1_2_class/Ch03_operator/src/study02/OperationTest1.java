package study02;

public class OperationTest1 {

	//산술 연산자 테스트 
	public static void main(String[] args) {
		
		int result = 0;
		//main()에서 입력 받아서 처리하기
		int var_int1 = Integer.parseInt(args[0]);
		int var_int2 = Integer.parseInt(args[1]);
		
		// + 연산
		result = var_int1 + var_int2;
		System.out.println("var_int1 + var_int2 = " + result);
		// - 연산
		result = var_int1 - var_int2;
		System.out.println("var_int1 - var_int2 = " + result);
		// * 연산
		result = var_int1 * var_int2;
		System.out.println("var_int1 * var_int2 = " + result);
		// / 연산
		result = var_int1 / var_int2;
		System.out.println("var_int1 / var_int2 = " + result);
		// % 연산
		result = var_int1 % var_int2;
		System.out.println("var_int1 % var_int2 = " + result);

	}

}
