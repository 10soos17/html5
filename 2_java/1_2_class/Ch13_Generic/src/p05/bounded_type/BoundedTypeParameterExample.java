package p05.bounded_type;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		
		int result1 = Util.compare(10, 20);
		System.out.println(result1);
		
		int result2 = Util.compare(10.0, 20);
		System.out.println(result2);
		
//		String result3 = Util.compare("10.0", "20"); //String 타입은 사용 불가 
//		System.out.println(result3);

	}

}
