<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String id = request.getParameter("id");
String pass = request.getParameter("passwd");

response.setContentType("text/html;charset=utf-8");

//출력1: java 출력
System.out.println(id+pass);

//출력2: 화면출력(web)
PrintWriter out1 = response.getWriter();
out1.println("아이디: "+id+"<br>");
out1.println("비밀번호: "+pass+"<br>");


//출력3: jsp
out.println("id: "+id+", passwd: "+pass);


%>
	<br>
	<b><%=id%><br><%=pass%><b>
</body>
</html>