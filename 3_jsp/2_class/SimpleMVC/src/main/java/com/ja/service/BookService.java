package com.ja.service;

import java.util.ArrayList;

import com.ja.vo.BookVO;
import java.sql.*;

public class BookService {
	// 梨� �깮�꽦 .. Insert
	public void createBook(String bookname, String publisher, int price) {
		// ... DB ... INSERT
		String sql = "insert into Book values(Book_seq.nextval, '"+bookname+"', '"+publisher+"', "+price+")";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";

			Connection conn = DriverManager.getConnection(url, "scott", "scott");
			Statement stm = conn.createStatement();
			
			stm.executeUpdate(sql);
			
			stm.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	// 梨� 異쒕젰 �궡�슜(由ъ뒪�듃) 媛��졇�삤湲� ..SELECT
	public ArrayList<BookVO> getBooks() {
		ArrayList<BookVO> list = new ArrayList<BookVO>();

		String sql = "select * from book";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";

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

	// 梨� �씠由� �닔�젙 .. UPDATE
}
