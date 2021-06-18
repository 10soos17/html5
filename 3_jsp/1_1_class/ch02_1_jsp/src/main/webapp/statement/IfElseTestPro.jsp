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
	<%
	String name = request.getParameter("name");
	Integer age = Integer.parseInt(request.getParameter("age"));
	//String str = "";
	if (age >= 20) {
		System.out.println(name + "님의 나이는 " + age + " 이상입니다.");
		out.println(name + "님의 나이는 " + age + " 이상입니다.");
		//str += name + "님의 나이는 " + age + " 이상입니다.";
	%>

	<%=name%>님의 나이는
	<%=age%>
	이상입니다.

	<%
	} else {%>
	<% System.out.println(name + "님은 " + age + " 입니다. 20 이하이므로 미성년자입니다.");	%>
	<% out.println(name + "님은 " + age + " 입니다. 20 이하이므로 미성년자입니다.");	}%>
	<% //str += name + "님은 " + age + " 입니다. 20 이하이므로 미성년자입니다.";	%>


	
	<%=name%>님은
	<%=age%>
	입니다. 20 이하이므로 미성년자입니다.";
	<!--%=str%-->


</body>
</body>
</html>