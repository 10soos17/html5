package study17_CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx {

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

	public static void main(String[] args) {
		ConnectionEx ce = new ConnectionEx();
		ce.connect();
	}

}
