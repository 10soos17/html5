package exercise;

public class Util {


	public static int getValue(Pair p, String name) {
		
		if(p instanceof Pair) {
			
			return (int) p.getValue();
		}
		return 0;
	}
}
