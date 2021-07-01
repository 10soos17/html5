<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//session.setAttribute("jj", "1111");
	Cookie ccc1 = new Cookie("jj11", "1111");
	ccc1.setMaxAge(60*60*24);
	response.addCookie(ccc1);
	
	Cookie ccc2 = new Cookie("jj22", "1111");
	response.addCookie(ccc2);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
</body>
</html>