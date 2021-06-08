package study16_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample1 {

	public static void main(String args[]) {

		//String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		
		String url = "jdbc:oracle:thin:@localhost:1521:ee";

		Connection conn = null;

		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (Exception e) {
		}

		try {
			conn = DriverManager.getConnection(url, "madangDB", "madangdb");
			System.out.println("sucess");
			conn.close();
		} catch (SQLException e) {
			System.out.println("fail");
		}

	}

}
