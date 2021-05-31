package exercise;

public class Student {
	private String name;
	private int eng;
	private int mat;

	public Student(String name, int eng, int mat) {
		this.name = name;
		this.eng = eng;
		this.mat = mat;
	}

	public String getName() {
		return name;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}


}
