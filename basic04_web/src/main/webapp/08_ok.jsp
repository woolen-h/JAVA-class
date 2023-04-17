<%@page import="org.apache.tomcat.util.buf.Utf8Encoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>08_ok.jsp</title>
</head>
<body>
<h3>계산결과</h3>
<%
//한글 인코딩
//request.setCharacterEncoding("UTF-8");
//사용자 입력요청 정보 가져오기
int num1=Integer.parseInt(request.getParameter("num1").trim());
int num2=Integer.parseInt(request.getParameter("num2").trim());
String op=request.getParameter("op").trim();

int res1=0;
double res2=0.0;

if(op.equals("+")){
	res1=num1+num2;
}else if(op.equals("-")){
	res1=num1-num2;
}else if(op.equals("*")){
	res1=num1*num2;
}else if(op.equals("/")){
	res2=(double)num1/num2;
}else if(op.equals("%")){
	res1=num1%num2;
}//if
%>
<table>
<tr>
<td><%=num1%></td>
<td><%=op%></td>
<td><%=num2%></td>
<td>=</td>
<td>
<%if(op.equals("/")){
	out.print(String.format("%.1f", res2));
	}else{
		out.print(res1);
	}//if
	 %>
</td>
<td></td>
</tr>
</table>

</body>
</html>