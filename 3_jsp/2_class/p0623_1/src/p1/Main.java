package p1;

public class Main {

	public static void main(String[] args) {
		// 데이터 메모리에 저장하는 법 결정시, 유의사항
		// 가로 - 배열로 x, 클래스로 o
		// 세로 - 배열로 o
		// stack(변수,scope) heap(객체,이 객체 가리키는 변수가 없을 때)
		// 배열 - 반복문으로 돌릴 수 있어야 의미가 있음

		// cf. new StudentInfo();//메모리를 생성하자마자 소멸

		StudentInfo[] students = new StudentInfo[3];
		// 매개변수, 타입이 같은 생성자로 호출됨
		students[0] = new StudentInfo("메르시", 70, 60);
		students[1] = new StudentInfo("한조", 80, 10);
		// students[2] = new StudentInfo();
		students[2] = new StudentInfo("트레이서");

		students[2].englishScore = 70;
		students[2].mathScore = 60;

//		for (int i = 0; i < students.length; i++) {
//			System.out.println("이름: " + students[i].name);
//			System.out.println("영어: " + students[i].englishScore);
//			System.out.println("수학: " + students[i].mathScore);
//		}

		// 향상된 for문을 사용하기
		for (StudentInfo student : students) {
			System.out.println("이름: " + student.name);
			System.out.println("영어: " + student.englishScore);
			System.out.println("수학: " + student.mathScore);

			int mean = student.calculateMean();

			System.out.println("평균: " + mean);

			System.out.println("==============");
			
		}

	}
//	public static int calculateMean(StudentInfo st) {
//		int mean = (st.englishScore + st.mathScore) / 2;
//		return mean;
//	}
}
