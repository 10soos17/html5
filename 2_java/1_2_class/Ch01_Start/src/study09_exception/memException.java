package study09_exception;

import java.util.regex.Pattern;

public class memException {

	// 예외 체크
	// 인원수 및 정보 입력 오류(숫자 아니거 0 이하 경우 오류 )
	public static int checkInt(String n) {// 2
		int i;

		try {
			i = Integer.valueOf(n);
			if (i < 0) {

			}
			return i;

		} catch (Exception e) {
			return -1;
		}

	}

	// 입력정보오류(보기 업는 번호 입력 경우 오류)
	public static int checkNum(String n) {// 2
		int i;

		try {
			i = Integer.valueOf(n);
			if (i > 4 || i < 0) {
				return -1;
			}
			return i;

		} catch (Exception e) {
			return -1;
		}
	}

	// option
	// 전화번호 오류체크(뒷 번호 4자리 아닌 경우 오류)
	public static int checkTelNo(String n) {// 2

		String pattern = "(\\d{4})";
		boolean res = Pattern.matches(pattern, n);

		if (res == false) {
			return -1;
		} else {
			return Integer.valueOf(n);
		}

	}

}
