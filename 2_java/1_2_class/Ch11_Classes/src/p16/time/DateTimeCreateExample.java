package p16.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeCreateExample {
	public static void main(String[] args) {
		LocalDate cd = LocalDate.now();
		System.out.println("현재날짜: " + cd);

		LocalTime ct = LocalTime.now();
		System.out.println("현재시간: " + ct);

		LocalDateTime cdt = LocalDateTime.now();
		System.out.println("현재날짜와 시간: " + cdt);

		System.out.println(cdt.getYear()+"년");
		System.out.println(cdt.getMonthValue()+"월");
		System.out.println(cdt.getDayOfMonth()+"일");
		System.out.println(cdt.getHour()+"시");
		System.out.println(cdt.getMinute()+"분");
		System.out.println(cdt.getSecond()+"초");
		
		ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시: " + utc);

		ZonedDateTime utc2 = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("서울 시간존: " + utc2);
	}
}
