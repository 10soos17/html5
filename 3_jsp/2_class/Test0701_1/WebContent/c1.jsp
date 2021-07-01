<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	System.out.println("c11111");
	request.setAttribute("hello", "안녕하세요");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 아래처럼 쓸 일은 절대 없다.-->
	<!-- forward 예제 : request 1번(=링크 안바뀜), response 1번, 실행은 2개 파일 모두-->
	<!-- MVC모델 구현의 핵심 -->
	c1.jsp입니다.<br> 
	<jsp:forward page="./c2.jsp"></jsp:forward>
</body>
</html>