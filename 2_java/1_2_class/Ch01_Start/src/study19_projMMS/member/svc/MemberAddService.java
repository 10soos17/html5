package study19_projMMS.member.svc;

import study19_projMMS.member.vo.Member;
import study19_projMMS.member.db.jdbcUtil;
import study19_projMMS.member.dao.MemberDAO;
import study19_projMMS.member.util.ConsoleUtil;

//8-1. 회원등록 Business Logic이 구현되는 Service 클래스 구현
public class MemberAddService {

	public void addMember(Member newMember) throws Exception {

		MemberDAO mdao = new MemberDAO(jdbcUtil.getConnection());
		int resCount = mdao.insertNewMember(newMember);
		ConsoleUtil cs = new ConsoleUtil();

		if (resCount != 0)
			cs.printAddSuccessMessage(newMember);
		else
			cs.printAddFailMessage(newMember);

	}

}
