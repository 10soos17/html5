package study19_projMMS.member_answer.svc;

import java.sql.Connection;
import java.util.ArrayList;

import study19_projMMS.member_answer.vo.Member;
import study19_projMMS.member_answer.dao.MemberDAO;
import static study19_projMMS.member_answer.db.jdbcUtil.*;



//8-2. 회원목록 보기 요청을 처리하는 Business Logic이 구현되는 Service 클래스 구현
public class MemberListService {

	public ArrayList<Member> getMemberList() {

		Connection con = getConnection();
		MemberDAO memberDAO = new MemberDAO(con);

		ArrayList<Member> memberList = memberDAO.selectMemberList();

		return memberList;
	}

}
