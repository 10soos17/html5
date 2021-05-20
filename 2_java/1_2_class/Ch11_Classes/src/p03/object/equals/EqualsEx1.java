package p03.object.equals;

import java.util.GregorianCalendar;

public class EqualsEx1 {

	public static void main(String[] args) {
		GregorianCalendar g1 = new GregorianCalendar(2021,4,1);
		GregorianCalendar g2 = new GregorianCalendar(2021,4,1);
		//System.out.println(g1.getTime());
		if(g1.equals(g2))
			System.out.println("같음");
		else
			System.out.println("다름");
		
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(10);
		if(c1.equals(c2))
			System.out.println("같음");
		else
			System.out.println("다름");
		
	}

}
