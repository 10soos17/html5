package exercise;

public class ActionExample {

	public static void main(String[] args) {
		// 1. 익명 구현 객체
		Action action = new Action() {
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		action.work();

		// 2. 익명 구현 객체 => Lambda Expression
		Action action2 = () -> System.out.println("복사를 합니다.2");

		action2.work();

	}

}
