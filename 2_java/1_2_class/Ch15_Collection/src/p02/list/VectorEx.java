package p02.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//Vector: synchronized 메소드로 구성 
public class VectorEx {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector();
		v1.addElement("삼성");
		v1.addElement("LG");
		v1.addElement("SK");
		v1.addElement("구글");

		// 1. for1
		for (String s : v1) {
			System.out.println(s);
		}
		System.out.println("------------------------------");
		// for2 lastIndexOf(v1.lastElement())
		for (int i = 0; i < v1.size(); i++) {
			System.out.println(v1.get(i));
		}
		System.out.println("------------------------------");
		// 2. elements()1
		Enumeration<String> e = v1.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("------------------------------");
		// elements()2
		for (Enumeration<String> e2 = v1.elements(); e2.hasMoreElements();)
			System.out.println(e2.nextElement());
		System.out.println("------------------------------");
		// 3. iterator()
		Iterator<String> it = v1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("------------------------------");
	}

}
