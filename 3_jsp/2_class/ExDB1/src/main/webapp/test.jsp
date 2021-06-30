<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	관리자 페이지 : 보유 책 리스트
	<br>

	<%
	//DB 연동, (JAVA)
	//SELECT,,,출력!!!
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:ee";//orcl

	Connection conn = DriverManager.getConnection(url, "scott", "scott");
	Statement stm = conn.createStatement();
	String query = "SELECT * FROM Book";
	ResultSet rs = stm.executeQuery(query);

	while (rs.next()) {
		String bookname = rs.getString("bookname");
		String publisher = rs.getString("publisher");
		out.println("책이름 : " + bookname + ", 출판사 : " + publisher + "<br>");
	}
	;
	rs.close();
	stm.close();
	conn.close();
	%>


</body>
</html>