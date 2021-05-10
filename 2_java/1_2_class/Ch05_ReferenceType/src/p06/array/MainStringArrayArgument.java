package p06.array;

public class MainStringArrayArgument {
	//p.160
	public static void main(String[] args) {
		/*
		 * 예외처리:: 방법1 if(args.length != 2) { System.out.println("배열에 입력이 2개여야 합니다.");
		 * System.exit(0);//정상적인 종료 }
		 */

		// 예외처리: 방법2(try~catch)
		try {
			String strNum1 = args[0];
			String strNum2 = args[1];

			System.out.println("a");
			int num1 = Integer.parseInt(strNum1);// TypeCasting(형변환): String => int
			System.out.println("b");
			int num2 = Integer.parseInt(strNum2);// TypeCasting(형변환): String => int
			System.out.println("c");
			int result = num1 + num2;
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.out.println("문자열 숫자형을 입력해야 합니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 길이에 문제있습니다.");
		} finally {// 반드시 실행
			System.out.println("Done");
		}
	}

}
