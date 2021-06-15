package study19_projMMS.member_modify.svc;

import java.sql.Connection;

import study19_projMMS.member_modify.vo.Member;
import study19_projMMS.member_modify.dao.MemberDAO;
import static study19_projMMS.member_modify.db.jdbcUtil.*;



//8-3. 회원정보 수정 요청을 처리하는 Business Logic이 구현되는 Service 클래스 구현
public class MemberModifyService {
	
//	public Member getOldMember(String name) {
//
//		Member oldMember = null;
//		Connection con = getConnection();
//		MemberDAO mdao = new MemberDAO(con);
//		oldMember = mdao.selectOldMember(name);
//		close(con);
//
//		return oldMember;
//	}
	
	// 실제 DB에 수정
	public boolean modifyMember(Member updateMember) {

		boolean isModifySuccess = false;
		Connection con = getConnection();
		MemberDAO mdao = new MemberDAO(con);

		int updateCount = mdao.updateMember(updateMember);

		if (updateCount > 0) {
			isModifySuccess = true;
			commit(con);
		} else
			rollback(con);
		close(con);
		
		return isModifySuccess;
	}
}
