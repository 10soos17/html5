/*package 오버라이드;

abstract class 공격유닛{//추상적인 메소드를 가진 클래스 
	public abstract void 공격하다();//추상적인 메소드 
}

class 마린 extends 공격유닛{
	//변형하여 공격하다 포함(=오버라이드)
	@Override//annotation표기-컴파일러가 미리 부모에게 메서드가 존재하는 지 체크
	public void 공격하다() {
		System.out.println("총으로 공격");
	}
}

class 시즈탱크 extends 공격유닛{
	//변형하여 공격하다 포함
	@Override 
	public void 공격하다() {
		System.out.println("포로 공격");
	}
}

public class App {
	public static void main(String[] args) {
		마린 마린1 = new 마린();
		시즈탱크 탱크1 = new 시즈탱크();
		마린1.공격하다();
		탱크1.공격하다();
	}
}
*/

package 오버라이드;

interface 공격유닛{//구체적 메소드가 없는 클래스 
	public void 공격하다();//추상적인 메소드 
}

class 마린 implements 공격유닛{
	//변형하여 공격하다 포함(=오버라이드)
	@Override//annotation표기-컴파일러가 미리 부모에게 메서드가 존재하는 지 체크
	public void 공격하다() {
		System.out.println("총으로 공격");
	}
}

class 시즈탱크 implements 공격유닛{
	//변형하여 공격하다 포함
	@Override 
	public void 공격하다() {
		System.out.println("포로 공격");
	}
}

public class App {
	public static void main(String[] args) {
		마린 마린1 = new 마린();
		시즈탱크 탱크1 = new 시즈탱크();
		마린1.공격하다();
		탱크1.공격하다();
	}
}
