<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>03_applicationTest.jsp</title>
</head>
<body>
	<h3>내장 객체</h3>
	<%
	out.print(application.getRealPath("/bbs"));
	out.print("<hr>");
	
	application.setAttribute("uid", "ITWILL");
	out.print(application.getAttribute("uid"));
	out.print("<hr>");
	
	/* response.sendRedirect(""); */
	
	
	%>
</body>
</html>