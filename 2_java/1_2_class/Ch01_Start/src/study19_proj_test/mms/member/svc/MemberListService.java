package study19_proj_test.mms.member.svc;

import study19_proj_test.mms.member.vo.Member;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//8-2. 회원목록 보기 요청을 처리하는 Business Logic이 구현되는 Service 클래스 구현
public class MemberListService {

	public ArrayList<Member> getMemberList(Connection conn) {

		ArrayList<Member> mList = new ArrayList<>();
		Member m = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			String sql = "select * from mms_member";
			// System.out.println(sql);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			// System.out.println(rs.getString(1));
			while (rs.next()) {

				m = new Member(rs.getInt(1), rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getString(5), rs.getInt(6));

				mList.add(m);

				return mList;

			}

		} catch (SQLException e) {
			System.out.println("error" + e.getMessage());
		}

		return mList;
	}

}
