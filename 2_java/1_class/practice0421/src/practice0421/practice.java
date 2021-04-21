package practice0421;


class grade{

	char grades[] = new char[26];
	char a = 'A';
	char grade;
	
	int output[] = new int[2];
	int kor;
	int eng;
	
	int sum;
	int avg;

	void set(int number) {
		
		for(int i=0; i<grades.length;i++,a++) {
			grades[i] = a;
		}
		
		if(number > 90) {
			this.grade = grades[0];
		}else if(number <= 90 && number > 80) {
			this.grade = grades[1];
		}else if(number <= 80 && number > 70) {
			this.grade = grades[2];
		}else if(number <= 70 && number > 60) {
			this.grade = grades[3];
		}
		else {
			this.grade = grades[5];
		}
	}
	
	char get() {

		return grade;
		
	}
	
	void set_sumAverage(int one, int two) {
		kor = one;
		eng = two;
		this.sum = kor + eng;
		this.avg = sum / 2;

	}
	int[] get_sumAverage() {

		this.output[0] = this.sum;
		this.output[1] = this.avg;
		
		return this.output;
	}
	
	//19-12번 
	int div(int one, int two) {
		int three = one;
		int four = one;
		
		three = three / two;
		
		while(four > two) {
			four -= two;
		}
		
		return four;
	}
}

public class practice {
	

	public static void main(String[] args) {
		
		int number = 92;
		int korean = 100;
		int english = 90;

		grade one = new grade();
		
		one.set(number);
		char myGrade = one.get();
		System.out.println(myGrade);
		
		one.set_sumAverage(100, 90);
		int myOutput[] = one.get_sumAverage();
		System.out.println("sum:" + myOutput[0]+ "avg:" + myOutput[1]);
		
		System.out.println(one.div(10,3));



		

	}

}
