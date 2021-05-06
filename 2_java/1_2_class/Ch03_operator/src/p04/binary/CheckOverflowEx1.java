package p04.binary;

public class CheckOverflowEx1 {

	public static void main(String[] args) {
		try {
			int result = CheckOverflowEx1.safeAdd(2000, 20000);//2. 호출한 메소드에 가서 예외처리
			System.out.println(result);
		}catch(Exception e) {
			System.out.println("3.Overflow가 발생하여  정확하게 계산할 수 없음");
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public static int safeAdd(int left, int right) {
		System.out.println("Integer.MAX_VALUE : " + Integer.MAX_VALUE );
		if(right > 0) {
			if(left > (Integer.MAX_VALUE - right))
				throw new ArithmeticException("오버플로우 발생1"); //1. 강제적으로 예외 발생하기 
		}
		else {
			if(left < (Integer.MIN_VALUE - right))
				throw new ArithmeticException("오버플로우 발생1");
		}
		return left + right;
		
	}

}
