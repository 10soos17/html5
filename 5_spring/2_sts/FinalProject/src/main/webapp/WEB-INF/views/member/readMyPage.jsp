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
		<form action="./editMyPage.do" method="post">
			ID : <input type="text" name="member_id" value="${sessionUser.member_id}" disabled> <br>
			PW : <input type="password" name="member_pw" value="${sessionUser.member_pw}" disabled>
			<input type="submit" value="변경"><br>
			Nick : <input type="text" name="member_nick" value="${sessionUser.member_nick}" disabled><br>
			성별 : 
			<c:choose>
				<c:when test="${sessionUser.member_gender == 'M'}">
					<input type="radio" name="member_gender" value="M" checked disabled>남 
				</c:when>
				<c:otherwise>
					<input type="radio" name="member_gender" value="F" checked disabled>여<br>
				</c:otherwise>
			</c:choose>
			성별 : 
			<input type="text" name="member_nick" value="${sessionUser.member_gender}" disabled><br>
			생년월일 : <input type="date" name="member_birth" value="${sessionUser.member_birth}" disabled><br>
			전화번호 : <input type="text" name="member_phone" value="${sessionUser.member_phone}" disabled><br>
			E-Mail : <input type="text" name="member_email" value="${sessionUser.member_email}" disabled><br>
			취미 :	
			<c:forEach items="${myHobbyCategoryList}" var="myHobby">
				<input name="hobby_category_no" value="${myHobby.hobby_category_no}" type="checkbox" checked disabled>${myHobby.hobby_category_name}
			</c:forEach>
			<br>
			<input type="submit" value="정보 수정"><br>


		</form>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>