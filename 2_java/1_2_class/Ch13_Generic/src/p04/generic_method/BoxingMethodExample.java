package p04.generic_method;

public class BoxingMethodExample {

	public static void main(String[] args) {
		Box<Integer> b1 = Util.boxing(100);
		int intValue = b1.getT();
		System.out.println(intValue);
		
		Box<String> b2 = Util.boxing("홍길동");
		String name = b2.getT();
		
		System.out.println(name);
	}

}
