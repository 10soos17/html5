<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String nickname = "한조";
request.setAttribute("nickname", nickname);
request.setAttribute("mathscore", 80);
%>

<!-- 포워딩 후 아래 코드 실행 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${nickname}
	<br>
	${mathscore}<br>

</body>
</html>