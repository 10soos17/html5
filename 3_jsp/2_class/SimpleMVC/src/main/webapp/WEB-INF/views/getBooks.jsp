<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	책 제목 리스트: <br>
	
	<c:forEach items="${abcd}" var="ddd">
		<!--var="ddd"는 pageContext 속성에 저장한 것을 의미--> 
		책이름 : ${ddd.bookname}, 출판사 : ${ddd.publisher}<br>
	</c:forEach>
	
</body>
</html>