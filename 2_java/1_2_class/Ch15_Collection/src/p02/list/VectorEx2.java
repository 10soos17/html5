package p02.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {

		Vector<Woman> v1 = new Vector();
		v1.addElement(new Woman("알파고", 10));
		v1.addElement(new Woman("베타고", 20));

		// 1. for1
		for (Woman s : v1) {
			System.out.println(s.name + "," + s.age);
		}

		System.out.println("------------------------------");
		// for2 lastIndexOf(v1.lastElement())
		for (int i = 0; i < v1.size(); i++) {
			System.out.println(v1.get(i).name + "," + v1.get(i).age);
		}
		System.out.println("------------------------------");
		// 2. elements()1
		Enumeration<Woman> e = v1.elements();
		while (e.hasMoreElements()) {
			Woman w = e.nextElement();
			System.out.println(w.name + "," + w.age);
		}
		System.out.println("------------------------------");
		// elements()2
		for (Enumeration<Woman> e2 = v1.elements(); e2.hasMoreElements();) {
			Woman w2 = e2.nextElement();
			System.out.println(w2.getName() + w2.getAge());
		}
		System.out.println("------------------------------");
		// 3. iterator()
		Iterator<Woman> it = v1.iterator();
		while (it.hasNext()) {
			Woman w3 = it.next();
			System.out.println(w3.name + "," + w3.age);
		}
		System.out.println("------------------------------");
	}

}
