package p03.functional_interface;

public class MfClass implements MyInterface {

	@Override
	public void calculate(int x, int y) {
		System.out.println(x*y);

	}

}
