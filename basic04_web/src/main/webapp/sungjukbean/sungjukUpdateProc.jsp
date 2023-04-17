<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ include file="ssi.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sungjukUpdateProc</title>
</head>
<body>
<h3>성적 수정 결과</h3>
<p>
<a href="sungjukForm.jsp">[성적쓰기]</a>
<a href="sungjukList.jsp">[성적목록]</a>
</p>
<%
int sno=Integer.parseInt(request.getParameter("sno"));
String uname = request.getParameter("uname").trim();
int kor = Integer.parseInt(request.getParameter("kor").trim());
int eng = Integer.parseInt(request.getParameter("eng").trim());
int mat = Integer.parseInt(request.getParameter("mat").trim());
String addr = request.getParameter("addr").trim();
int aver = (kor+eng+mat)/3;

dto.setUname(uname);
dto.setKor(kor);
dto.setEng(eng);
dto.setMat(mat);
dto.setAver(aver);
dto.setAddr(addr);
dto.setSno(sno);

int cnt=dao.update(dto);

if(cnt==0){
	out.println("<p>성적 수정이 실패했습니다.</p>");
	out.println("<p><a href='javascript:history.back()'>[다시 시도]</a></p>");
}else{
	out.println("<script>");
	out.println("alert('성적이 수정되었습니다.');");
	out.println("location.href='sungjukList.jsp';");
	out.println("</script>");
}
%>
<table>
<tr>
<th>이름</th>
<td><%=dto.getUname() %></td>
</tr>
<tr>
<th>국어</th>
<td><%=dto.getKor() %></td> 
</tr>
<tr>
<th>영어</th>
<td><%=dto.getEng() %></td>
</tr>
<tr>
<th>수학</th>
<td><%=dto.getMat() %></td> 
</tr>
<tr>
<th>평균</th>
<td><%=dto.getAver() %></td> 
</tr>
<tr>
<th>주소</th>
<td><%=dto.getAddr() %></td>
</tr>
</table>
</body>
</html>