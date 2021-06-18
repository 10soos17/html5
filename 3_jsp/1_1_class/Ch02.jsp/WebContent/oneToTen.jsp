<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>

<%
Date now = new Date(); /* scriptlet */
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>scriptlet:65</title>
</head>
<body>
	현재시각: <%=now%><!--표현식(expression)-->
<hr>

<%
int sum=0;
for(int i=1; i<=10; i++){
	sum = sum + i;
	out.println("sum "+i+" ::"+sum+"<br>");
%>
	sum<%=i%>::<%=sum%> <br>
<%
}
%>

1~10합:: <%=sum%>입니다. 



</body>
</html>