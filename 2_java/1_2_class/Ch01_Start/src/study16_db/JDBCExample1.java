package study16_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample1 {

	public static void main(String args[]) {

		Connection conn = null;

		try {
			// String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:ee";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "madangDB", "madangdb");
			System.out.println("success");

		} catch (ClassNotFoundException e) {
			System.out.println("ojdbc.jar가 해당 위치에 없습니다.");
		} catch (SQLException e) {
			System.out.println("주소 및 id, pw가 다릅니다.");
		}
		System.out.println("정상적 종료");

		try {
			conn.close();
		} catch (SQLException e) {

		}

	}

}
