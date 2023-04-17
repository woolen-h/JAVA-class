<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>10_ok</title>
</head>
<body>
<h3>request 내장 객체의 다양한 메소드 결과</h3>
<%
out.print(request.getParameter("uid"));
out.print("<hr>");
out.print(request.getRemoteAddr());
out.print("<hr>");
out.print(request.getRemoteHost());
out.print("<hr>");
out.print(request.getRemotePort());
out.print("<hr>");
out.print(request.getRemoteUser());
out.print("<hr>");
out.print(request.getContextPath());
out.print("<hr>");
out.print(request.getRequestURI());
out.print("<hr>");
out.print(request.getRequestURL());
out.print("<hr>");
request.setAttribute("user", "KOREA");
out.print(request.getAttribute("user"));
out.print("<hr>");
Object obj=request.getAttribute("user");
String str=(String)obj;
out.print(str);
out.print("<hr>");
out.print(application.getRealPath("/images"));
out.print("<hr>");
%>
</body>
</html>