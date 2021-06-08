package study16_db_answer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class madangDB {
	
	public ArrayList<ArrayList<String>> read_file() {
		BufferedReader reader = null;
		Reader r = null;
		ArrayList<ArrayList<String>> list = new ArrayList<>();

		try {
			r = new FileReader(
					"/Users/soos/Desktop/git/lecture/lecture_choongang/2_java/1_2_class/Ch01_Start/src/study16_db/data.txt");
			reader = new BufferedReader(r);

			while (true) {
				String data = reader.readLine();
				if (data == null)
					break;
				ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(data.split(",")));
				list.add(list2);

			}
		} catch (Exception e) {
			System.out.println("error" + e);

		}
		//System.out.println(list);
		return list;

	}

	public void insert_db(Connection conn, PreparedStatement pst, ArrayList<ArrayList<String>> fList) {

		String sql = "INSERT INTO GOODSINFO VALUES(?,?,?,?)";
		//System.out.println(fList);
		
		try {
			for (ArrayList<String> value : fList) {
				pst = conn.prepareStatement(sql);
				pst.setString(1, value.get(0));
				pst.setString(2, value.get(1));
				pst.setInt(3, Integer.parseInt(value.get(2)));
				pst.setString(4, value.get(3));
				pst.executeUpdate();
			}
			System.out.println("insert success");
		} catch (SQLException e) {
			System.out.println(e+"insert fail");
		}

	}

	public void select_db(Connection conn, PreparedStatement pst, ResultSet res) {
		
		String sql = "SELECT * FROM goodsinfo";

		try {
			pst = conn.prepareStatement(sql);
			res = pst.executeQuery();
			while (res.next()) {
				//System.out.println(res);
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
