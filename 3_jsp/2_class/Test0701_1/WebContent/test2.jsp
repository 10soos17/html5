<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//값 세팅
	pageContext.setAttribute("k1", "한조1");
	pageContext.setAttribute("k1", "한조1111");
	
	request.setAttribute("k1", "한조2");
	//request.setAttribute("k1", "한조222");
	
	session.setAttribute("k1", "한조3");
	//session.setAttribute("k3", "한조333");
	
	application.setAttribute("k1", "한조4");
	//application.setAttribute("k4", "한조444");
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