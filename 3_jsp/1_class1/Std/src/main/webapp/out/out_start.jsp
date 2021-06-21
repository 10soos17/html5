<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
버퍼의 크기::<%=out.getBufferSize() %><br>
버퍼의 남은 크기::<%=out.getRemaining() %><br>
autoFlush: <%=out.isAutoFlush()%>
<%
out.print("4"+"<br>");
String name="hong";
out.println("출력되는 값1: "+name);
%>

<%
out.println("출력되는 값2: "+name);
%>
</body>
</html>