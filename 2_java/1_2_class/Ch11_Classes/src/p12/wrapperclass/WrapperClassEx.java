package p12.wrapperclass;

public class WrapperClassEx {

	public static void main(String[] args) {
		// Unboxing: Wrapper Class
		// Boxing:
		Integer i0 = new Integer("100");
		int i1 = new Integer("100");// 자동형변화
		int i2 = new Integer("200").intValue();
		int i3 = Integer.parseInt("300");
		Integer i4 = Integer.valueOf("400");
		int i5 = Integer.valueOf("FF", 16);// 16진수 ->10진수
		int i6 = Integer.valueOf("100", 2);// 2진수 ->10진수
		System.out.println(i0);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE + " bits");
		System.out.println(Integer.BYTES + " bits");
		System.out.println(Integer.TYPE);

		// 기본형을 참조형으로 형변환
		int i = (int) 10.0;
		Integer intg = (Integer) i;// 자동형변환
		Object obj = (Object) i;

		String str2 = "3.14F";
		Float i7 = Float.parseFloat(str2);
		System.out.println(i7);
		Float i8 = Float.valueOf(str2);
		System.out.println(i8);
	}

}
