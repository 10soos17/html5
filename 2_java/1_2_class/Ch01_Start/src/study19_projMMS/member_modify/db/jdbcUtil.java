package study19_projMMS.member_modify.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

//1.DB 관련 공통 기능 클래스 
public class jdbcUtil {

	static {
		// 클래스가 로딩될 때 단 한번 호출되는 영역
		// Class.forName : 특정 클래스를 메모리로 로딩하는 메소드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("ojdbc.jar가 해당 위치에 없습니다.");
		}

	}

	public static Connection getConnection() {
		// 디비 작업에 필요한 Connection 객체를 생성해 주는 메소드
		Connection conn = null;

		try {

			String url = "jdbc:oracle:thin:@localhost:1521:ee";
			conn = DriverManager.getConnection(url, "pjt19", "pjt19");
			conn.setAutoCommit(false); // Transaction 시작을 의미, commit은 안함.

			System.out.println("Connection Success!");

		} catch (SQLException e) {
			System.out.println("주소및 id,pw가 다릅니다.");
		}
		return conn;
	}

	public static void close(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void close(Statement stmt) {
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// transaction 처리 메소드
	public static void commit(Connection conn) {
		try {
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void rollback(Connection conn) {

		try {
			conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
