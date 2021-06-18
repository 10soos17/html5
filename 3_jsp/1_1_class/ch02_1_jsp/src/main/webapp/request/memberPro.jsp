<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%request.setCharacterEncoding("UTF-8");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
//[Tomcat 경로 숨기는 법]
		
//server.xml -> <Context docBase="ch02_1_jsp" path="/ch02_1_jsp" reloadable="true"...>
//에서 path를 /로 수정하면 아래처럼 context path 숨겨짐 
//http://localhost:8080/ch02_1_jsp/request/memberPro.jsp

//http://localhost:8080/request/memberPro.jsp
//http://localhost:8080
//http://localhost
%>
<%
	String number = request.getParameter("number");
	String name = request.getParameter("name");
	String grade = request.getParameter("grade");
	String subject = request.getParameter("subject");
	
	out.println(number+" : "+name+" : "+grade+" : "+subject);
%>

학번: <%=number%><br><br>
이름(Jsp): <%=name%><br>
이름(EL): ${param.name}<br><br>
학년: <%=grade%><br>
학년: ${param.grade}<br><br>
선택과목: <%=subject%><br>
선택과목: ${param.subject}<br><br>

<HR>

요청 URI: <%=request.getRequestURI()%><br>
context path: <%=request.getContextPath()%><br>
서버이름: <%=request.getServerName()%><br>
포트번호: <%=request.getServerPort()%><br>

</body>
</html>