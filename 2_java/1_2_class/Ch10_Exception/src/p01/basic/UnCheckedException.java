package p01.basic;

public class UnCheckedException {

	public static void main(String[] args) {

		try {
			int result = add(1, -2);// 3
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("결과가 음수가 될 수 없습니다.");
		}

		int result2 = add2(1, -2);
		System.out.println(result2);

	}

	static int add(int a, int b) throws Exception {// 2

		int result = a + b;
		// result가 0보다 작으면 강제적으로 예외발생
		if (result < 0) {
			throw new Exception(); // 1
		}
		return result;
	}

	static int add2(int a, int b) {// 2

		int result = a + b;
		// result가 0보다 작으면 강제적으로 예외발생
		if (result < 0) {
			try {
				throw new Exception(); // 1
				
			}catch(Exception e) {
				System.out.println("강제적으로 예외 발생시켰습니다.");
			}
		}
		return result;
	}

}
