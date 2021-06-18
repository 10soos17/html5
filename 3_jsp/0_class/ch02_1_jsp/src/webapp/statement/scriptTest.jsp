<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%request.setCharacterEncoding("UTF-8");%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%! //선언문 - 전역변수(메소드 안에서 사용가능)
	String str = "나는 (전역) 변수입니다.";
	%>

	<%! //선언문 - 메소드 선언
		String getString(){
		return str;
	}
	%>
	
	<% 
	String str1 = "나는 (지역) 변수입니다."; //지역변수
	%>
	
	<br>
	선언문에서 선언한 변수 str은 <%=str%><br>
	선언문에서 선언한 함수 출력은 <%=getString()%><br>
	scriptlet에서 선언한 변수 str1은 <%=str%><br>

	<hr>
	
	<%!
	public int multiply(int a, int b){
		int c = a * b;
		return c;
	}
	%>
	
	10*25 = <%=multiply(10,25)%>
	
</body>
</body>
</html>