package 생성자_게임유닛;


class 공격유닛{
	String t;
	
	공격유닛(String z){
		this.t = z;
	}

	public void 공격하다() {
		System.out.println(t+"공격");
	}
}
class 마린 extends 공격유닛{
	
	마린(){
		super("마린");
	}
	public void 정찰하다() {
		
		System.out.println("정찰");
	}

}

class 시즈탱크 extends 공격유닛{
	
	시즈탱크(){
		super("시즈탱크");
	}
	public void 시즈닝하다() {
		
		System.out.println("시즈닝");
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
