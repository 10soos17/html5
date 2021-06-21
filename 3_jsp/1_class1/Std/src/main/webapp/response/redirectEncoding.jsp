<%@ page import="java.net.URLEncoder" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
    <%String value = "자바";
String encodeValue = URLEncoder.encode(value, "utf-8");
response.sendRedirect("index.jsp?name="+encodeValue);%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>