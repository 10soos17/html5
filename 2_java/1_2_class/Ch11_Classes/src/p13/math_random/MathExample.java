package p13.math_random;

//534
public class MathExample {

	public static void main(String[] args) {
		System.out.println(Math.ceil(5.3));
		System.out.println(Math.floor(5.3));
		System.out.println(Math.round(5.3));

		// 임의의 주사위 눈 출력하기
		int num = (int) (Math.random() * 6) + 1;
		System.out.println(num);
	}
}
