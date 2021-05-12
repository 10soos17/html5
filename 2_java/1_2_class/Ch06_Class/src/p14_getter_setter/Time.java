package p14_getter_setter;
//getter(), setter()
public class Time {

	public int hour;//0~23
	private int minute;//0~59
	private int second;//0~59

	public Time() {};
	public Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	//@: Annotation - 서술주석 
	@Override
	public String toString() {
		return hour + " : " + minute+" : " + second + ":";
	}
	
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) return;
		this.hour = hour;
	}
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) return;
		this.minute = minute;
	}
	public void setSecond(int second) {
		if(second < 0 || second > 59) return;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}


	
	
}
