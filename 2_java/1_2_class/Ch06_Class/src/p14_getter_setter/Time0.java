package p14_getter_setter;

public class Time0 {

	public int hour;//0~23
	private int minute;//0~59
	private int second;//0~59
	String hours;
	String minutes;
	String seconds;
	
	public Time0() {};
	public Time0(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String getHour() {
		return hours;
	}

	public void setHour(int hour) {
		if(0<=hour && hour<10) {
			this.hours = "0"+hour;
		}
		else if(9<hour && hour<24) {
			this.hours = ""+hour;
		}
	}

	public String getMinute() {
		return minutes;
	}

	public void setMinute(int minute) {
		
		if(0<=minute && minute<10) {
			this.minutes = "0"+minute;
		}else if(9<minute && minute<60) {
			this.minutes = ""+minute;
		}
	}

	public String getSecond() {
		return seconds;
	}

	public void setSecond(int second) {
		if(0<=second && second<10) {
			this.seconds = "0"+second;
		}else if(9<second && second<60) {
			this.seconds = ""+second;
		}
	}

	
	
}
