package p07.enums;

public class OldEx {

	public static void main(String[] args) {
		// "1111", "반팔티셔츠", "면100%", 여름출력

		ClothingInfo ci = new ClothingInfo("1111", "반팔티셔츠", "면100%", ClothingInfo.SUMMER);
		System.out.println("상품코드" + ci.code);
		System.out.println("상품명" + ci.name);
		System.out.println("소재" + ci.material);
		System.out.println("계절구분" + ci.season); //2: enum을 사용 전에 출력
	}

}
