package study19_dbLogin;

import java.util.Scanner;

public class LoginMain {

	public static void main(String[] args) {
		boolean isStop = false;
		Scanner sc = new Scanner(System.in);
		String id, pw;
		LoginSVC mc = new LoginSVC();
		User user= null;
		
		do {
			System.out.println("로그인 화면입니다.");
			System.out.println("아이디와 비밀번호를 입력하세요.");
			System.out.println("아이디: ");
			id = sc.next();
			System.out.println("비밀번호: ");
			pw = sc.next();
			mc.connect();
			user = mc.login(id,pw);
			
			
			if(user == null) {
				System.out.println("아이디와 비밀번호가 일치하지 않습니다.");
			}else {
				
				System.out.println("로그인한 사용자 정보");
				user.toString();
				
			}
		}while(isStop);
		

	}

}
