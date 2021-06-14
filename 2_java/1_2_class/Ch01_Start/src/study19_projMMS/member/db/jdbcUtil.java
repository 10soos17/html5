package study19_projMMS.member.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//1.DB 관련 공통 기능 클래스 
public class jdbcUtil {

	static Connection conn;

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
		try {
			
			String url = "jdbc:oracle:thin:@localhost:1521:ee";
			conn = DriverManager.getConnection(url, "pjt19", "pjt19");
			System.out.println("Connection Success!");
			
			return conn;
			
		} catch (SQLException e) {
			System.out.println("주소및 id,pw가 다릅니다.");
		}
		return conn;
	}

	public static void close(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {

		}

	}

//	// transaction 처리 메소드
//	public static void transaction(String number) {
//		if (number == "1") {
//			try {
//				conn.commit();
//				System.out.println("commit");
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		} else if (number == "2") {
//			try {
//				conn.rollback();
//				System.out.println("rollback");
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//	}

}
