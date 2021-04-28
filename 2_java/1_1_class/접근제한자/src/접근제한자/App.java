package 접근제한자;
/*
private 자신 
protected 자신 > 포함한 
public 자신 > 포함한 > 다른 모두 
default 자신 > 동일 패키지 
*/
class 사람{
	private int 행복감 = 10;
	
	public void 휴식을취하다() {
		this.행복감 = this.행복감 + 10; //this 생략가능 
	}
	private void 소화시키다() {
		
	}
	public void 식사하다() {
		this.소화시키다(); //this 생략가능 
	}
	
}
class AA{
	private void g() {
		
	}
	public void h() {
		g();
	}
}
public class App {

	public static void main(String[] args) {
		사람 철수 = new 사람();
		//철수.행복감 = 100; -> 행복감은 private 변수라 접근 불가
		철수.휴식을취하다();
		//철수.소화시키다(); -> 소화시키 private 메소드라 접근 불가 
		철수.식사하다();
		
		AA A1 = new AA();
		A1.h();
		
		
		
	}

}
