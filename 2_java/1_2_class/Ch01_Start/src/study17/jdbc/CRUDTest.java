package study17.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
			String url = "jdbc:oracle:thin:@localhost:1521:ee";// orcl
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
			}
			con = DriverManager.getConnection(url, "java", "java");
			System.out.println("success");
		} catch (SQLException e) {
			System.out.println("connecet error");
		}

	}

	public void insert() {
		// "'aaa', '111', '홍길동', '22', '남', 'a@a.com'"
		PreparedStatement pst = null;
		ResultSet res = null;
		String sql = "INSERT INTO members VALUES(?,?,?,?,?)";

		try {

			pst = con.prepareStatement(sql);
			pst.setString(1, "aaa");
			pst.setString(2, "111");
			pst.setString(3, "홍길동");
			pst.setInt(4, 22);
			pst.setString(5, "남");
			pst.setString(6, "@a.com");

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
						+ res.getString(3) + "\n" + "age: " + res.getInt(4) + "\n" + "gender: " + res.getString(4)
						+ "\n" + "email: " + res.getString(4) + "\n");
			}
			System.out.println("select success");
		} catch (SQLException e) {
			System.out.println("select fail");
		}
	}

	public void update() {
		// id=aaa를 찾아서 gender=여
		PreparedStatement pst = null;
		String sql = "Update set gender=? members where id=?";

		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, "여");
			pst.setString(2, "aaa");
			pst.executeUpdate(sql);
			System.out.println("update success");

		} catch (SQLException e) {
			System.out.println("select fail");
		}
	}

	public void delete() {
		// id=aaa 삭제
		PreparedStatement pst = null;
		String sql = "delete members where id=?";

		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, "aaa");
			pst.executeUpdate(sql);
			System.out.println("delete success");
		} catch (SQLException e) {
			System.out.println("select fail");
		}

	}

	public static void main(String[] args) {
		CRUDTest st = new CRUDTest();
		st.connect();
		System.out.println("connect 수행 후");
		st.insert();
		System.out.println("insert 수행 후");

		//st.select();

//		//st.connect();
//		st.update();
//		System.out.println("update 수행 후");
//		st.select();
//		st.delete();
//		System.out.println("delete 수행 후");
//		st.select();
//		//st.connect();
	}
}
