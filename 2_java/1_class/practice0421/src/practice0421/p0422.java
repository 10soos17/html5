package practice0421;
import java.util.ArrayList;

public class p0422{
	float eng;
	float kor;
	float avg;
	float sum;
	float grade;
	
	ArrayList<String> grades = new ArrayList<String>();

	ArrayList setGrade() {
		grades.clear();
		grades.add(0,"A");
		grades.add(1,"B");
		grades.add(2,"C");
		
		return grades;
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

