package study16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample2 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			Connection conn = DriverManager.getConnection(url, "java", "java");
			
			Statement stmt = conn.createStatement();
			String str = "select code,name,price,maker from goodsinfo";
			ResultSet rs = stmt.executeQuery(str);
			
			System.out.println("    상품코드       상품명 \t    가격   제조사");
			System.out.println("------------------------------");
			
			while(rs.next()) {
			 String code = rs.getString("code");
			 String name = rs.getString(2);
			// String price = rs.getString("price");
			 int price = rs.getInt("price");
			 String maker = rs.getString(4);
			 System.out.printf("%8s %s %6d %s%n", code,name,price,maker);
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("ojdbc6_g.jar가 해당 위치에 없습니다.");
		} catch (SQLException e) {
			System.out.println("주소및 id,pw가 다릅니다.");
		}

		System.out.println("정상적 종료");

	}

}
