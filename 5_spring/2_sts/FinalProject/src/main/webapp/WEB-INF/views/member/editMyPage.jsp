<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>

	<jsp:include page="../commons/globalNav.jsp"></jsp:include>
	
	<h1>마이페이지</h1>
		<form action="./editMyPageProcess.do" method="post">
			<input type="hidden" name="member_no" value="${sessionUser.member_no}"><!-- member_no 값 넘기는 법 -->
			ID : <input type="text" name="member_id" value="${sessionUser.member_id}" disabled> <br>
			Nick : <input type="text" name="member_nick" value="${sessionUser.member_nick}"><br>
			성별 : 
			<input type="radio" name="member_gender" value="M">남 
			<input type="radio" name="member_gender" value="F">여<br>
			생년월일 : <input type="date" name="member_birth" value="${sessionUser.member_birth}"><br>
			전화번호 : <input type="text" name="member_phone" value="${sessionUser.member_phone}"><br>
			E-Mail : <input type="text" name="member_email" value="${sessionUser.member_email}"><br>
			취미 :	
			<c:forEach items="${hobbyCategoryList}" var="hobby">
				<input name="hobby_category_no" value="${hobby.hobby_category_no}" type="checkbox">${hobby.hobby_category_name}
			</c:forEach>
			<br>
			<input type="submit" value="제출"><br>


		</form>
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>