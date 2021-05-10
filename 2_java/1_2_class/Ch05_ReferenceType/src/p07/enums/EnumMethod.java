package p07.enums;

public class EnumMethod {

	public static void main(String[] args) {
		Week today = Week.SUNDAY; //열거 객체의 문자열 
		System.out.println(today.name());
		
		int ordinal = today.ordinal(); //열거 객체의 인덱스 
		System.out.println(ordinal);

		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2); //월, 화, 수 
		System.out.println(result1);
		int result2 = day2.compareTo(day1); //월, 화, 수 
		System.out.println(result2);
		
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay); //열거타입에 들어있는 모든 열거 객체를 배열로 출력 
			
			if(weekDay == Week.SATURDAY || weekDay == weekDay.SUNDAY) {
				System.out.println("주말이군요");
			}else {
				System.out.println("평일이군요");
			}
			
			Week[] days = Week.values(); //열거 타입에 들어 있는 모든 열거 객체를 배열로 출력 
			for(Week d : days) {
				System.out.println(d + "  ");
			}

		}

	}
}
