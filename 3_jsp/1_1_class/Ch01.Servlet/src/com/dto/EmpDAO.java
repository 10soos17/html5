package com.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmpDAO {
	Connection conn;
	String url= null;
	// DB접속
	public EmpDAO() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			url = "jdbc:oracle:thin:@localhost:1521:orcl";
			
		} catch (ClassNotFoundException e) {
			System.out.println("Connection Success!");
		}

	}

	// select
	public ArrayList<EmpDTO> select() {

		ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();
		EmpDTO emp = null;
		ResultSet rs = null;
		String sql = "select empno, ename, sal, deptno from emp";

		try {
			conn = DriverManager.getConnection(url, "scott", "scott");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString(2);
				int sal = rs.getInt("sal");
				int deptno = rs.getInt("deptno");
				
				list.add(new EmpDTO(empno, ename, sal, deptno));
						
			}
		} catch (SQLException e) {
			System.out.println("SQL에 문제가 있습니다.");
		}

		return list;
	}

}
