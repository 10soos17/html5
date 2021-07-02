<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	ArrayList<String> names = new ArrayList<String>();
	names.add("한조1");
	names.add("한조2");
	names.add("한조3");
	names.add("한조4");
	names.add("한조5");
	
	request.setAttribute("nameList", names);
	
%>
<!-- 아래로 포워딩된다 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
이름 리스트: <br>

<c:forEach items="${nameList}" var="qwer">
이름: ${qwer}

</c:forEach>
	
</body>
</html>


