<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>수정페이지</h1>
	<form action="./updateContentProcess.do" method="post">
		작성자 : ${content.memberVo.member_nick}<br>
		제목 : <input name="board_title" type="text" value="${content.boardVo.board_title}"><br>
		내용 : <br>
		<textarea name="board_content" rows="10" cols="40">${content.boardVo.board_content}</textarea>
		<br>
		<input type="hidden" name="board_no" value="${content.boardVo.board_no}"><!-- board_no 값 넘기는 법 -->
		
		<input type="submit" value="수정">
	</form>
</body>
</html>