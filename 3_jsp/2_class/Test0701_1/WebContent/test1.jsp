<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//값 세팅
	pageContext.setAttribute("k1", "한조1");
	request.setAttribute("k2", "한조2");
	session.setAttribute("k3", "한조3");//접속시 set, 해지(웹브라우저종료) 전까지 남아있음
	application.setAttribute("k4", "한조4");//서버시작될때 set, 서버종료까지 남아있음
	
	//값 추출
	String str0 = (String)pageContext.getAttribute("k1fsd"); //없는 값 get하면 null값을 리턴함
	System.out.println(str0);
	String str1 = (String)pageContext.getAttribute("k1");
	System.out.println(str1);
	String str2 = (String)request.getAttribute("k2");
	System.out.println(str2);	
	String str3 = (String)session.getAttribute("k3");
	System.out.println(str3);
	String str4 = (String)application.getAttribute("k4");
	System.out.println(str4);
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>