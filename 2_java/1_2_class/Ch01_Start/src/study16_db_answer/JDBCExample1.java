package study16_db_answer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample1 {

	public static void main(String args[]) {
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:ee";// orcl
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, "java", "java");
			System.out.println("DB에 접속했습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("ojdbc6_g.jar가 해당 위치에 없습니다.");
		} catch (SQLException e) {
			System.out.println("주소 및 id, pw가 다릅니다.");
		}
		System.out.println("정상적 종료");
	}

}
