package study19_projMMS.member_modify.svc;

import java.sql.Connection;

import study19_projMMS.member_modify.vo.Member;
import study19_projMMS.member_modify.dao.MemberDAO;
import static study19_projMMS.member_modify.db.jdbcUtil.*;

//8-1. 회원등록 Business Logic이 구현되는 Service 클래스 구현
public class MemberAddService {

	public boolean addMember(Member newMember) throws Exception {

		boolean isInsertSuccess = false;

		Connection con = getConnection();
		MemberDAO memberDAO = new MemberDAO(con);

		int insertCount = memberDAO.insertNewMember(newMember);
		
		if (insertCount > 0) {
			commit(con); // 완전 저장
			isInsertSuccess = true;
		} else {
			rollback(con);
		}
		close(con);
		
		return isInsertSuccess;
	}

}
