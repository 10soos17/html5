package p1;

public class Main {

	public static void main(String[] args) {
		// ������ �޸𸮿� �����ϴ� �� ������, ���ǻ���
		// ���� - �迭�� x, Ŭ������ o
		// ���� - �迭�� o
		// stack(����,scope) heap(��ü,�� ��ü ����Ű�� ������ ���� ��)
		// �迭 - �ݺ������� ���� �� �־�� �ǹ̰� ����

		// cf. new StudentInfo();//�޸𸮸� �������ڸ��� �Ҹ�
		
		//��� - �ٲ��� �ʾƾ� �� �� 
		final String programName = "�л����� ���α׷� V3.7";
		//programName = "affeaf";
		
		StudentInfo[] students = new StudentInfo[3];
		// �Ű�����, Ÿ���� ���� �����ڷ� ȣ���
		students[0] = new StudentInfo("�޸���", 70, 60);
		students[1] = new StudentInfo("����", 80, 10);
		// students[2] = new StudentInfo();
		students[2] = new StudentInfo("Ʈ���̼�");

		int inputValue = 500;
		students[0].updateEnglishScore(inputValue);

//		for (int i = 0; i < students.length; i++) {
//			System.out.println("�̸�: " + students[i].name);
//			System.out.println("����: " + students[i].englishScore);
//			System.out.println("����: " + students[i].mathScore);
//		}

		// ���� for���� ����ϱ�
		for (StudentInfo student : students) {

			System.out.println("�̸�: " + student.getName());
			System.out.println("����: " + student.getEnglishScore());
			System.out.println("����: " + student.getMathScore());

			int mean = student.calculateMean();

			System.out.println("���: " + mean);

			System.out.println("==============");

		}
		
		// System.out.println(Math.E);
//		System.out.println(Math.PI * 10);
//
//		String str1 = "�ȳ��ϼ���";
//		// str1�� '��'��� ���ڰ� ��� ������ 111 ���, �ƴϸ� 222 ���
//		if(str1.contains("��")) {
//			 System.out.println("111");
//		}else {
//			System.out.println("222");
//		}
//		
//		boolean isExist = false;
//		for (int i = 0; i < str1.length(); i++) {
//			if (str1.charAt(i) == '��') {
//				isExist = true;
//			}
//		}
//
//		if (isExist) {
//			System.out.println("111");
//		} else {
//			System.out.println("222");
//		}
	}

}
