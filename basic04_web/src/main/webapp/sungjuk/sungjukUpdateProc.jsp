<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sungjukUpdate.jsp</title>
</head>
<body>
<h3>성적 수정 결과</h3>
<p>
<a href="sungjukForm.jsp">[성적쓰기]</a>
<a href="sungjukList.jsp">[성적목록]</a>
</p>
<%
request.setCharacterEncoding("UTF-8");
int sno=Integer.parseInt(request.getParameter("sno"));
String uname=request.getParameter("uname").trim();
int kor = Integer.parseInt(request.getParameter("kor").trim());
int eng = Integer.parseInt(request.getParameter("eng").trim());
int mat = Integer.parseInt(request.getParameter("mat").trim());
String addr = request.getParameter("addr");
int aver = (kor+eng+mat)/3;
%>
</body>
</html>
