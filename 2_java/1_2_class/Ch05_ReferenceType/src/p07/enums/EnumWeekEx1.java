package p07.enums;

import java.util.Calendar;
//public abstract class Calendar
//extends Object
//implements Serializable, Cloneable, Comparable<Calendar>

public class EnumWeekEx1 {

	public static void main(String[] args) {
		Week today = null;

		Calendar cal = Calendar.getInstance(); // Singleton과 비슷
		int week = cal.get(Calendar.DAY_OF_WEEK); // 일(1) ~ 토(7)

		System.out.println(Calendar.DAY_OF_WEEK);
		System.out.println(week);

		switch (week) {
		case 1:
			today = Week.MONDAY;
			break;
		case 2:
			today = Week.TUESDAY;
			break;
		case 3:
			today = Week.WEDNESDAY;
			break;
		case 4:
			today = Week.THURSDAY;
			break;
		case 5:
			today = Week.FRIDAY;
			break;
		case 6:
			today = Week.SATURDAY;
			break;
		case 7:
			today = Week.SUNDAY;
			break;
		default:
			break;
		}
		System.out.println("오늘 요일: " + today);
		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 축구합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}

}
