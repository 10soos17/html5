package p07.enums;
//enum 타입이 사용되기 전
public class ClothingInfo {
	String code, name, material;
	int season;
	
	static final int SPRING = 1;//고정상수: 값 변경 불가, 관습적으로 대문자로 씀
	//Spring = 2; //불가능
	static final int SUMMER = 2;
	static final int FALL = 3;
	static final int WINTER = 4;
	//생성자
	public ClothingInfo(String code, String name, String material, int season) {
		super();
		this.code = code;
		this.name = name;
		this.material = material;
		this.season = season;
	}
}
