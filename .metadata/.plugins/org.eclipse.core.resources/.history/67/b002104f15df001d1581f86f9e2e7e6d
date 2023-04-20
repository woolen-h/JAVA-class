<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="auth.jsp" %>
    <%@ include file="../header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>로   그   인</h3>
<%if(s_id.equals("guest")||s_passwd.equals("guest")||s_mlevel.equals("guest")){ %>
<form action="loginProc.jsp" id="loginfrm" method="post" name="loginfrm" onsubmit="return loginCheck()">
<table>
<tr>
<td>
<input type="text" id="id" name="id" placeholder="아이디" maxlength="10" required="required">
</td>
<td rowspan="2">
<input type="image" src="../images/bt_login.gif">
</td>
</tr>
<tr>
<td>
<input type="password" id="passwd" name="passwd" placeholder="비밀번호" maxlength="10" required="required">
</td>
</tr>
</table>
</form>
<% 
}else{
	//로그인 성공
	out.println("<strong>"+s_id+"</strong> 님");
	out.println("<a href='logout.jsp'>[로그아웃]</a>");
} %>
</body>
<%@ include file="../footer.jsp" %>
</html>