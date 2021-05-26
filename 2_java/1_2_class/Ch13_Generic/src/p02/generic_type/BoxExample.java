package p02.generic_type;

//Generic 사용전 
public class BoxExample {
//<T>: 반드시 참조형으로 표현
	public static void main(String[] args) {
		Box<String> b1 = new Box<>();
		b1.set("hello");
		String str = b1.get();// 자동형변환, Casting(x)
		System.out.println(str);
		// b1.set(10); 불가

		Box<Integer> b2 = new Box<>();
		b2.set(10);
		int t3 = b2.get();// 자동형변환, Casting(x)
		System.out.println(t3);
		// b1.set(10); 불가

	}

}
