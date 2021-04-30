package p02.datatype;

public class DataTypeEx2 {

	public static void main(String[] args) {
		short sh = 12;//2byte -32768 ~ 32767
		//primitive Type : int (default) - 사칙연산시, int 타입으로 바뀐 후, 연산이 이루어짐
		int n = sh; //promotion(자동 형변환)
		
		char c = 'A';//2byte 0 ~ 65535
		System.out.println(c);
		int n2 = c;
		System.out.println(n2);//65
		System.out.println(c+1);//66
		System.out.println(n2);//66
	
		char c2 = (char)(c+1); //int타입을 char타입으로 자동 형변환 안됨 -> 강제 형변환(castion) 해야함 : int 타입으로 연산
		System.out.println(c2);//B
		char c3 = c2; 
		System.out.println(c3);//B
		
		char c4 = '\u0041';//unicode, 16진수
		int n3 = c4; //자동 형변환(promotion) 
		System.out.println(c4);
		//double(8byte=64bit): 1bit(부호) + 52bit(가수) + 11bit(지수) (예) 12345.789 = 12345789(가수) x 10**5(지수)
		//float(4byte=32bit):1bit(부호)+23bit(가수)+8bit(지수)
		double d = 23.9;
		//double(8Byte): 소숫점에서 기본형(D, d 붙여도 관계없음)
		float f1 = 23.9f;
		float f2 = (float) 12.3d; //Casting)강제형변환: 8 -> 4)
		
	}

}
