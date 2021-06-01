package p05.search;

import java.util.NavigableSet;
import java.util.TreeSet;

//756
public class TreeSetExample3 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("apple");
		ts.add("forever");
		ts.add("description");
		ts.add("ever");
		ts.add("zoo");
		ts.add("base");
		ts.add("guess");
		ts.add("cherry");
		ts.add("c");
		ts.add("f");
	
		System.out.println(ts);
		//NavigableSet<E>	subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)
		
		//c<= 값 <= f
		NavigableSet<String> ns = 	ts.subSet("c", true, "f", true);
		for(String s : ns)
			System.out.print(s+" ");
	
	}

}
