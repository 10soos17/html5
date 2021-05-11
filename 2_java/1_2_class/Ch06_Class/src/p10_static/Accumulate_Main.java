package p10_static;

public class Accumulate_Main {

	public static void main(String[] args) {
		// 객체 2개 각각 생성해서, 첫번쨰 객체에 10, 두번째 객체에 20
		// total(2개출력), grandTotal 출력
		Accumulator ac1 = new Accumulator();
		Accumulator ac2 = new Accumulator();

		ac1.accumulate(10);
		System.out.println("total: " + ac1.total);
		System.out.println("Accumulator.grandTotal: " + Accumulator.grandTotal);

		ac2.accumulate(20);
		System.out.println("total: " + ac2.total);
		System.out.println("Accumulator.grandTotal: " + Accumulator.grandTotal);

		int r1 = Accumulator.getGrandTotal();
		System.out.println("grandTotal: " + r1);

	}

}
