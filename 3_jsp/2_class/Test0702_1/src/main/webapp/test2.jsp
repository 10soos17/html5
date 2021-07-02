<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="java.util.*"%>
<%
int engScore = 10;
int mathScore = 20;
String name = "브리기테";
int a = 10;
int b = 20;
int c = 30;
request.setAttribute("engScore", engScore);
request.setAttribute("mathScore", mathScore);
request.setAttribute("name", name);

HashMap<String, Object> data = new HashMap<String, Object>();
data.put("aaa", engScore);
data.put("bbb", mathScore);
data.put("ccc", name);

request.setAttribute("qqq", data);

%>
<!-- 포워딩 후 아래 코드 실행 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${qqq.ccc}
	<br>

</body>
</html>