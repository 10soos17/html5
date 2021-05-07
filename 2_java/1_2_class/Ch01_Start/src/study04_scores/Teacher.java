package study04_scores;

public class Teacher {
	//클래스 변수
	Student s;
	int sum=0;
	double avg=0;

	
	//생성자
	public Teacher() {
		
	}
	
	//학생 정보 입력
	public void inPut(String n, int[] arr) {
		s = new Student();
		
		s.name = n;
		s.kor = arr[0];
		s.eng = arr[1];
		s.math = arr[2];

			
	}
	
	//합계(sum)
	public int add() {
		sum = s.kor + s.eng + s.math;

		return sum;
	}
	
	//평균(avr)
	public double avg() {
		avg = add()/3;
		
		return avg;
	}
	
}
