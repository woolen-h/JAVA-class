<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="ssi.jsp" %>
    
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sungjukUpdate</title>
</head>
<body>
<h3>성적 상세보기</h3>
<p>
<a href="sungjukForm.jsp">[성적쓰기]</a>
<a href="sungjukList.jsp">[성적목록]</a>
</p>
<%
int sno=Integer.parseInt(request.getParameter("sno"));
dto=dao.read(sno);
if(dto==null){
	out.println("성적 수정 실패");
	out.println("<p><a href='javascript:history.back()'>[다시 시도]</a></p>");
}else{
		%>
		<form action="sungjukUpdateProc.jsp" name="sungjukfrm" id="sungjukfrm" method="post">
			<!-- 사용자에게는 필요한 값 X > hidden -->
			<input type="hidden" name="sno" value="<%=sno%>">
			<table>
			<tr>
			<th>이름</th>
			<td><input type="text" value="<%=dto.getUname() %>" name="uname" id="uname" maxlength="50" required="required" autofocus="autofocus"></td>
			</tr>
			<tr>
			<th>국어</th>
			<td><input type="number" value="<%=dto.getKor() %>" name="kor" id="kor" size="5" min="0" max="100" placeholder="국어점수"></td>
			</tr>
			<tr>
			<th>영어</th>
			<td><input type="number" value="<%=dto.getEng() %>" name="eng" id="eng" size="5" min="0" max="100" placeholder="영어점수"></td>
			</tr>
			<tr>
			<th>수학</th>
			<td><input type="number" value="<%=dto.getMat() %>" name="mat" id="mat" size="5" min="0" max="100" placeholder="수학점수"></td>
			</tr>
			<tr>
			<th>주소</th>
			<td>
			<select name="addr" id="addr">
			<option value="Seoul"<%if(dto.equals("Seoul")) {out.print("selected");} %>>서울</option>
			<option value="Jeju"<%if(dto.equals("Jeju")) {out.print("selected");} %>>제주</option>
			<option value="Suwon"<%if(dto.equals("Suwon")) {out.print("selected");} %>>수원</option> 
			<option value="Busan"<%if(dto.equals("Busan")) {out.print("selected");} %>>부산</option>
			</select>
			</td>
			</tr>
			<tr>
			<td colspan="2" align="center">
			<input type="submit" value="수정">
			<input type="reset" value="취소">
			</td>
			</tr>
			</table>
			</form>
			<%
	out.println("<script>");
	out.println("성적이 수정되었습니다.");
	out.println("</script>");
}//end
%>
</body>
</html>