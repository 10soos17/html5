

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CurrentTime {

	public static void main(String[] args) {
		CurrentTime ct = new CurrentTime();
		System.out.println(ct.now());
		
		System.out.println("----------------");
		
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);

		System.out.println(hour+"/"+minute+"/"+second+"초입니다.");
		

	}
	 public  String now() {
		 SimpleDateFormat sdf = new SimpleDateFormat("HH시 MM분 SS초");
		 return sdf.format(new Date());
	 }
}
