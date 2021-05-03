package p04.binary;

public class AccuracyEx1 {

	int a = 10;
	
	public static void main(String[] args) {

		int apple = 1;
		//double apple = 1.0;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		System.out.println(result);
		
		System.out.println("++++++++++정확하게 계산시 부동소숫점을 사용하지 않는다.");
		
		int totalPieces = apple * 10;
		int temp = totalPieces - number;
		double result2 = temp/10.0;
		System.out.println(result2);
	}

}
