<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ include file="../header.jsp" %>
    <%@ include file="ssi.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginProc</title>
</head>
<body>
<h3>로   그   인   결   과</h3>
<%
out.println("<hr>");
String id=request.getParameter("id").trim();
String passwd=request.getParameter("passwd").trim();

dto.setId(id);
dto.setPasswd(passwd);

String mlevel=dao.loginProc(dto);
if(mlevel==null){
	out.println("<p>아이디/비밀번호 다시 한 번 확인해주세요</p>");
	out.println("<p><a href='javascript:history.back()'>[다시 시도]</a></p>");
}else{
	//out.print("로그인 성공<hr>");
	//out.print("회원등급 : "+mlevel);
	session.setAttribute("s_id", id);
	session.setAttribute("s_passwd", passwd);
	session.setAttribute("s_mlevel", mlevel);
	
	//첫 페이지 이동
	String root=Utility.getRoot();
	response.sendRedirect(root+"/index.jsp");
	
}


%> 
</body>
<%@ include file="../footer.jsp" %>
</html>