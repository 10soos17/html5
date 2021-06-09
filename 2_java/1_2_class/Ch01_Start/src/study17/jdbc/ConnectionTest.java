package study17.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//1. DB 연결하기 
public class ConnectionTest {
	Connection con;

	static {

	}

	public void connect() {
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:ee";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				con = DriverManager.getConnection(url, "java", "java");
			} catch (SQLException e) {
			}
			System.out.println("success");
		} catch (ClassNotFoundException e) {
			System.out.println("error");
		}

	}

	public static void main(String[] args) {
		ConnectionTest ct = new ConnectionTest();
		ct.connect();
	
	}

}
