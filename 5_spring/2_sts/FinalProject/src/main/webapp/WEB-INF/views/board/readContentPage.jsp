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
	<h1>게시글 보기</h1>

	<h2>제목 : ${content.boardVo.board_title}</h2>

	작성자 : ${content.memberVo.member_nick}
	<br>작성일 : <fmt:formatDate value="${content.boardVo.board_writedate}" pattern="yyyy년 MM월 dd일 hh시 mm분 ss초"/>
	<br> 내용 :
	<br> ${content.boardVo.board_content}
	<br>
	<br>

	<a href="./mainPage.do">목록으로</a>

	<!--로그인상태 && 글 소유자가 본인일 경우만 보이도록 -->
	<!-- sessionUser 값 있는가 && sessionUser의 MemberVo의 member_no, content속성에 BoardVo의 board_no 동일한가-->
	<c:if test="${!empty sessionUser && sessionUser.member_no == content.memberVo.member_no}">
		<a href="./deleteContentProcess.do">삭제</a>
		<a href="./updateContentPage.do">수정</a>
	</c:if>


</body>
</html>