<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sungjukUpdate.jsp</title>
</head>
<body>
<h3>성적 상세보기</h3>
<p>
<a href="sungjukForm.jsp">[성적쓰기]</a>
<a href="sungjukList.jsp">[성적목록]</a>
</p>
<%
int sno=Integer.parseInt(request.getParameter("sno"));

Connection con=null;
PreparedStatement pstmt=null;
ResultSet rs = null;

try{
	String url     ="jdbc:oracle:thin:@localhost:1522:xe";
	String user    ="c##w";
	String password="1234";
	String driver  ="oracle.jdbc.driver.OracleDriver";			
	Class.forName(driver);						
	con=DriverManager.getConnection(url, user, password);			
	//out.println("오라클 DB 서버 연결 성공");
//out.print(request.getParameter("sno"));
	StringBuilder sql=new StringBuilder();
	sql.append("SELECT sno, uname, kor, eng, mat, wdate, addr, aver ");
	sql.append("FROM sungjuk ");
	sql.append("where sno=? ");
	
	pstmt=con.prepareStatement(sql.toString());
	pstmt.setInt(1, sno);
	rs = pstmt.executeQuery();
	if(rs.next()){
		%>
			<form action="sungjukUpdateProc.jsp" name="sungjukfrm" id="sungjukfrm" method="post">
			<!-- 사용자에게는 필요한 값 X > hidden -->
			<input type="hidden" name="sno" value="<%=sno%>">
			<table>
			<tr>
			<th>이름</th>
			<td><input type="text" value="<%=rs.getString("uname") %>" name="uname" id="uname" maxlength="50" required="required" autofocus="autofocus"></td>
			</tr>
			<tr>
			<th>국어</th>
			<td><input type="number" value="<%=rs.getInt("kor") %>" name="kor" id="kor" size="5" min="0" max="100" placeholder="국어점수"></td>
			</tr>
			<tr>
			<th>영어</th>
			<td><input type="number" value="<%=rs.getInt("eng") %>" name="eng" id="eng" size="5" min="0" max="100" placeholder="영어점수"></td>
			</tr>
			<tr>
			<th>수학</th>
			<td><input type="number" value="<%=rs.getInt("mat") %>" name="mat" id="mat" size="5" min="0" max="100" placeholder="수학점수"></td>
			</tr>
			<tr>
			<th>주소</th>
			<td>
			<% String addr=rs.getString("addr"); %>
			<select name="addr" id="addr">
			<option value="Seoul"<%if(addr.equals("Seoul")) {out.print("selected");} %>>서울</option>
			<option value="Jeju"<%if(addr.equals("Jeju")) {out.print("selected");} %>>제주</option>
			<option value="Suwon"<%if(addr.equals("Suwon")) {out.print("selected");} %>>수원</option>
			<option value="Busan"<%if(addr.equals("Busan")) {out.print("selected");} %>>부산</option>
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
	}else{
		out.println("해당 글 없음");
	}//if end

}catch(Exception e){
	out.println("성적 수정 실패"+e);
}finally{
	try{
		if(rs!=null){rs.close();}
	}catch(Exception e){}
	try{
		if(pstmt!=null){pstmt.close();}
	}catch(Exception e){}
	try{
		if(con!=null){con.close();}
	}catch(Exception e){}
}//end
%>
</body>
</html>
