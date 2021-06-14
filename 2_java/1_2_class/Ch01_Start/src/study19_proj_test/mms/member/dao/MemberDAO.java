package study19_proj_test.mms.member.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import study19_proj_test.mms.member.vo.Member;

//9. Oracle DB로 필요한 SQL구문을 전송하는 클래스 구현
public class MemberDAO {

	Connection con;

	public MemberDAO(Connection con) {
		this.con = con;
	}

	public int insertNewMember(Member m) {

		int count = 0;
		Statement stmt = null;
		String sql = "insert into mms_member values(id_seq.nextval," + "'" + m.getName() + "','"
				+ m.getAddr() + "','" + m.getNation() + "','" + m.getEmail() + "',"+m.getAge() + ")";

		try {
			
			stmt = con.createStatement();
			count = stmt.executeUpdate(sql);

			if (count > 0) {
				
				System.out.println("1_insert success!");
			} else {
				System.out.println("insert fail!");
			}
		} catch (SQLException e1) {
			System.out.println("0_insert fail!");
		}

		try {
			stmt.close();
			con.close();
		} catch (SQLException e) {

		}
		return count;

	}

	public void selectMemberList() {

		Member m;
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "select * from mms_member";
		
		try {
			
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				m = new Member(rs.getInt(1), rs.getString(2), rs.getString(3), 
								rs.getString(4), rs.getString(5),rs.getInt(6));

			}
			System.out.println("select success!");

		} catch (SQLException e) {
			System.out.println("select fail!");
		}
	}

	public int updateMember(Member m) {

		int count = 0;
		Statement stmt = null;
		String sql = "update mms_member set addr=" + "'" + m.getAddr() + "'," + " nation=" + "'" + m.getNation()
		+ "'," + " email=" + "'" + m.getEmail() + "'," + " age=" + m.getAge() + " where name=" + "'"
		+ m.getName() + "'";

		try {
			
			stmt = con.createStatement();
			count = stmt.executeUpdate(sql);

			if (count > 0) {
				System.out.println("updats success!");
			} else {
				System.out.println("update fail!");
			}
		} catch (SQLException e1) {
			System.out.println("update fail!");
		}

		try {
			stmt.close();
			con.close();
		} catch (SQLException e) {

		}
		return count;
	}

	public int deleteMember(String name) {

		int count = 0;
		Statement stmt = null;
		String sql = "delete from mms_member where name=" + "'" + name + "'";

		try {
			stmt = con.createStatement();
			count = stmt.executeUpdate(sql);

			if (count > 0) {
				System.out.println("delete success!");
			} else {
				System.out.println("delete fail!");
			}
		} catch (SQLException e1) {
			System.out.println("delete fail!");
		}

		try {
			stmt.close();
			con.close();
		} catch (SQLException e) {

		}
		return count;
	}

}
