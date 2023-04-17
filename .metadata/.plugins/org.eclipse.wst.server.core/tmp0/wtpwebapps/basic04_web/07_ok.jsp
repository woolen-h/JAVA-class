<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>07_ok.jsp</title>
</head>
<body>
	<h3>성적 결과</h3>
	<%
	//request 내장객체 : 사용자가 요청한 모든 정보를 관리하는 객체
	//request.getParameter(""): 사용자가 입력한 정보를 개별적으로 가져올때
	/*
	out.print(request.getParameter("uname"));
	out.print("<hr>");
	out.print(request.getParameter("kor"));
	out.print("<hr>");
	out.print(request.getParameter("eng"));
	out.print("<hr>");
	out.print(request.getParameter("mat"));
	out.print("<hr>");
	*/
	request.setCharacterEncoding("UTF-8");
	String uname=request.getParameter("uname").trim();
	int kor=Integer.parseInt(request.getParameter("kor").trim());
	int eng=Integer.parseInt(request.getParameter("eng").trim());
	int mat=Integer.parseInt(request.getParameter("mat").trim());
	int aver=(kor+eng+mat)/3;
	%>
	<table>
	<tr>
	<th>이름</th>
	<td><%=uname%></td>
	</tr>
	<tr>
	<th>국어</th>
	<td><%=kor%></td>
	</tr>
	<tr>
	<th>영어</th>
	<td><%=eng%></td>
	</tr>
	<tr>
	<th>수학</th>
	<td><%=mat%></td>
	</tr>
	<tr>
	<th>평균</th>
	<td><%=aver%></td>
	</tr>
	</table>
</body>
</html>