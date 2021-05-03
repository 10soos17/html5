package p03.unary;

public class InfinityAndNaNCheckEx {

	public static void main(String[] args) {
		// 정수를 0으로 나누거나 나머지를 구할 때 - 예외 발생
		int x = 10;
		int y = 0;

		try {
			int z = x / y; // 몫
			int k = x % y; // 나머지
			System.out.println(z);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("컴퓨터는 수학과 다릅니다. 숫자를 0으로 나눌 수 없습니다.");
		}
		System.out.println("Done");
		System.out.println("------------------------");

		// 2.실수를 0.0으로 나누면 예외 발생하지 않음, 나머지도 마찬가지
		double x2 = 5.0;
		double y2 = 0.0;
		double z2 = 0.0;
		double k2 = 0.0;
		try {

			z2 = x2 / y2; // 몫
			k2 = x2 % y2; // 나머지
			System.out.println("z2 Infinity :: " + Double.isInfinite(z2));
			System.out.println("z2 isNaN :: " + Double.isNaN(z2));
			System.out.println(z2 + 2);

			System.out.println("k2 Infinity :: " + Double.isInfinite(k2));
			System.out.println("k2 isNaN :: " + Double.isNaN(k2));
			System.out.println(k2 + 2);
		} catch (Exception e) {
			System.out.println("컴퓨터는 수학과 다릅니다. 숫자를 0으로 나눌 수 없습니다.");

		}

		System.out.println("------------------------");
		if (Double.isInfinite(z2) || Double.isNaN(z2)) {
			System.out.println("값 산출 불가");

		} else {
			System.out.println(z2 + 2);
		}

	}

}
