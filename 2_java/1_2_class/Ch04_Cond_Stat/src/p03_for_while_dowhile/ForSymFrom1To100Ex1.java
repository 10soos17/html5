package p03_for_while_dowhile;

public class ForSymFrom1To100Ex1 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 100; i++) { // i=1,2,3,,,,,100

			sum = sum + i;

		}

		System.out.println("1~100 sum: " + sum);

		int sum2 = 0;
		int i = 0;
		for (i = 1; i <= 100; i++) { // i=1,2,3,,,,,100

			sum2 = sum2 + i;

		}

		System.out.println("횟수 :" + (i - 1) + ", 합: " + sum2);
		
		System.out.println("-------------------------------");

		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}
	}

}
