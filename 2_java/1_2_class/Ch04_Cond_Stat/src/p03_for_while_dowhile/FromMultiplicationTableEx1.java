package p03_for_while_dowhile;

public class FromMultiplicationTableEx1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j < 3; j++) {
				for (int k = 1; k <= 3; k++) {
					System.out.println("" + i + j + k);// "": 변수들끼리 연산 방지

				}
			}
		}

		System.out.println("------------------");
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {

				System.out.printf("%d x %d = %d\n", i, j, i * j);

			}
		}

		
		System.out.println("------------------");
		for (int i2 = 2; i2 < 10; i2++) {
			System.out.println("******" + i2 + "단 ******");
			for (int j2 = 1; j2 < 10; j2++) {

				System.out.println(i2 + " x " + j2 + "  =  " + (i2*j2));

			}
		}
		
		
		
	}

}
