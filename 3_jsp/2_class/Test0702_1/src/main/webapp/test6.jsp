<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="a.a.a.*"%>
<%@page import="java.util.*"%>

<%

StudentInfo st1 = new StudentInfo("브리", 10, 20);
StudentInfo st2 = new StudentInfo("한조", 30, 40);

HashMap<String, Object> map = new HashMap<String, Object>();

map.put("ss1", st1);
map.put("ss2", st2);

request.setAttribute("xx", map);
//request.setAttribute("x2", st2);
%>

<!-- 포워딩 후 아래 코드 실행 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 변수 접근이 아님, getter를 호출-->

	${xx.ss1.name}<br>
	${xx.ss2.name}<br>
	
</body>
</html>




