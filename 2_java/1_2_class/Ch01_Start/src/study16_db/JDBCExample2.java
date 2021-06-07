package study16_db;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
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
		
//	      	BufferedReader reader = null;
//	        Reader r = null;
//	        List<String> list = null;
//	        
//	        Connection con = null;
//	        PreparedStatement stmt =null;
//	        int count =0;
//	        try {
//	            r = new FileReader("../../data.txt");
//	            reader = new BufferedReader(r);
//	            list = new ArrayList<String>(); // 자료 담을 자료구조 생성
//	            while (true) {
//	                String data = reader.readLine();
//	                if (data == null) 
//	                    break;
//	                String[] arr = data.split(",");
//	                count++;// 배열에서 값을 하나씩 꺼내어 insert하기 좋은 형태로 저장 // ex) map, list
//	                // 여기까지 ,를 구분으로 배열이 만들어졌는데
//	 
//	                for (String string : arr) { // 하나씩 뽑아서 리스트에 add
//	                    list.add(string);
//	 
//	                }
//	                System.out.println(list);
//	 
//	            }

		String sql = "INSERT INTO GOODSINFO VALUES(?,?,?,?)";
		try {

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
