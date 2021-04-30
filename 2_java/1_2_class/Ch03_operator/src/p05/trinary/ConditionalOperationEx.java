package p05.trinary;

public class ConditionalOperationEx {

	public static void main(String[] args) {
		//Operation Operator Operation
		//			a	+	b 
		int a = (int) (10 + 20 + 30.0); //대입, 산술
		String s;
		int i = 123;
		s = i + ""; //연결연산자, 숫자 + 문자열 = 문자열
		//int k = i + ""; //불가
		System.out.println("문자열 : " + s);
		int i2 = Integer.parseInt(s);
		System.out.println(i2 + 10);
		System.out.println(i2 + 10 + "abc");//133abc
		System.out.println("abc" + i2 + 10);//abc12310
		
		int aa, bb, cc = 5;
		
		aa = bb = cc = 10; //대입연산자이므로 오른쪽 왼쪽으로 진행
		
		double d = 100 * (2 / 3) % 5;
	}

}
