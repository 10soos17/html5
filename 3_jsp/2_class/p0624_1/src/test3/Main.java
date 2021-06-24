package test3;

public class Main {
	public static void main(String[] args) {
		Test a = new AAA();
		a.method1();
	}

}

//인터페이스 - 완벽한 추상화 
//생성 x, 메소드 구현 x /변수는 만들 수 있음(ex. Tv tv = null)
//접근제한자 public 이어야함 (따라서 생략가능), abstract(생략 가능) 
interface Test {
	// public abstract void method1();
	// public void method1();
	void method1();// 위하고 똑같음
}

class AAA implements Test {
	public void method1() {
		System.out.println("안녕하세요");
	};
}


