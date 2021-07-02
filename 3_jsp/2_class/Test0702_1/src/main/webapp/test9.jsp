<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.*"%>
<%
	ArrayList<String> list = new ArrayList<String>();
	list.add("한조1");
	list.add("한조2");
	list.add("한조3");
	list.add("한조4");
	list.add("한조5");
	
	request.setAttribute("list", list);
%>

<!-- 아래로 포워딩 됨! -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<c:forEach items="${list}" var="name" varStatus="status">
	${name} : ${status.index} : ${status.first} : ${status.last} <br>
	</c:forEach>
</body>
</html>


