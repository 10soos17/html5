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
	<h1>회원 가입</h1>
	<!-- db insert : 무조건 post -->
	<form action="./joinMemberProcess.do" method="post">
		ID : <input type="text" name="member_id"><br>
		PW : <input type="password" name="member_pw"><br>
		Nick : <input type="text" name="member_nick"><br>
		성별 : 
		<input type="radio" name="member_gender" value="M" checked>남 
		<input type="radio" name="member_gender" value="F">여<br>
		생년월일 : <input type="date" name="member_birth"><br>
		전화번호 : <input type="text" name="member_phone"><br>
		E-Mail : <input type="text" name="member_email"><br>
		취미 :
		<!-- joinMemberPage.do 요청시, FP_hobby_category_table db 읽어와서 Model설정, 화면에 뿌려주기 -->
		<c:forEach items="${hobbyCategoryList}" var="xxxx">
			<input name="hobby_category_no" value="${xxxx.hobby_category_no}" type="checkbox">${xxxx.hobby_category_name}
		</c:forEach>
		<br>
		
		<input type="submit" value="회원 가입">
		
	</form>
</body>
</html>