package p07.enums;
//열거 타입: Season
//열거 상수(관례적 대문자): SPRING, SUMMER, FALL, WINTER
public class NewEx {

	public static void main(String[] args) {
		// "1111", "반팔티셔츠", "면100%", 여름출력

		ClothingInfo2 ci = new ClothingInfo2("1111", "반팔티셔츠", "면100%", Season.SUMMER);
		System.out.println("상품코드" + ci.code);
		System.out.println("상품명" + ci.name);
		System.out.println("소재" + ci.material);
		System.out.println("계절구분" + ci.season); 
	}

}
