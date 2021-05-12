package p10_static_singleton;

import java.time.LocalDate;
import java.util.Calendar;
//Calendar: 추상 클래스이므로 객체생성 불가 
public class CalendarEx {
	
	public static void main(String[] args) {
		//Calendar Class 추상클래스이므로 자식 객체 생성 대신 Singleton 형식으로 클래스 내용 사용 
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;

		int day = cal.get(Calendar.DATE);
		System.out.println(year+"/"+month+"/"+day);
		
		//import java.time.LocalDate;
		LocalDate date = LocalDate.now();
		int month2 = date.getMonthValue();
		System.out.println(date);
		System.out.println(month2);
		


	}

}
