package p1;

public class Main {

	public static void main(String[] args) {
		// ������ �޸𸮿� �����ϴ� �� ������, ���ǻ���
		// ���� - �迭�� x, Ŭ������ o
		// ���� - �迭�� o
		// stack(����,scope) heap(��ü,�� ��ü ����Ű�� ������ ���� ��)
		// �迭 - �ݺ������� ���� �� �־�� �ǹ̰� ����

		// cf. new StudentInfo();//�޸𸮸� �������ڸ��� �Ҹ�

		StudentInfo[] students = new StudentInfo[3];
		// �Ű�����, Ÿ���� ���� �����ڷ� ȣ���
		students[0] = new StudentInfo("�޸���", 70, 60);
		students[1] = new StudentInfo("����", 80, 10);
		// students[2] = new StudentInfo();
		students[2] = new StudentInfo("Ʈ���̼�");

		students[2].englishScore = 70;
		students[2].mathScore = 60;

//		for (int i = 0; i < students.length; i++) {
//			System.out.println("�̸�: " + students[i].name);
//			System.out.println("����: " + students[i].englishScore);
//			System.out.println("����: " + students[i].mathScore);
//		}

		// ���� for���� ����ϱ�
		for (StudentInfo student : students) {
			System.out.println("�̸�: " + student.name);
			System.out.println("����: " + student.englishScore);
			System.out.println("����: " + student.mathScore);

			int mean = student.calculateMean();

			System.out.println("���: " + mean);

			System.out.println("==============");
			
		}

	}
//	public static int calculateMean(StudentInfo st) {
//		int mean = (st.englishScore + st.mathScore) / 2;
//		return mean;
//	}
}
