package p12_package.ex1;

public class PrivateData {

	private int privateVar = 50;

	public PrivateData() {
		System.out.println("기본 생성자");
		add();
		add2();
	}

	private void add() {
		System.out.println(10);
	}

	static int add2() {
		// add(); //객체 생성 전에 호출 불가
		PrivateData pd = new PrivateData();
		pd.add();

		return 100;
	}

}
