<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page buffer="1kb" autoFlush="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
autoFlush="true"::출력 버퍼가 꽉차면(1kb) Flush 출력이 된다<br>
<%
	for(int i=0;i<1000;i++){
		out.print(1234);
	}

%>
</body>
</html>