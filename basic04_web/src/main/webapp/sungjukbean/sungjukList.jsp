<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="ssi.jsp" %>
    <jsp:include page="ssi.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sungjukList.jsp</title>
</head>
<body>
<h3>성적 목록</h3>
<p>
<a href="sungjukForm.jsp">[성적쓰기]</a>
</p>
<table>
<tr>
<th>이름</th>
<th>국어</th>
<th>영어</th>
<th>수학</th>
<th>등록일</th>
</tr>
<%
ArrayList<SungjukDTO> list=dao.list();
if(list==null){
	out.println("<tr>");
	out.println("<td colspan='5'>글 없음</td>");
	out.println("</tr>");
}else{
	for(int i=0; i<list.size(); i++){
		dto=list.get(i);
%>
<tr>
<td><a href="sungjukRead.jsp?sno=<%= dto.getSno() %>"><%=dto.getUname() %></a></td>
<td><%=dto.getKor() %></td>
<td><%=dto.getEng() %></td>
<td><%=dto.getMat() %></td>
<td><%=dto.getWdate().substring(0,10) %></td>
</tr>
<%
	}//for end
}
%>
</table>
</body>
</html>