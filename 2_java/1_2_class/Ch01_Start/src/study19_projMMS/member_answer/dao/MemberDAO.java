package study19_projMMS.member_answer.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import study19_projMMS.member_answer.vo.Member;
import static study19_projMMS.member_answer.db.jdbcUtil.*;

//9. Oracle DB로 필요한 SQL구문을 전송하는 클래스 구현
public class MemberDAO {

	Connection con;
	

	public MemberDAO(Connection con) {
		this.con = con;
	}

	//1. 회원정보 입력 
	public int insertNewMember(Member m) {

		int count = 0;
		PreparedStatement pstmt = null;
		String sql = "insert into mms_member values(id_seq.nextval, ?, ?, ?, ?, ?)";
		try {

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getAddr());
			pstmt.setString(3, m.getNation());
			pstmt.setString(4, m.getEmail());
			pstmt.setInt(5, m.getAge());

			count = pstmt.executeUpdate();

			if (count > 0) {

				System.out.println("insert success!");
			} else {
				System.out.println("insert fail!");
			}
		} catch (SQLException e1) {
			System.out.println("insert fail!");
		} finally {

			close(pstmt);
		}
		return count;

	}
	//2. 회원목록 보기 
	public ArrayList<Member> selectMemberList() {

		ArrayList<Member> memberList = null;
		Member m = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from mms_member";

		try {

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			memberList = new ArrayList<Member>();

			while (rs.next()) {
				m = new Member(rs.getString("name"), rs.getString("addr"), 
						rs.getString("nation"),rs.getString("email"), rs.getInt("age"));

				memberList.add(m);
			}
			System.out.println("select success!");

		} catch (SQLException e) {
			System.out.println("select fail!");
		} finally {

			close(rs);
			close(pstmt);
		}
		return memberList;
	}
	
	public Member selectOldMember(String name) {

		Member oldMember = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from mms_member where name=?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if (rs.next()) {

				oldMember = new Member(rs.getString("name"), rs.getString("addr"), rs.getString("nation"),
						rs.getString("email"), rs.getInt("age"));

			}
		} catch (SQLException e) {
		}
		finally {

			close(rs);
			close(pstmt);
		}

		return oldMember;
	}
	//4. 내용 수정 
	public int updateMember(Member m) {

		int count = 0;
		PreparedStatement pstmt = null;
		
		String sql = "update mms_member set addr=?, nation=?, email=?, age=? where name=?";

		try {

			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, m.getAddr());
			pstmt.setString(2, m.getNation());
			pstmt.setString(3, m.getEmail());
			pstmt.setInt(4, m.getAge());
			pstmt.setString(5, m.getName());
			
			count = pstmt.executeUpdate();

			if (count > 0) {
				System.out.println("updats success!");
			} else {
				System.out.println("update fail!");
			}
		} catch (SQLException e1) {
			System.out.println("update fail!");
		} finally {

			close(pstmt);
		}
		return count;
	}

	//5. 삭제 
	public int deleteMember(String name) {

		int count = 0;
		PreparedStatement pstmt = null;
		
		String sql = "delete from mms_member where name=?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			count = pstmt.executeUpdate();

			if (count > 0) {
				System.out.println("delete success!");
			} else {
				System.out.println("delete fail!");
			}
		} catch (SQLException e1) {
			System.out.println("delete fail!");
		} finally {

			close(pstmt);
		}
		return count;
	}

}
