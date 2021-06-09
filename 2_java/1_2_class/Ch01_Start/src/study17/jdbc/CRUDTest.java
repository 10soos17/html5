package study17.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Create/Read/Update/Delete
public class CRUDTest {

	Connection con;
	static {
//		try {
//			String url = "jdbc:oracle:thin:@localhost:1521:ee";// orcl
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//		} catch (ClassNotFoundException e) {
//
//		}

	}

	public void connect() {
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";// orcl
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, "java", "java");
			System.out.println("success");

		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("connecet error");
		}

	}

	public void insert() {
		// "'aaa', '111', '홍길동', '22', '서울시', 'a@a.com'"

		try {

			Statement pst = con.createStatement();
			String sql = "INSERT INTO members(id,password, name,age,addr,email)"
					+ "VALUES('aaa','111','홍길동',22,'서울시','@a.com')";

			int r = pst.executeUpdate(sql);
			con.commit();
			System.out.println("변경된 row : " + r);

			System.out.println("insert success");
		} catch (SQLException e) {
			System.out.println(e + "insert fail");
		}

	}

	public void select() {

		PreparedStatement pst = null;
		ResultSet res = null;
		String sql = "SELECT * FROM members";

		try {
			pst = con.prepareStatement(sql);
			res = pst.executeQuery();

			while (res.next()) {

				System.out.println("id: " + res.getString(1) + "\n" + "passwd: " + res.getString(2) + "\n" + "name: "
						+ res.getString(3) + "\n" + "age: " + res.getInt(4) + "\n" + "addr: " + res.getString(5) + "\n"
						+ "email: " + res.getString(6) + "\n");
			}
			System.out.println("select success");
		} catch (SQLException e) {
			System.out.println("select fail");
		}
	}

	public void update() {

		String addr = "부산시";
		String id = "aaa";
		String sql = "update members set addr='" + addr + "' where id='"+id+"'";
		System.out.println(sql);

		try {
			Statement pst = con.createStatement();
			int r = pst.executeUpdate(sql);
			con.commit();
			System.out.println("변경된 row : " + r);
			System.out.println("update success");
		} catch (SQLException e) {
			System.out.println("update fail");
		}

	}

	public void delete() {
		// id=aaa 삭제
		String id = "aaa";
		String sql = "delete members where id='"+id+"'";

		try {
			Statement pst = con.createStatement();
			int r = pst.executeUpdate(sql);
			con.commit();
			System.out.println("변경된 row : " + r);
			System.out.println("delete success");
		} catch (SQLException e) {
			System.out.println("delete fail");
		}

	}

	public static void main(String[] args) {
		CRUDTest st = new CRUDTest();
		st.connect();
		System.out.println("connect 수행 후");
		st.insert();
		System.out.println("insert 수행 후");

		st.select();
		//st.connect();
		st.update();
		System.out.println("update 수행 후");
		st.select();
		st.delete();
		System.out.println("delete 수행 후");
		st.select();
		// st.connect();
	}
}
