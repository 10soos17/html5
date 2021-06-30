package com.ja.service;

import java.util.ArrayList;

import com.ja.vo.BookVO;
import java.sql.*;

public class BookService {
	// 책 생성 .. Insert
	public void createBook(String bookname, String publisher, int price) {
		// ... DB ... INSERT
		String sql = "insert into Book values(Book_seq.nextval, '"+bookname+"', '"+publisher+"', "+price+")";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:ee";

			Connection conn = DriverManager.getConnection(url, "scott", "scott");
			Statement stm = conn.createStatement();
			
			stm.executeUpdate(sql);
			
			stm.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	// 책 출력 내용(리스트) 가져오기 ..SELECT
	public ArrayList<BookVO> getBooks() {
		ArrayList<BookVO> list = new ArrayList<BookVO>();

		String sql = "select * from book";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:ee";

			Connection conn = DriverManager.getConnection(url, "scott", "scott");
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				int bookid = rs.getInt("bookid");
				String bookname = rs.getString("bookname");
				String publisher = rs.getString("publisher");
				int price = rs.getInt("price");

				BookVO vo = new BookVO(bookid, bookname, publisher, price);
				list.add(vo);
			}

			rs.close();
			stm.close();
			conn.close();

		} catch (Exception e) {
		}

		return list;

	}

	// 책 이름 수정 .. UPDATE
}
