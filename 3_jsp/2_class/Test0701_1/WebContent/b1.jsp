<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    		<%
	System.out.println("b11111");
    request.setAttribute("hello1", "안녕하세요");
    session.setAttribute("hello2", "안녕하세요");
    
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 리다이렉트 예제: request 2번(=링크 바뀜), response 2번, 실행 2개 파일 모두-->
	b1.jsp입니다.<br>
</body>
</html>

<%
response.sendRedirect("./b2.jsp");
%>