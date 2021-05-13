package exercise;

public class MemberService {

	public boolean login(String id, String password) {
		if (id == "hong" && password == "12345") {//(id.equals("hong") && password.equalss("12345"))
			return true;
		} else {
			return false;
		}
	}

	public void logout(String id) {
		if (id == "hong") {
			System.out.println(id + "로그아웃되었습니다.");

		}
	}

}
