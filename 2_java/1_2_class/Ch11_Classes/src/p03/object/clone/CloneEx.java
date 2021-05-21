package p03.object.clone;

import java.util.GregorianCalendar;

public class CloneEx {

	public static void main(String[] args) {
		GregorianCalendar g1 = new GregorianCalendar(2021, 0, 1);
		Object g2 = g1.clone();
		System.out.printf("%tF %n", g1);
		System.out.printf("%tF %n", g2);
		
		Rectangle r1 = new Rectangle(100, 100);
		Rectangle r2 = (Rectangle)r1.clone();
		System.out.println(r1.width + " : " + r1.height);
		System.out.println(r2.width + " : " + r2.height);
	}

}
