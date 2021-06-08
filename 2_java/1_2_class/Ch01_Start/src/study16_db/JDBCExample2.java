package study16_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JDBCExample2 {

	public static void main(String args[]) {

		Connection conn = null;

		madangDB mdb = new madangDB();
		ArrayList<ArrayList<String>> list = null;

		try {
			// String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String url = "jdbc:oracle:thin:@localhost:1521:ee";
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, "madangDB", "madangdb");
			System.out.println("success");

			list = mdb.read_file();
			mdb.insert_db(conn, list);
			mdb.select_db(conn);

		} catch (ClassNotFoundException e) {
			System.out.println("ojdbc.jar가 해당 위치에 없습니다.");
		} catch (SQLException e) {
			System.out.println("주소 및 id, pw가 다릅니다.");
		}

		try {
			conn.close();
		} catch (SQLException e) {

		}

	}

}
