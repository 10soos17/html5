package exercise;

public class IntegerCompareExample {

	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);

		// 조건사용: byte,int,short타입의 값의 범위 : -128~127: "==" 사용 가능 
		System.out.println(obj1 == obj2);//true
		System.out.println(obj3 == obj4);//false

		// 사용
		System.out.println(obj1.equals(obj2));
		System.out.println(obj3.equals(obj4));
	}

}
