<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="viewParameter.jsp" method="post">
		이름:<input type="text" name="name" id="name"><br>
		주소:<input type="text" name="addr" id="addr"><br>
		
		좋아하는 동물:<br>
		<input type="checkbox" name="pet" value="dog" checked>강아지&nbsp;&nbsp;
		<input type="checkbox" name="pet" value="cat">고양이&nbsp;&nbsp;
		<input type="checkbox" name="pet" value="pig">돼지<br>
		
		<input type="submit" value="전송">
	</form>

</body>
</html>