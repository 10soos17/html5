package study19_proj_test.mms.member.action;
import java.sql.Connection;
import java.util.Scanner;

import study19_proj_test.mms.member.db.jdbcUtil;

//7-2 회원등록 보기 요청 처리하는 Action 클래스 구현
public class MemberListAction implements Action {
	
	jdbcUtil jdbc = new jdbcUtil();
	Connection conn = null;

	@Override
	public void execute(Scanner sc) throws Exception {
		
		conn = jdbcUtil.getConnection();
		jdbcUtil.transaction(conn,"3");
		
	}

}
