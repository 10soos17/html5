package p07.user_define_exception;

public class UserException_Main {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
			a(70);// 3
		} catch (UserException e) {
			System.out.println("e.getMessage(): "+e.getMessage());
		}
		System.out.println("Done");
	}

	public static void a(int num) throws UserException {// 2
		if (num < 100)
			throw new UserException("num이 100보다 작다.");// 1

	}

}
