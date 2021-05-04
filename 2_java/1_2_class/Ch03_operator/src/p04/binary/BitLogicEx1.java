package p04.binary;

public class BitLogicEx1 {

	public static void main(String[] args) {
		System.out.println("1 << 3   = " + (1<<3));//왼쪽으로 이동, 부호비트 없음, 빈 공간을 0으로 채움
		System.out.println("-8 >> 3  = " + (-8>>3)); //오른쪽으로 이동, 왼쪽 최상위비트(양수:0,음수:1)로 공간을 채움
		System.out.println("-8 >>> 3 = " + (-8>>>3)); //오른쪽으로 이동, 이동한만큼 왼쪽 최상위비트부터 무조건 0으로 채움

		System.out.println("1     	:" + toBinaryString(1));
		System.out.println("1<<3  	:" + toBinaryString(1<<3));
		System.out.println("-8    	:" + toBinaryString(-8));
		System.out.println("-8>>3	:" + toBinaryString(-8>>3));
		System.out.println("-8>>>3	:" + toBinaryString(-8>>>3));
		
	}
	
	public static String toBinaryString(int value) {
		
		String str = Integer.toBinaryString(value);
		
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
		
		
	}
}