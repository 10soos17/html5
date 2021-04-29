package p02.datatype;

public class ByteExample {

	public static void main(String[] args) {
		
		ByteEx();
		garbageEx();
		charEx();
		intEx();
		floatDoubleEx();
		booleanEx();

	}
	
	static void ByteEx() {
		//byte 타입은 1byte 저장(-128~127까지) -> var6 error;
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		//byte var6 = 128;
		byte var6 = (byte)128; // 강제 타입변환하면 -127값으로 저장
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
	}
	
	static void garbageEx() {
		byte var7 = 125;
		int var8 = 125;
		
		for(int i = 0; i < 5; i++) {
			var7++; //값 초과시 자동으로 -128 부터 저장되기 시작 
			var8++;
			System.out.println("var7: " + var7 + "\t" + "var8 :" + var8);
		}

	}
	
	static void charEx() {
		char c1 = 'A';
		char c2 = 65; //10진수 유니코드로 영어 'A'
		char c3 = '\u0041'; //16진수 유니코드로 영어 'A'
		
		char c4 = '가';
		char c5 = 44032; // 10진수 유니코드로 한글 '가' 
		char c6 = '\uac00'; //16진수 유니코드로 한글 '가' 
		
		int uniCode = c1; //숫자로 65
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);	
	}
	
	static void intEx() {
		int i1 = 10; //10진수 
		int i2 = 012; //8진수 
		int i3 = 0xA; //16진수 
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);	
	}
	
	static void longEx() {
		long l1 = 10;
		long l2 = 20L;
		//long l3 = 1000000000000; -> error long 타입은 L(l) 붙여줘야함 
		long l4 = 1000000000000L;
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l4);
	}
	
	static void floatDoubleEx() {
		double d1 = 3.14;
		//float d2 = 3.14; -> error float 타입은 F(f) 붙여줘야함 
		float d3 = 3.14F;
		
		System.out.println(d1);
		System.out.println(d3);
		
		double d4 = 0.1234567890123456789;
		float d5 = 0.1234567890123456789F; //0.12345679 까지 출력됨 
		
		System.out.println(d4);
		System.out.println(d5);
		
		int d6 = 3000000;
		double d7 = 3e6;
		float d8 = 3e6F;
		double d9 = 2e-3;
		
		System.out.println(d6); //3000000
		System.out.println(d7); //3000000.0
		System.out.println(d8); //3000000.0
		System.out.println(d9); //0.002
	}
	
	static void booleanEx() {
		
		boolean stop = true;
		
		if(stop) {
			System.out.println("stop");
		} else {
			System.out.println("start");
		}
	}

}
