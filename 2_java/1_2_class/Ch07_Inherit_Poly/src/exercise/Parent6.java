package exercise;
//ch07: 5~8
//ch08: ~362
public class Parent6 {
	public String nation;

	public Parent6() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Parent6(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
