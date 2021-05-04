package p03_for_while_dowhile;

public class ForEx1 {

	public static void main(String[] args) {
		int sum = 0;
		//	  초기값	   목적지		증가치
		for (int i = 0; i < 10; i++) {
			sum += i + 1;// sum=sum+i
			System.out.printf("1부터 %10d 까지의 합: %2d%n", i, sum);

		}
		System.out.println();

		int sum2 = 0;
		for (int i = 1; i < 11; i++) {
			sum2 += i;// sum2=sum2+i
			System.out.printf("1부터 %10d 까지의 합: %2d%n", i, sum2);

		}
		System.out.println();

	}

}
