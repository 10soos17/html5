package p02.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		String str = "abcdef";
		char c = str.charAt(1);
		System.out.println(c);
		
		Vector<String> v1 = new Vector<>();
		
		v1.addElement("삼성");//vector에만 있는 addElement()
		v1.addElement("LG");
		v1.addElement("SK");
		v1.addElement("구글");
	System.out.println(v1);
		//for
		for(int i=0; i<v1.size(); i++)
			System.out.println(v1.elementAt(i));
		
		
		//elements()
		Enumeration<String> e = v1.elements();
		while (e.hasMoreElements())
			   System.out.println(e.nextElement());
		
		for (Enumeration<String> e2 = v1.elements(); e2.hasMoreElements();)
	       System.out.println(e2.nextElement());
		
		
		//iterator()
		Iterator<String> it = 	v1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
