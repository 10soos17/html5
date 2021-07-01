<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//값 세팅
pageContext.setAttribute("k1", "한조1");
request.setAttribute("k2", "한조2");
session.setAttribute("k3", "한조3");
application.setAttribute("k4", "한조4");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	page : ${k1 }<br>
	req  : ${k2 }<br>
	sess : ${k3 }<br>
	app  : ${k4 }<br>
	
</body>
</html>