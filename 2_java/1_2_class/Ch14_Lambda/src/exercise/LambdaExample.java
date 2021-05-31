package exercise;

import java.util.function.IntSupplier;

public class LambdaExample {

	public static int method(int x, int y) {// x, y: Parameter변수, Local변수
//		IntSupplier is = new IntSupplier() {
//			@Override
//			public int getAsInt() {
//				// x = x * 10;
//				int result = x + y;
//				return result;
//			}
//		};
//		int result = is.getAsInt();
//		return result;
//	}

		IntSupplier is = () -> {

			int result = x + y;
			return result;

		};
		int result = is.getAsInt();
		return result;
	}

	public static void main(String[] args) {
		System.out.println(method(3, 5));
	}

}
