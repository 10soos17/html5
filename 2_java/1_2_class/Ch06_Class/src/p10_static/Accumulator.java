package p10_static;

public class Accumulator {
	int total;
	static int grandTotal;// 공유변수

	void accumulate(int amount) {// 10 20
		total += amount;// 10 20
		grandTotal += amount;// 10
	}

	static int getGrandTotal() {
		return grandTotal;
	}
}
