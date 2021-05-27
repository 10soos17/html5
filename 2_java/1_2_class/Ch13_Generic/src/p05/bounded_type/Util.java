package p05.bounded_type;

public class Util {

	// Number Class Child : Byte, Double, Float, Integer, Long, Short
	// <T extends Number> : Number + Byte, Double, Float, Integer, Long, Short

	// <T super Integer> : Integer + Number
	public static <T extends Number> int compare(T t1, T t2) {

		String st1 = t1.toString();
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();

		return Double.compare(v1, v2);// v1<v2: -1, v2=v1: 0, v1>v2: 1
	}
}
