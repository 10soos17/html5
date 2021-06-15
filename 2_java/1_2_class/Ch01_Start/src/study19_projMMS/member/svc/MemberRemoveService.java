package study19_projMMS.member.svc;

import study19_projMMS.member.db.jdbcUtil;
import study19_projMMS.member.dao.MemberDAO;
import study19_projMMS.member.util.ConsoleUtil;
//8-4. 회원정보 삭제 요청을 처리하는 Business Logic이 구현되는 Service 클래스 구현
public class MemberRemoveService {

	public void removeMember(String name) {

		MemberDAO mdao = new MemberDAO(jdbcUtil.getConnection());
		int resCount = mdao.deleteMember(name);
		ConsoleUtil cs = new ConsoleUtil();

		if (resCount != 0)
			cs.printRemoveSuccessMessage(name);
		else
			cs.printRemoveFailMessage(name);

	}

}
