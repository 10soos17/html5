<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	
	String id = (String)session.getAttribute("id");
	//String pass = (String)session.getAttribute("passwd");
	
	System.out.println("id: "+id);
	
	out.println("id: "+id+"<br>");
	//out.println("passwd: "+pass+"<br>");
	
	%>
	
	id:<%=id%>
	
</body>
</html>