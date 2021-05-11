package p10_static;

//initial Block
public class Product {
	static int count;
	int serialNo;
	int add;

	{
		System.out.println("2. Instance Initial Block: 객체생성시");
		++count;
		serialNo = count;
	}

	static {

		System.out.println("1. static initial block: 프로그램 실행시");

	}

	public Product() {
		System.out.println("3. 기본생성자: 파라미터가 없는 생성자 일때 실행");
	}

}
