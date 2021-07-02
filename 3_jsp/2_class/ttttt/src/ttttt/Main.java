package ttttt;

public class Main {

	public static void main(String[] args) {
		StudentInfo st = new StudentInfo();
		
		st.setScore(10);
		System.out.println(st.getScore());


	}

}

class AAA{
	public void test() {
		String str = null;
		str.charAt(0);
	}
}

class StudentInfo{
	private String name;
	private int score;
	
	public void setScore(int sss) {
		this.score = sss;
	}
	public int getScore() {
		return this.score;
	}
	
}