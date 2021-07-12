<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 페이지</h1>
	<!--resources로 이미지 등록하는 법과 link로 이미지 등록하는 법 차이 -->
	<!--setvlet-context.xml : <resources mapping="/resources/**" location="/resources/" /> -->
	<img alt="" src="../resources/img/img01.png">
	
	
	<form action="./loginProcess.do" method="post">
		ID : <input type="text" name="member_id"><br>
		PW : <input type="password" name="member_pw"><br>
		<input type="submit" value="로그인"><br>
	</form>
	
	<a href="./joinMemberPage.do">회원 가입</a>
	
	
	
</body>
</html>