package p04.binary;
//입력값의 NaN검사 : 실수를 입력 받을 때는 반드시 NaN 검사 
public class InputDataCheckNaN {

	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);//문자열 => Double Class
		System.out.println(val);
		
		double currentBalance = 10000.0;
		//currentBalance = currentBalance+val; //NaN은 산술연산 가능 
		//currentBalance += val;
		//System.out.println(currentBalance);
		
		if(Double.isNaN(val)) {
			System.out.println("NaN입력되어 연산은 가능하지만, 숫자는 나올 수 없습니다.");
			val = 0.0;
		}
		currentBalance += val;
		System.out.println(currentBalance);

	}

}
