<%@page import="oracle.security.o3logon.a"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="ssi.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/layout.css">
<style>
a{
color: yellow;
}
</style>
</head>
<body>
<div>
<h3>아이디 중복 확인 결과</h3>
<%
	String id=request.getParameter("id").trim();
	int cnt=dao.duplecateID(id);
	out.println("입력 ID :" + id);
	if(cnt==0){
		out.println("<p>사용 가능한 아이디 입니다.</p>");
		%>
		<!-- 사용 가능한 아이디 > 부모창 전달 -->
		<a href="javascript:apply('<%=id%>')">[적용]</a>
		<script>
		function apply(id) {
			//alert(id);
			opener.document.memfrm.id.value=id;
			window.close();
		}//apply
		</script>
		
		<%
	}else{
		out.println("<p>해당 아이디는 사용할 수 없습니다.</p>");
	}//if
%>
<hr>
	
	<a href="javascript:history.back()">[다시검색]</a>
	<a href="javascript:window.close()">[창닫기]</a>
<hr>	
</body>
</html>