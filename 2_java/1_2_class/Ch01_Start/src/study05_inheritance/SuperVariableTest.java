package study05_inheritance;
class Sawon3{
	String name = "홍길동";
}

class Sales3 extends Sawon3{
	String name= "BetaGo";
	
	String displayInfoLocal() {
		String name = "AlphaGo";
		return name;
	}
	String displayInfoThis() {
		String name = "AlphaGo";
		return this.name;
	}
	String displayInfoSuper() {
		String name = "AlphaGo";
		return super.name;
	}
	
}
public class SuperVariableTest {

	public static void main(String[] args) {
		Sales3 s = new Sales3();
		System.out.println("local.name = "+s.displayInfoLocal());
		System.out.println("this.name = "+s.displayInfoThis());
		System.out.println("super.name = "+s.displayInfoSuper());
	}

}
