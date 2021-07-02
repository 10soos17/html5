<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.*"%>
<%@page import="a.a.a.*"%>

<%
ArrayList<StudentInfo> studentList = new ArrayList<StudentInfo>();
studentList.add(new StudentInfo("트레", 70, 90));
studentList.add(new StudentInfo("한조", 3, 7));
studentList.add(new StudentInfo("메르시", 90, 90));
studentList.add(new StudentInfo("브리기테", 19, 80));
studentList.add(new StudentInfo("돔피", 77, 12));

request.setAttribute("stList", studentList);
%>

<!-- 아래로 포워딩 됨! -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	학생 명단:
	<br>
	<c:forEach items="${stList}" var="student">
		이름: ${student.name}, 
		영어: 
		<c:choose>
			<c:when test = "${student.engScore < 10}">
			<span style="color:red">${student.engScore}</span>
			</c:when>
			<c:otherwise>
			<span>${student.engScore}</span>
			</c:otherwise>
		</c:choose>
			,
		수학: ${student.mathScore} <br>
		
	</c:forEach>
</body>
</html>


