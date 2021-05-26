package p04.generic_method;

public class Util {

//	public static <String> Box<String> boxing(String s) {
//		return null;
//	}

	// Generic Method()
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;
	}

	// addAll(Collection<? extends E> c)
	// forEach(Consumer<? super E> action)

}
