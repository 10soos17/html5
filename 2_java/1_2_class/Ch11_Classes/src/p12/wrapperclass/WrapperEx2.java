package p12.wrapperclass;

public class WrapperEx2 {

	public static void main(String[] args) {
		
		printDouble(123.45);
		printDouble(new Double(123.45));

	}
	
	static void printDouble(Double d) {//Boxing
		System.out.println(d);
	}

}
