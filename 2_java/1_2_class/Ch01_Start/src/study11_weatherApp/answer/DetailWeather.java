package study11_weatherApp.answer;


public class DetailWeather extends Weather {

	public String dust;
	public String direction;

	//날씨 상세정보 
	public void info(int a) {
		super.info();
		System.out.println(
				"미세먼지: "+this.dust+"%\n"+
				"풍향: "+this.direction+"%\n"
				);
	}
}
