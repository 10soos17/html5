package study16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample1 {
//ojdbc6_g.jar: 64bit용 (O)
//ojdbc6.jar  : 32bit용
// 위치: C:\\app\\user\\product\\11.2.0\\dbhome_1\\jdbc\\lib/ojdbc6_g.jar
	
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			Connection conn = DriverManager.getConnection(url, "java", "java");
			System.out.println("Database에 접속했습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("ojdbc6_g.jar가 해당 위치에 없습니다.");
		} catch (SQLException e) {
			System.out.println("주소및 id,pw가 다릅니다.");
		}

		System.out.println("정상적 종료");
	}

}
