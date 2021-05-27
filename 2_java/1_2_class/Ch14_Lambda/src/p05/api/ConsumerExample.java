package p05.api;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
//Consumer Interface: @FunctionalInterface
//					  accept(T t): Parameter t는 함수내부에서 연산만, return 값이 없다.
	public static void main(String[] args) {
		// Consumer
		// 1. 익명구현객체
		Consumer<Integer> ci = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t + 10);
			}

		};
		ci.accept(20);

		// 2. Lambda Expression: Consumer 익명구현객체를 간단한 표현
		Consumer<Integer> ci2 = t -> System.out.println(t + 10);

		ci2.accept(20);

		// BiConsumer: (10,20): 합계연산 출력
		// 1. 익명구현객체
		BiConsumer<Integer, Integer> bci = new BiConsumer<Integer, Integer>() {
			@Override
			public void accept(Integer t, Integer u) {
				System.out.println(t + u);

			}
		};
		bci.accept(10, 20);

		// 2.Lambda Expression
		BiConsumer<Integer, Integer> bci2 = (t, u) -> System.out.println(t + u);
		bci2.accept(10, 20);

		// ObjIntConsumer: "java", 8
		// 1. 익명구현객체
		ObjIntConsumer<String> oic = new ObjIntConsumer<String>() {
			@Override
			public void accept(String t, int value) {
				System.out.println(t + value);

			}
		};
		oic.accept("java", 8);
		// 2. Lambda Expression: Consumer 익명구현객체를 간단한 표현
		ObjIntConsumer<String> oic2 = (t, value) -> System.out.println(t + value);
		oic2.accept("java", 8);
	}
}
