package study17_CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CRUDEx {
//	create table memebers(
//	id varchar2(20) primary key,
//	pw varchar2(20),
//	name varchar2(20),
//	age number(10),
//	addr varchar2(200),
//	email varchar2(20)
//)
	Connection con;
	String url = "jdbc:oracle:thin:@localhost:1521:ee";

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
		}
	}

	public void connect() {
		try {

			con = DriverManager.getConnection(url, "java", "java");
			System.out.println("DB에 접속했습니다.");

		} catch (SQLException e) {
			System.out.println("error");
		}

	}

	public void insert() {

		Statement st = null;
		String sql = "INSERT INTO members VALUES('aaa', 111, '홍길동', 22, '서울시', 'a@email')";

		try {
			st = con.createStatement();
			int rs = st.executeUpdate(sql);

			System.out.println(rs);
			System.out.println("insert success");
		} catch (SQLException e) {
			System.out.println(e + "insert fail");
		}

	}

	public void select() {

		String sql = "SELECT * FROM members";
		PreparedStatement pst = null;
		ResultSet res = null;

		try {
			pst = con.prepareStatement(sql);
			res = pst.executeQuery();

			while (res.next()) {

				System.out.println("id: " + res.getString(1) + "\n" + "pw: " + res.getString(2) + "\n" + "name: "
						+ res.getString(3) + "\n" + "age: " + res.getInt(4) + "\n" + "addr: " + res.getString(3) + "\n"
						+ "email: " + res.getString(4) + "\n");
			}
			System.out.println("select success");
		} catch (SQLException e) {
			System.out.println("select fail");
		}
	}

	public void update() {
		Statement st = null;
		String sql = "UPDATE members set addr='부산시' where id='aaa'";

		try {
			st = con.createStatement();
			int rs = st.executeUpdate(sql);

			System.out.println(rs);
			System.out.println("update success");
		} catch (SQLException e) {
			System.out.println(e + "update fail");
		}
	}

	public void delete() {
		Statement st = null;
		String sql = "DELETE from members where id='aaa'";

		try {
			st = con.createStatement();
			int rs = st.executeUpdate(sql);

			System.out.println(rs);
			System.out.println("delete success");
		} catch (SQLException e) {
			System.out.println(e + "delete fail");
		}
	}

	public static void main(String[] args) {
		CRUDEx ce = new CRUDEx();
		ce.connect();

		ce.insert();
		ce.select();
		System.out.println("================");
		ce.update();
		ce.select();
		System.out.println("================");
		ce.delete();
		ce.select();
		System.out.println("================");
		try {
			ce.con.close();
		} catch (SQLException e) {
		}
	}

}
