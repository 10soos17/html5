package study16_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JDBCExample2 {

	public static void main(String args[]) {
		madangDB mdb = new madangDB();
		ArrayList<ArrayList<String>> list = null;

		PreparedStatement pst = null;
		ResultSet res = null;
		// String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String url = "jdbc:oracle:thin:@localhost:1521:ee";

		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (Exception e) {
		}

		try {
			conn = DriverManager.getConnection(url, "madangDB", "madangdb");
			System.out.println("success");

			list = mdb.read_file();
			mdb.insert_db(conn, pst, list);
			mdb.select_db(conn, pst, res);

		} catch (SQLException e) {
			System.out.println("fail");
		}

	}

}
