
public class WeaMain {

	public static void main(String[] args) {
		String w = "서울 비 10 5 80 0.5 남풍" + " 대전 흐림 12 1 60 0.6 서풍" + " 대구 맑음 18 0 40 1.2 남서풍" + " 부산 맑음 20 1 30 0.8 남동풍"
				+ " 광주 비 16 20 90 0.1 북풍" + " 강릉 눈 -2 80 60 0.25 동풍" + " 제주 맑음 22 5 60 0.01 남서풍";
		WeaCon wc = new WeaCon(w);
		wc.inPut();

	}

}
