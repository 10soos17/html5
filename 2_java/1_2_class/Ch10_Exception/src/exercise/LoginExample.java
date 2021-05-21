package exercise;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			login("blue", "54321");
		} catch (NotExistIDException e) {
			System.out.println(e.getMessage());
		} catch (WrongPasswordException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {

		/*
		 * if(!id.contentEquals("blue")){ throw new
		 * NotExistIDException("ID가 존재하지 않습니다."); }
		 * 
		 * if(!password.contentEquals("12345")){ throw new
		 * WrongPasswordException("Password가 일치하지 않습니다."); }
		 */

		if (id.equals("blue")) {
			System.out.println(id + ", 같은 ID입니다.");
		} else {
			throw new NotExistIDException(id + ", ID가 존재하지 않습니다.");// Checked Exception
		}

		if (password.equals("12345")) {
			System.out.println(id + ", 같은 Password입니다.");
		} else {
			throw new WrongPasswordException(id + ", Password가 일치하지 않습니다.");// 1단계
		}

	}

}
