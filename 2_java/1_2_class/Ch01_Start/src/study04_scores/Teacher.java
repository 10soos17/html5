package study04_scores;

import java.util.ArrayList;

public class Teacher {
	//클래스 변수
	ArrayList<Student> stds = new ArrayList<Student>();
	int sum=0;
	double avg=0;

	
	//생성자
	public Teacher() {
		
	}
	
	//학생 정보 입력
	public void inPut(String name, int[] arr) {
		stds.add(new Student(name, arr));
			
	}
	
	//합계(sum)
	public int add(String name) {

		for(Student s : stds) {
			if(s.name.equals(name)) {
				sum =s.getKor() + s.getEng() + s.getMath();
				break;
			}
		}
		return sum;

		
	}
	
	//평균(avr)
	public double avg(String name) {
		
		avg = (double)(add(name)/3);
		
		return avg;
	}
	
	public String infoCheck(String name) {
		int count=0;
		
		for(Student s : stds) {
			if(stds.size()-1 == count && !s.name.equals(name)) {
				name = "학생 정보가 없습니다.";
				break;
			}
			if(s.name.equals(name)) {
				break;
			}
			count++;

		}
		
		return name;
	}
	
}
