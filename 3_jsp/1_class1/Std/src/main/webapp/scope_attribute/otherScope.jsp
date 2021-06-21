<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>otherScope</title>
</head>
<h2>otherScope</h2>
<body>
	pageScope::<%=pageContext.getAttribute("page")%><br>
	requestScope::<%=request.getAttribute("request")%><br>
	sessionScope::<%=session.getAttribute("sess")%><br>
	applicationScope::<%=application.getAttribute("app")%><br>
</body>
