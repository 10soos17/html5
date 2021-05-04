package study02;

public class OperationTest5 {
	//종합 연산자 테스트 
	public static void main(String[] args) {
		int var_inc = 1;
		int var_dec = 1;
		int result = 0;
		
		result = var_inc++;
		System.out.println("result = "+ result);//1
		System.out.println("var_inc = "+ var_inc);//2
		
		result = ++var_inc;
		System.out.println("result = "+ result);//3
		System.out.println("var_inc = "+ var_inc);//3
		//--
		result = var_dec--;
		System.out.println("result = "+ result);//1
		System.out.println("var_inc = "+ var_dec);//0
		result = --var_dec;
		System.out.println("result = "+ result);//-1
		System.out.println("var_dec = "+ var_dec);//-1
	}


}
