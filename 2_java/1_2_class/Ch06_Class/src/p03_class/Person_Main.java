package p03_class;

public class Person_Main {

	public static void main(String[] args) {
		int num1 = 2, num2 = 2;
		if (num1 == num2)
			System.err.println("같다");
		// if(num1.equals(num2)) System.out.println("같다");//equals: 문자열이나 객체 비교시에만 사용

		String name1 = new String("홍길동");
		String name2 = new String("홍길동");
		System.out.println("name1: " + name1);
		if (name1.equals(name2))
			System.out.println("같다");

		System.out.println(name1);

		Person p1 = new Person("홍길동p", 20);
		Person p2 = new Person("홍길동p", 20);
		System.out.println("p1(주소값->생성자값: " + p1);
		System.out.println("p1(주소값->생성자값: " + p1.toString());

		if (p1.equals(p2))
			System.out.println("p1 = p2 같다");
		else
			System.out.println("p1 = p2 같지않다");
	}

}
