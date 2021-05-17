package exercise;

public class Child6 extends Parent6 {
	private String name;
	
	public Child6() {
		this("홍길동");
		System.out.println("Child() call");
	}
	public Child6(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
