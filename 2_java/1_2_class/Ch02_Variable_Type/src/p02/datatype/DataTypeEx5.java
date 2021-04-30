package p02.datatype;

public class DataTypeEx5 {

	public static void main(String[] args) {
		int intValue = 10;
		double doubleValue = 5.5d;
		double result = intValue + doubleValue; //10.0 + 5.5
		int result2 = (int)(intValue + doubleValue);//(10.0 + 5.5) -> 15
		int result3 = intValue + (int)doubleValue;//10+ 5 -> 15

		byte b1 = 127;
		byte b2 = 127;
		byte b3 = (byte)(b1 + b2);//Castingㄴ
		System.out.println("컴파일 에러는 아니지만 원하는 값이 아님: " + b3);
		int r1 = b1 + b2;
		
		int intValue5 = 10;
		int intValue6 = (int)(10/4.0); //10.0 / 4.0 = 2.5 연산 후, int 강제 형변환
	}

}
