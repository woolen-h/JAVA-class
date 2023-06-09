<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="ssi.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sungjukRead.jsp</title>
</head>
<body>
<h3>성적 상세보기</h3>
<p>
<a href="sungjukForm.jsp">[성적쓰기]</a>
<a href="sungjukList.jsp">[성적목록]</a>
</p>
<%
Connection con=null;
PreparedStatement pstmt=null;
ResultSet rs = null;

int sno=Integer.parseInt(request.getParameter("sno"));
dto=dao.read(sno); 
if(dto==null){
	out.println("해당 글 없음");
}else{
	
}//if end

try{
	String url     ="jdbc:oracle:thin:@localhost:1522:xe";
	String user    ="c##w";
	String password="1234";
	String driver  ="oracle.jdbc.driver.OracleDriver";			
	Class.forName(driver);						
	con=DriverManager.getConnection(url, user, password);			

	
	StringBuilder sql=new StringBuilder();
	
	sql.append("SELECT sno, uname, kor, eng, mat, wdate, addr, aver ");
	sql.append("FROM sungjuk ");
	sql.append("where sno=? ");
	
	pstmt=con.prepareStatement(sql.toString());
	pstmt.setInt(1, sno);
	rs = pstmt.executeQuery();
	
	if(rs.next()){
%>
		<table>
		<tr>
		<th>이름</th>
		<td><%=rs.getString("uname") %></td>
		</tr>
		<tr>
		<th>국어</th>
		<td><%=rs.getInt("kor") %></td>
		</tr>
		<tr>
		<th>영어</th>
		<td><%=rs.getInt("eng") %></td>
		</tr>
		<tr>
		<th>수학</th>
		<td><%=rs.getInt("mat") %></td>
		</tr>
		<tr>
		<th>평균</th>
		<td><%=rs.getInt("aver") %></td>
		</tr>
		<tr>
		<th>주소</th>
		<td><%=rs.getString("addr") %>
		<%
		String addr=rs.getString("addr");
		if(addr.equals("Seoul")){
			out.print("서울");
		}else if(addr.equals("Jeju")){
			out.print("제주");
		}else if(addr.equals("Suwon")){
			out.print("수원");
		}else if(addr.equals("Busan")){
			out.print("부산");
		}else {
			out.print(addr);}//if end
		}
				 %>
		</td>
		</tr>
		<tr>
		<th>작성일</th>
		<td><%=rs.getString("wdate") %></td>
		</tr>
		</table>
		<br><br>
		<a href="sungjukUpdate.jsp?sno=<%=sno%>">[수정]</a>
		&nbsp;&nbsp;
		<a href="sungjukDel.jsp?sno=<%=sno%>">[삭제]</a>
		<%
}finally{
	
}
		%>
</body>
</html>