package p01.basic;

//Runtime Exception(UnCheck Exception): 컴파일 에러 발생 X, 실행시 에러발생 O
//									    개발자가 스스로 예외처리
public class ExceptionEx1 {

	public static void main(String[] args) {
		int num1 = 3, num2 = 0;
		try {
			int result = num1 / num2;
			System.out.println(result);
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("컴퓨터는 숫자를 0으로 나눌 수 없습니다.");
		}
		System.out.println("Done");

	}

}
