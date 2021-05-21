package p07.string;

public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn = new String("010244-1230123");
		String ssn2 = "010244-1230123";
		char k = ssn2.charAt(7);

		switch (k) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}

	}

}
