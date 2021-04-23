package practice0421;
import java.util.ArrayList;

//... instanceof ...
//.getClass() 

public class p0422{
	float eng;
	float kor;
	float avg;
	float sum;
	
	String grade;
	ArrayList<String> grades = new ArrayList<String>();

	void setGrade() {
		//char '', "" / String ""
		//datatype 지정하지 않은 경우, 'A'숫자  "A" 문자로 인식됨 
		
		grades.clear();
		grades.add("A");
		grades.add("B");
		grades.add("C");
		grades.add("D");
		grades.add("F");
		
		if(avg > 89) {
			this.grade = grades.get(0);
		}else if(avg < 90 && avg > 79) {
			this.grade = grades.get(1);
		}else if(avg < 80 && avg > 69) {
			this.grade = grades.get(2);
		}else if(avg < 70 && avg > 59) {
			this.grade = grades.get(3);
		}else {
			this.grade = grades.get(4);
		}
	
	}
	
	String getGrade() {
		return this.grade;
	}


	void setPlus(float a, float b) {
		this.eng = a;
		this.kor = b;
		this.sum  = a+b;
	}
	float getPlus() {
		return sum;
	}
	
	float getAvg() {
		this.avg = sum/2;
		return this.avg;
	}
	
	
	float compare(float a, float b){
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}
	//while문 돌릴때 < 과 <= 중에 후자가 더 오래걸림
	void count(int number) {
		for(int i=1; i<number+1;i++) {
			System.out.println(i+"회");
		}
	}
	
	int sub(int one, int two) {
		
		while(one > two) {
			one -= two;
			//System.out.println(one);
			//10/2
		}
		return one;
	}
	
	int absolute(int number) {
		
		if(number > 0) {
			return number * -1;
		}else {
			return number;
		}
	}
	
	
	
}

