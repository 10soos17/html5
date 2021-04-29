package p03.type_casting;

public class casting {
	//자동적(묵시적) 타입변환 - 작은 타입을 큰 타입으로, char를 수 타입으로(short제외)
	void promotionEx() {
		byte byteValue = 10;
		int intValue = byteValue; //10
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue; //유니코드 44032
		System.out.println("가의 유니코드 = " + intValue);
		
		intValue = 500;
		long longValue = intValue; //500
		System.out.println(longValue);
		
		byteValue = 10;
		double doubleValue = byteValue;
		System.out.println(doubleValue); //10.0
	}
	//강제적(명시적) 타입변환 - 수 타입을 char로, 실수와 정수 사이
	void castingEx() {
		int intValue = 44032;
		char charValue = (char) intValue; //한글 '가' 
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue; //500
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue; //3
		System.out.println(intValue);
	}
	//타입 변환 전에 미리 체크 - Byte, Short, Long, Integer, Float, Double
	//class(Wrapper).MAX_VALUE 
	//class(Wrapper).MIN_VALUE
	void checkValueBeforeCastingEx() {
		int i = 128;
		
		if(i > Byte.MAX_VALUE || i < Byte.MIN_VALUE) {
			System.out.println("byte으로 변환할 수 없습니다.");
			byte j = (byte) i; //error는 안나지만 원하지 않는 값인 -128이 저장됨 
			System.out.println(j);
		}else {
			byte j = (byte) i;
			System.out.println(j);
		}
		
	}
	//float : 부호(1) + 지수(8) + 가수(23) 
	//double : 부호(1) + 지수(11) + 가수(52)
	//123456780은 23비트로 표현 불가하기에 근사치로 변환됨 
	void fromIntToFloatEx() {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2; //1.23456784E8
		num2 = (int) num3; //123456784
		
		int result = num1 - num2; //-4
		
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(result);
	}
	//123456780은 52비트로 표현 불가하기에 원하는 값으로 변환됨 
	void fromIntToDoubleEx() {
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2; //1.2345678E8
		num2 = (int) num3; //123456780
		
		int result = num1 - num2; //0
		
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(result);
	}
	//다른 피연산자끼리 연산할 경우, 더 큰 타입으로 자동 변환됨 
	void operationPromotionEx() {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2; //error -> cpu는 데이터를 처리하는 단위가 int(4byte)임.따라서 byte 타입에 저장 불가. 따라서 int(4byte)보다 더 큰 타입으로 저장해야함 
		int intValue1 = byteValue1 + byteValue2; //30
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2; //error ->char타입의 연산 결과는 int타입으로 산출되기에 int 타입 변수에 저장해야 함 
		int intValue2 = charValue1 + charValue2; //66
		System.out.println("유니코드 = " + intValue2); 
		System.out.println("출력문자 = " + (char) intValue2); //'B'
		
		int intValue3 = 10;
		int intValue4 = intValue3/4; //2
		System.out.println(intValue4);
		
		int intValue5 = 10;
		
		//float intValue6 = intValue5 /4.0; //error -> (int) 강제 변환 or double 타입으로 저장 
		double intValue6_0 = intValue5 /4.0; //2
		float intValue6_1 = intValue5 /4.0f; //2
		int intValue6_2 = (int)(intValue5 /4.0); //2
		System.out.println(intValue6_0);
		System.out.println(intValue6_1);
		System.out.println(intValue6_2);
		
		double doubleValue = intValue5 / 4.0; //2.5
		System.out.println(doubleValue);
	}

}
