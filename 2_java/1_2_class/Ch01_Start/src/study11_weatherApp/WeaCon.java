
package study11_weatherApp;

import java.util.HashMap;

public class WeaCon {

	public String w;
	String[] arr;
	HashMap<String, DetailWeather> hw = new HashMap<String, DetailWeather>();
	DetailWeather vals;

	public WeaCon(String w) {
		this.w = w;
	}

	public void inPut() {
		arr = this.w.split(" ");
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			if (i % 7 == 0 && i != arr.length) {
				System.out.println(i + arr[i + 6] + "split");

				hw.put(arr[i], new DetailWeather(arr[i], arr[i + 1], arr[i + 2], arr[i + 3], arr[i + 4], arr[i + 5],
						arr[i + 6]));

			}
		}
	}

	public void search(String city, int number) {

		for (String key : hw.keySet()) {
			vals = hw.get(key);

			if (vals.city.equals(city)) {
				if (number == 1) {
					vals.info();
				} else if (number == 2) {
					vals.info(number);
				}
			}

		}
		System.out.println("찾는 도시의 날씨 정보가 없습니다.");

	}
}
