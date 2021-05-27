package study11_weatherApp;


public class DetailWeather extends Weather {

	public String dust;
	public String direction;

	public DetailWeather() {
		// TODO Auto-generated constructor stub
	}
	public DetailWeather(String city, String weather, String tem, String rain, String hum,String dust, String direction) {
		super(city, weather, tem, rain, hum);
		this.dust = dust;
		this.direction = direction;
	}

	public void info() {
		super.info();
		System.out.println(
				"미세먼지: "+this.dust+"%\n"+
				"풍향: "+this.direction+"%\n"
				);
	}
}
