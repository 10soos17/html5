package p01.reference;

public class StackEx1 {
//LIFO
	public static void main(String[] args) {
		System.out.println("mainMethod(String[] args) start");
		firstMethod();
		System.out.println("mainMethod(String[] args) end");

	}

	static void firstMethod() {
		System.out.println("firstMethod() start");
		secondMethod();
		System.out.println("firstMethod() end");
	}

	static void secondMethod() {
		System.out.println("secondMethod() start");

		System.out.println("secondMethod() end");
	}

}
