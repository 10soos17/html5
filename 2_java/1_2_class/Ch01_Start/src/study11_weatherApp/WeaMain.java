
package study11_weatherApp;

import java.util.Scanner;

import study09_exception.memException;

public class WeaMain {
	DetailWeather dw;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = 0;
		String city;
		String w = "서울 비 10 5 80 0.5 남풍" + " 대전 흐림 12 1 60 0.6 서풍" + " 대구 맑음 18 0 40 1.2 남서풍" + " 부산 맑음 20 1 30 0.8 남동풍"
				+ " 광주 비 16 20 90 0.1 북풍" + " 강릉 눈 -2 80 60 0.25 동풍" + " 제주 맑음 22 5 60 0.01 남서풍";
		WeaCon wc = new WeaCon(w);
		wc.inPut();

		while (true) {

			System.out.println("1. 날씨 검색, 2. 종료 ");
			try {
				number = sc.nextInt();
				if (number != 1 && number != 2) {
					throw new Exception();
				}

			} catch (Exception e) {
				System.out.println("1 혹은 2를 입력하세요.");
				number = sc.nextInt();

			}
			if (number == 1) {

				number = 0;
				System.out.println("도시명을 입력: ");
				city = sc.next();
				System.out.println("1. 간단정보, 2. 상세정보");

				try {
					number = sc.nextInt();
					if (number != 1 && number != 2) {
						throw new Exception();
					}
				} catch (Exception e) {
					System.out.println("1 혹은 2를 입력하세요.");
					number = sc.nextInt();
				}

				wc.search(city, number);
				number = 0;
			} else if (number == 2) {
				break;
			}

		}

	}

}
