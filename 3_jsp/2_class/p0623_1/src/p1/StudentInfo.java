package p1;

public class StudentInfo {

	// 속성
	//속성은 private으로 만들 것
	//private 직접 접근 시, 컴파일에러 발생
	//private 만드는 이유 - 직접 속성값 접근 막기 위해 + 메소드와 구분해서 사용 위해
	private String name;	
	private int englishScore;
	private int mathScore;
	
	//getter(), setter()
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnglishScore() {
		return this.englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	public int getMathScore() {
		return this.mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

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
	
	public void updateEnglishScore(int value) {
		if(value > 100) {
			value = 100;
		}
		this.englishScore = value;
	}
	

}
