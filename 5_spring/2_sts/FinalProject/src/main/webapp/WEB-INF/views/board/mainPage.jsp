<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>자유 게시판</h1>

	<c:choose>
		<c:when test="${!empty sessionUser}">
		${sessionUser.member_nick}님 환영합니다 <a href="../member/logoutProcess.do">로그아웃</a>
			<br>
		</c:when>
		<c:otherwise>
		비회원으로 접근하였습니다 <a href="../member/loginPage.do">로그인</a>
		</c:otherwise>
	</c:choose>

	<br>
	<br>

	<table border="1">
		<tr>
			<td>글 번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>조회수</td>
			<td>작성일</td>
		</tr>
		
		<!-- contentList 속성 : class boardController.java -> 메소드 mainPage(Model model)
		-> 내에서 model.addAttribute("contentList", contentList);로 속성 저장함 -->
		<c:forEach items="${contentList}" var="data">
			<tr>
				<td>${data.boardVo.board_no}</td>
				<td><a href="./readContentPage.do?board_no=${data.boardVo.board_no}">${data.boardVo.board_title}</a></td>
				<td>${data.memberVo.member_nick}</td>
				<td>${data.boardVo.board_readcount}</td>
				<td><fmt:formatDate value="${data.boardVo.board_writedate}" pattern="yy-MM-dd"/></td>
			</tr>

		</c:forEach>
	</table>

	<br>

	<c:if test="${!empty sessionUser}">
		<a href="./writeContentPage.do">글쓰기</a>
	</c:if>



</body>
</html>