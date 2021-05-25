package exercise;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class DataPrintExample {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd E요일 HH:mm");
		System.out.println(sdf.format(now));
		

		HashMap<Integer, String> dayMap = new HashMap<Integer, String>();
		dayMap.put(0, "일요일");
		dayMap.put(1, "월요일");
		dayMap.put(2, "화요일");
		dayMap.put(3, "수요일");
		dayMap.put(4, "목요일");
		dayMap.put(5, "금요일");
		dayMap.put(6, "토요일");

		String day = dayMap.get(now.getDay());

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH시 mm분");

		System.out.println(sdf1.format(now) + " " + day + " " + sdf2.format(now));

	}

}
