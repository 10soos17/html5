package p07.enums;

//enum 타입 사용
public class ClothingInfo2 {
	String code, name, material;
	Season season;

	/*
	 * static final int SPRING = 1;//고정상수: 값 변경 불가, 관습적으로 대문자로 씀 //Spring = 2; //불가능
	 * static final int SUMMER = 2; static final int FALL = 3; static final int
	 * WINTER = 4;
	 */
	// 생성자
	public ClothingInfo2(String code, String name, String material, Season season) {
		super();
		this.code = code;
		this.name = name;
		this.material = material;
		this.season = season;
	}
}
