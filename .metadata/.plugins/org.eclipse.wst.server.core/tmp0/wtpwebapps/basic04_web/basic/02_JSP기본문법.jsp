<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>02_JSP기본문법.jsp</title>
</head>
<body>
	<h3>JSP 기본문법</h3>
	<hr>
	<h4>대한민국</h4>
	<hr>
	1+2+3
	<hr>
	<%
	out.print("무궁화");
	out.print(123+456);
	out.print(5+7);
	out.print(8.9);
	out.print('X');
	out.print("<h1>악마</h1>");
	out.print("<img src='../images/devil.png'>");
	out.print("<hr>");
	out.println("<style>.txt{color:red}</style>");
	out.println("<span class=txt>오필승코리아</span>");
	%>
</body>
</html>