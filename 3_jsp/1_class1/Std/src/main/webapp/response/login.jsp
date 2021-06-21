<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
입력한 id가 "admin"이 맞으면, redirect: index.jsp<br>
파라미터로 name=hong 전달하기

<%
String name = request.getParameter("memberid");

if(name != null && name.equals("admin")){
	response.sendRedirect("index.jsp?name=hong");
}
else{
	out.println("잘못된 id입니다.");
}
%>


</body>
</html>