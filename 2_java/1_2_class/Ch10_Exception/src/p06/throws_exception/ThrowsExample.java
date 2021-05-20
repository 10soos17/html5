package p06.throws_exception;

public class ThrowsExample {

	public static void main(String[] args) {
		//방법1
		findClass();
		//방법2
		try {
			findClass2();// 3
		} catch (ClassNotFoundException e) {
			System.out.println("해당 패키지에 해당 클래스가 없습니다.");
		}
	}

	public static void findClass() {
		try {
			Class<?> clazz = Class.forName("java.lang.String2");
			System.out.println("해당 패키지에 해당 클래스가 있습니다.");

		} catch (ClassNotFoundException e) {
			System.out.println("해당 패키지에 해당 클래스가 없습니다.");

		}
		System.out.println("Done");
	}

	public static void findClass2() throws ClassNotFoundException {/// 2

		Class<?> clazz = Class.forName("java.lang.String2");// 1
		System.out.println("해당 패키지에 해당 클래스가 있습니다.");

		System.out.println("Done");
	}
}
