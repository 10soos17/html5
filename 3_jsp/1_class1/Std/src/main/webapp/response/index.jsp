<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<h4>forward</h4>
<img src="forward.png">
<h4>redirect</h4>
<img src="sendRedirect.png">
<hr>
name(Jsp): <%=request.getParameter("name")%><br>
name(EL): ${param.name}<br>
</body>
</html>