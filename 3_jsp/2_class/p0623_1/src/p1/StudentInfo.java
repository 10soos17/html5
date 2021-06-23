package p1;

public class StudentInfo {

	// 속성
	String name;
	int englishScore;
	int mathScore;

	// 생성자 - 값 초기화하기 위한 목적
	// this - 자신의 메모리 주소
	public StudentInfo(String name, int englishScore, int mathScore) {
		System.out.println("[테스트] 생성자11 호출됨!!!");
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	// 생성자 overloading
	public StudentInfo(String name) {
		System.out.println("[테스트] 생성자22 호출됨!!!");
		this.name = name;
	}

	public StudentInfo() {
		System.out.println("[테스트] 생성자33 호출됨!!!");
	}

	// 기능 - 메소드 : 메소드에 this 키워드가 하나도 없는 경우, 잘못된 설계
	public int calculateMean() {
		int result = (this.englishScore + this.mathScore) / 2;
		return result;
	}
	//overloading
	public int calculateMean(int weight) {
		int result = (this.englishScore + this.mathScore) / 2 * weight;
		return result;
	}

}
