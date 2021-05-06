package exercise;

public class Exercise7 {

	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;

		double z = 0;
		try {
			double k = x / y;
			z = x % y;
		} catch (Exception e) {
			System.out.println("0으로 나누면 안됨");
		}

		if (Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println("결과: " + result);
		}
	}

}
