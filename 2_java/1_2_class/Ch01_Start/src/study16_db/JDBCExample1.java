package study16_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample1 {

	public static void main(String args[]) {

		String url = "jdbc:oracle:thin:@localhost:1521:orcl";

		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (Exception e) {
		}

		try {
			conn = DriverManager.getConnection(url, "madangDB", "madangdb");
			System.out.println("sucess");
		} catch (SQLException e) {
			System.out.println("fail");
		}

	}

}
