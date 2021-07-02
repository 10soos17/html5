<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="a.a.a.*"%>

<%
int engScore = 10;
int mathScore = 20;
String name = "브리기테";

StudentInfo st1 = new StudentInfo(name, engScore, mathScore);

request.setAttribute("student1", st1);
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
	<!--${student1.naaaaame}--><br>
	${student1.name}<br>
	${student1.engScore}<br>
	${student1.mathScore}<br>
	
</body>
</html>