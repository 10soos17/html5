package p1;

public class StudentInfo {

	// �Ӽ�
	//�Ӽ��� private���� ���� ��
	//private ���� ���� ��, �����Ͽ��� �߻�
	//private ����� ���� - ���� �Ӽ��� ���� ���� ���� + �޼ҵ�� �����ؼ� ��� ����
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

	// ������ - �� �ʱ�ȭ�ϱ� ���� ����
	// this - �ڽ��� �޸� �ּ�
	public StudentInfo(String name, int englishScore, int mathScore) {
		System.out.println("[�׽�Ʈ] ������11 ȣ���!!!");
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	// ������ overloading
	public StudentInfo(String name) {
		System.out.println("[�׽�Ʈ] ������22 ȣ���!!!");
		this.name = name;
	}

	public StudentInfo() {
		System.out.println("[�׽�Ʈ] ������33 ȣ���!!!");
	}

	// ��� - �޼ҵ� : �޼ҵ忡 this Ű���尡 �ϳ��� ���� ���, �߸��� ����
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
