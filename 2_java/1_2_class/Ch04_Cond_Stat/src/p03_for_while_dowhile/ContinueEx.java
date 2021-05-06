package p03_for_while_dowhile;

public class ContinueEx {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			if(i%3 == 0) continue;
			System.out.println(i);
			
		}
		System.out.println("1~500짝수의 합 구하기");
		int sum = 0;
		int i = 1;
		do {
			i+=1;
			if(i%2 != 0) continue;
			
			sum += i;
			
		}while(i<500);
		
		System.out.println(i+"합: "+sum);

	}

}
