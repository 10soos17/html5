<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
	pageContext.setAttribute("page", "p1");//현재페이지
	request.setAttribute("request", "req1");//요청한페이지 있으면 저장(forwqrd,include)
	session.setAttribute("sess", "session1");//서로 다른 웹브라우저 접속시,서로 다른 session 기본객체 사용
	application.setAttribute("app", "application1");//모든 JSP는 한개의 application 기본 객체를 공유하고, application 기본 객체는 APPLICATION 영역
	%>

	pageScope::<%=pageContext.getAttribute("page")%><br>
	requestScope::<%=request.getAttribute("request")%><br>
	sessionScope::<%=session.getAttribute("sess")%><br>
	applicationScope::<%=application.getAttribute("app")%><br>
	<hr>
	pageScope::${pageScope.page}<br>
	requestScope::${requestScope.request}<br>
	sessionScope::${sessionScope.sess}<br>
	applicationScope::${applicationScope.app}<br>
	<hr>
	<jsp:forward page="otherScope.jsp"></jsp:forward>
</body>
</html>