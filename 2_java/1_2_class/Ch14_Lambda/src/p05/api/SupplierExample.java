package p05.api;

import java.util.function.IntSupplier;

public class SupplierExample {

	public static void main(String[] args) {
		//IntSupplier
		// 1. 익명구현객체
		IntSupplier is = new IntSupplier() {

			@Override
			public int getAsInt() {
				int num = (int) (Math.random() * 6 + 1);

				return num;
			}
		};
		System.out.println(is.getAsInt());

		// 2. Lambda Expression
		IntSupplier is2 = () -> {return (int) (Math.random() * 6 + 1);
		};

		System.out.println(is2.getAsInt());
	}

}
