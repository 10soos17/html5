package p08_method;

public class VariableArgumentEx {

	public static void main(String[] args) {

		print(10);// Argument
		print(10, 20);
		print(10, 20, 30);
		print(10, 20, 30, 40);
	}

	public static void print(int a, int b, int c) {// Parameter
		System.out.println("파라미터 3개.....");
	}

	// 매개변수의 수를 모를 경우
	public static void print(int... vars) {
		for (int var : vars)
			System.out.print(var + " ");
		System.out.println();
	}

}
