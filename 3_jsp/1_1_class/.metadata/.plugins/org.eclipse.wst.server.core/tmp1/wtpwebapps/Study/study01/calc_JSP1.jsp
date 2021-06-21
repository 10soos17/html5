<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

	<h3>계산기</h3>
	<hr>

	<div class="calculator">
		<form action="Calc1" method="post">
		
			<input type="number" name="num1" id="num1" value="">
			<select id="op" name="op">
				<option selected>+</option>
				<option>-</option>
				<option>*</option>
				<option>/</option>
			</select> 
			<input type="number" name="num2" id="num2" value="">
			<input type="submit" name="operate" id="operate" value="계산"> 
			<input type="button" id="resetBtn" value="다시입력">

		</form>
	</div>


</body>
</html>