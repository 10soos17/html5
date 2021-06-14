package study19_projMMS.member_answer.svc;

import java.sql.Connection;

import study19_projMMS.member_answer.dao.MemberDAO;
import static study19_projMMS.member_answer.db.jdbcUtil.*;

//8-4. 회원정보 삭제 요청을 처리하는 Business Logic이 구현되는 Service 클래스 구현
public class MemberRemoveService {

	public boolean removeMember(String name) {

		boolean isRemoveSuccess = false;
		Connection con = getConnection();
		MemberDAO memberDAO = new MemberDAO(con);

		int deleteCount = memberDAO.deleteMember(name);

		if (deleteCount != 0) {
			isRemoveSuccess = true;
			commit(con);

		} else
			rollback(con);
		close(con);

		return isRemoveSuccess;
	}

}
