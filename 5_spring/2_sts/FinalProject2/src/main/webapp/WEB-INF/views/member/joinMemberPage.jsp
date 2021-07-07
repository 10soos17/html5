<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원 가입</h1>
	
	<form action="./joinMemberProcess.do">
		ID : <input type="text" name="member_id"><br>
		PW : <input type="password" name="member_pw"><br>
		Nick : <input type="text" name="member_nick"><br>
		성별 : 
		<input type="radio" name="member_gender" value="M" checked>남 
		<input type="radio" name="member_gender" value="F">여<br>
		생년월일 : <input type="date" name="member_birth"><br>
		전화번호 : <input type="text" name="member_phone"><br>
		E-Mail : <input type="text" name="member_email"><br>
		<input type="submit" value="회원 가입">
		
	</form>
</body>
</html>