<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h3>SCOPE Result 페이지</h3>
	<%
	out.print("1. pageContext 영역 : " + pageContext.getAttribute("one") + "<hr>");
	out.print("2. request 영역 : " + request.getAttribute("two") + "<hr>");
	out.print("3. session 영역 : " + session.getAttribute("three") + "<hr>");
	out.print("4. application 영역 : " + application.getAttribute("uid") + "<hr>");

	%>
</body>
</html>