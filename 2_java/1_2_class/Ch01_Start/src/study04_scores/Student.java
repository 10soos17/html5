package study04_scores;

public class Student {

	String name;
	int kor;
	int math;
	int eng;
	
	
	public Student() {
		
	}
	public Student(String name, int[] arr) {
		this.name = name;
		this.kor = arr[0];
		this.math = arr[1];
		this.eng = arr[2];
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	
}
