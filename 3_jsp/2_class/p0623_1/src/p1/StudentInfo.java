package p1;

public class StudentInfo {

	// �Ӽ�
	String name;
	int englishScore;
	int mathScore;

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

}
