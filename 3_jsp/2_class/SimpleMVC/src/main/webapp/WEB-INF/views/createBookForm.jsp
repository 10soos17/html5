<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>책 등록하기</h1>
	
	<form action="./createBook.do">
		책 이름: <input type="text" name="bookname"><br>
		출판사: <input type="text" name="publisher"><br>
		가격: <input type="number" name="price"><br>
		<input type="submit" value="등록하기">
	</form>
	<br><br>
	<a href="./getBooks.do">목록으로</a>
</body>
</html>