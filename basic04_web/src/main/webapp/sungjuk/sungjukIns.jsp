<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%@page import="java.sql.PreparedStatement"%>
	<%@page import="java.sql.Connection"%>
	<%@page import="java.sql.DriverManager"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sungjukIns.jsp</title>
</head>
<body>
<h3>성적 결과</h3>
<%
request.setCharacterEncoding("UTF-8");
String uname = request.getParameter("uname").trim();
int kor = Integer.parseInt(request.getParameter("kor").trim());
int eng = Integer.parseInt(request.getParameter("eng").trim());
int mat = Integer.parseInt(request.getParameter("mat").trim());
String addr = request.getParameter("addr");
int aver = (kor+eng+mat)/3;
//out.println("요청IP : "+request.getRemoteAddr());
Connection con=null;
PreparedStatement pstmt=null;
try{
	String url     ="jdbc:oracle:thin:@localhost:1522:xe";
	String user    ="c##w";
	String password="1234";
	String driver  ="oracle.jdbc.driver.OracleDriver";			
	Class.forName(driver);						
	con=DriverManager.getConnection(url, user, password);			
	//out.println("오라클 DB 서버 연결 성공");
	
	StringBuilder sql=new StringBuilder();
	sql.append("INSERT INTO sungjuk(sno, uname, kor, eng, mat, aver, addr, wdate)");
	sql.append("VALUES(sungjuk_seq.nextval, ?, ?, ?, ?, ?, ?, sysdate)");
	pstmt=con.prepareStatement(sql.toString());
	pstmt.setString(1, uname);
	pstmt.setInt(2, kor);
	pstmt.setInt(3, eng);
	pstmt.setInt(4, mat);
	pstmt.setInt(5, aver);
	pstmt.setString(6, addr);
	
	int cnt=pstmt.executeUpdate();
	if(cnt==0){
		out.println("<p>성적 입력이 실패했습니다.</p>");
		out.println("<p><a href='javascript:history.back()'>[다시 시도]</a></p>");
	}else{
		out.println("<script>");
		out.println("alert('성적이 입력되었습니다.');");
		out.println("location.href='sungjukList.jsp';");
		out.println("</script>");
	}
}catch(Exception e){
	out.println("오라클 DB 연결 실패"+e);
}finally{
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