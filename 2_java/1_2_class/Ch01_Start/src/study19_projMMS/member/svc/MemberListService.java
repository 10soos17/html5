package study19_projMMS.member.svc;

import study19_projMMS.member.vo.Member;
import study19_projMMS.member.db.jdbcUtil;
import study19_projMMS.member.dao.MemberDAO;
import study19_projMMS.member.util.ConsoleUtil;

//8-2. 회원목록 보기 요청을 처리하는 Business Logic이 구현되는 Service 클래스 구현
public class MemberListService {

	public void getMemberList() {

		MemberDAO mdao = new MemberDAO(jdbcUtil.getConnection());
		ConsoleUtil cu = new ConsoleUtil();

		mdao.selectMemberList();

		if (Member.mHash != null)
			cu.printMemberList(Member.mHash);

	}

}
