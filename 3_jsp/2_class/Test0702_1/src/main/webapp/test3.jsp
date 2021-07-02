<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
int a = 10;
int b = 5;
int c = 20;
request.setAttribute("qqqq", a);
request.setAttribute("eeee", b);
request.setAttribute("rrrr", c);
%>
<!-- 포워딩 후 아래 코드 실행 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${qqqq}
	<br> ${qqqq+10}
	<br> ${qqqq+eeee}
	<br> ${rrrr+"20"}
	<br> ${qqqq < 100 && qqqq > 50}
	<br> ${qqqq < 100 || qqqq > 50}
	<br> ${!empty qqqq}
	<br> ${!empty sessionUserData}
	<br>

</body>
</html>