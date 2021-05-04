package p04.binary;

public class Hello {
	String name;
	
	//1.Constructor Overloading(생성자 오버로딩)
	//기본생성자
	public Hello() {
		
	}

	//파라미터가 있는 생성자 
	public Hello(String name) {
		super();
		this.name = name;
	}
	
	//2.재정의
	@Override
	public String toString() {
		return name;
	}

}
