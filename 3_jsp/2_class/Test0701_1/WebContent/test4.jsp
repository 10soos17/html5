<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
pageContext.setAttribute("케이1", "한조1");
request.setAttribute("k2", "한조2");
session.setAttribute("케이2", "한조3");
application.setAttribute("k4", "한조4");
%>
<!DOCTYPE html>
<%request.setCharacterEncoding("UTF-8");%>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
String str;
String str2;
%>
<%
str = (String)pageContext.getAttribute("케이1");
str2 = (String)session.getAttribute("케이2");
%>
	page:<%=str2 %><br>
	page :${케이1}<br>
	req  : ${k2 }<br>
	sess : ${k3 }<br>
	app  : ${k4 }<br>
</body>
</html>