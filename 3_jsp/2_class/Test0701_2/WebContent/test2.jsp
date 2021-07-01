<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Cookie[] cookies = request.getCookies();

String value = null;

System.out.println("전달 받은 쿠키 갯수: " + cookies.length);

if (cookies != null) {
	for (Cookie c : cookies) {

		System.out.println("=======================");
		System.out.println("name : " + c.getName());
		System.out.println("value : " + c.getValue());

		if (c.getName().equals("jj")) {
			value = c.getValue();
		}
	}
}

request.setAttribute("qqqq", value);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	쿠키 내용 출력 :${qqqq}
	<br>
</body>
</html>