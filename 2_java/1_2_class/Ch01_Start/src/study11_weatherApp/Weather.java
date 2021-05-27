package study11_weatherApp;

public class Weather {
	public String city;
	public String wea;
	public String tem;
	public String rain;
	public String hum;

	public Weather() {

	}

	public Weather(String city, String wea, String tem, String rain, String hum) {
		this.city = city;
		this.wea = wea;
		this.tem = tem;
		this.rain = rain;
		this.hum = hum;
	}

	public void info() {
		System.out.println("지역: "+this.city+"\n"+
				"날씨: "+this.wea+"\n"+
				"온도: "+this.tem+"도\n"+
				"강수량: "+this.rain+"mm\n"+
				"습도: "+this.hum+"%\n"
				);
	}
}
