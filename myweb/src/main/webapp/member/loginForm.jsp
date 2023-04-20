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
<%if(s_id.equals("guest")||s_passwd.equals("guest")||s_mlevel.equals("guest")){ 
//ID 저장 쿠키 확인
Cookie[] cookies=request.getCookies();
String c_id="";
if(cookies!=null){//쿠키값 존재 여부
	for(int i=0; i<cookies.length; i++){//모든 쿠키값 검색
		Cookie cookie=cookies[i];
		if(cookie.getName().equals("c_id")==true){
			c_id=cookie.getValue();//쿠키 변수값 가져오기
		}//if
	}//for
}//if end
%>

<form action="loginProc.jsp" id="loginfrm" method="post" name="loginfrm" onsubmit="return loginCheck()">
<table>
<tr>
<td>
<input type="text" id="id" name="id" placeholder="아이디" value="<%=c_id %>" maxlength="10" required="required">
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
<tr>
<td colspan="2">
<label> <input type="checkbox" name="c_id" id="c_id" value="SAVE">ID 저장 </label>
&nbsp;&nbsp;&nbsp;
<a href="agreement.jsp">회원가입</a>
&nbsp;&nbsp;&nbsp;
<a href="findID.jsp">ID/PW 찾기</a>
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