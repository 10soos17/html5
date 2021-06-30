<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
	int a = 10;
	public void test(){
		System.out.println("안녕");
	}
%>
	안녕하세요 반갑습니다.<br>
	<!--안녕하세요 반갑습니다.-->
	<%--안녕하세요 반갑습니다.--%>
	<%
	//안녕하세요 반갑습니다.
	int a = (int)(Math.random()*100);
	out.println(a);

	%>
</body>
</html>