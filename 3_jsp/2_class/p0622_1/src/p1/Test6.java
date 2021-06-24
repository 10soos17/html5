package p1;

public class Test6 {

	public static void main(String[] args) {

		// 연산자...
		// 산술 연산자 + - * / %
		// 비교 연산자... < > == !=
		// 논리 연산자 && ||

		int a = 10;

		boolean b = a < 20;

		if (a < 20) {
			System.out.println("작다");
		}

		if ("안녕하세요".equals("aaa")) {
			System.out.println("같다");
		}

		if (a == 10) {
			System.out.println("같다");
		}
		
		String str1 = "안녕하세요";
		String str2 = "안녕하세요";
		
		if(str1 == str2) {
			System.out.println( "두 개의 문자는 같다");
		}else {
			System.out.println( "두 개의 문자는 같지 않다");
		}
		
		String str3 = new String("안녕하세요");
		String str4 = new String("안녕하세요");
		
		if(str3 == str4) {//주소값을 비교함 
			System.out.println( "두 개의 문자는 같다");
		}else {
			System.out.println( "두 개의 문자는 같지 않다");
		}
		
		int c = 10;
		
		if(c < 10 && c > 10) {
			
		}
	}
}