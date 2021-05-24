package p14.Date_Calendar;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatEx {

	public static void main(String[] args) {
		DecimalFormat df1 = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#,###E0");
				
		try {
			//Number Class: Byte, Double, Float, Integer, Long, Short 
			Number num = df1.parse("1,234,567.89");
			System.out.println("1,234,567.89"+"=> ");
			double d = num.doubleValue();
			System.out.println(d+"=>"+df2.format(num));
		} catch (ParseException e) {
			System.out.println("변화 불가");
		}
		
		double num = 1234567.89;
		DecimalFormat df3 = new DecimalFormat("0");
		System.out.println(df3.format(num));
		DecimalFormat df4 = new DecimalFormat("0.0");
		System.out.println(df4.format(num));
		DecimalFormat df5 = new DecimalFormat("0000000000.000000");
		System.out.println(df5.format(num));
		DecimalFormat df6 = new DecimalFormat("##,###,###,###.######");
		System.out.println(df6.format(num));
	}

}
