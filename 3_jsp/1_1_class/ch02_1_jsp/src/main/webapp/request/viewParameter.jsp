<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String addr = request.getParameter("addr");
	String name = request.getParameter("name");
	String pet[] = request.getParameterValues("pet");
%>

이름: <%=name%><br><br>
주소: <%=addr%><br>
좋아하는 동물은:
<%for(String str : pet) {%>
<%=str%><br>
<%} %>


</body>
</html>