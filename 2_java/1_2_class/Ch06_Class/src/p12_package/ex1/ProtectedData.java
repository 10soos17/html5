package p12_package.ex1;

public class ProtectedData {

	protected int protectedVar = 50;

	protected ProtectedData() {
		System.out.println("기본 생성자");
		add();
		add2();
	}

	protected void add() {
		System.out.println(10);
	}

	static int add2() {
		// add(); //객체 생성 전에 호출 불가
		ProtectedData pd = new ProtectedData();
		pd.add();

		return 100;
	}

}
