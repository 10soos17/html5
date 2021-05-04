package p04.binary;

public class LogicalOperatorEx1 {

	public static void main(String[] args) {
		
		
		int charCode = 'A'; //자동형변환
		System.out.println(charCode); //65

		if(charCode >= 65 & charCode <= 90) {
			System.out.println("대문자 입니다.");
		}
		if(charCode >= 97 & charCode <= 122) {
			System.out.println("소문자 입니다.");
 		}
		if(charCode >= 48 & charCode <= 57) {
			System.out.println("0~9 입니다.");
		}
		
		int value = 6;
		if((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2, 3의 배수입니다.");
		}
		// "||" : 속도가 빠르다.
		if((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2, 3의 배수입니다.");
		}
	}

}
