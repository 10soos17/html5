package study16_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample2 {
	public static void main(String args[]) {
		PreparedStatement pst = null;
		ResultSet res = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";

		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (Exception e) {
		}

		try {
			conn = DriverManager.getConnection(url, "madangDB", "madangdb");
			System.out.println("sucess");
			insert_db(conn, pst);
			select_db(conn, pst, res);

		} catch (SQLException e) {
			System.out.println("fail");
		}

	}

	public static void insert_db(Connection conn, PreparedStatement pst) {
		String sql = "INSERT INTO GOODSINFO VALUES(?,?,?,?)";
		try {
//			   10005 SmartPhone 	     8990000 GaLuxyNote
//			   10001 디지털TV 	      350000 LG
//			   10002 DVD 플레이어 	      250000 LG
//			   10003 디지털 카메라 	      210000 삼성
//			   10004 컬러 전자사전 	      300000 아이리버

			pst = conn.prepareStatement(sql);
			pst.setString(1, "10005");
			pst.setString(2, "SmartPhone");
			pst.setInt(3, 8990000);
			pst.setString(4, "GaLuxyNote");
			pst.executeUpdate();
			System.out.println("insert success");
		} catch (SQLException e) {
			System.out.println("insert fail");
		}

	}

	public static void select_db(Connection conn, PreparedStatement pst, ResultSet res) {
		String sql = "SELECT * FROM goodsinfo";

		try {
			pst = conn.prepareStatement(sql);
			res = pst.executeQuery();
			while (res.next()) {
				System.out.println(res);
				System.out.println("상품코드: " + res.getString(1) + "\n" + "상품명: " + res.getString(2) + "\n" + "가격: "
						+ res.getInt(3) + "\n" + "제조사: " + res.getString(4) + "\n"

				);
			}
			System.out.println("select success");
		} catch (SQLException e) {
			System.out.println("select fail");
		}

	}

}
