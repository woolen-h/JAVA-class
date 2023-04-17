<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
    <%@ include file="ssi.jsp" %>
    <jsp:include page="ssi.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sungjukDel.jsp</title>
</head>
<body>
<h3>성적 삭제</h3>
<p>
<a href="sungjukForm.jsp">[성적쓰기]</a>
<a href="sungjukList.jsp">[성적목록]</a>
</p>
<%
	int sno=Integer.parseInt(request.getParameter("sno"));

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
		sql.append("DELETE FROM sungjuk ");
		sql.append("WHERE sno=? ");
		
		pstmt=con.prepareStatement(sql.toString());
		pstmt.setInt(1, sno);
		
		int cnt=pstmt.executeUpdate();
		if(cnt==0){
			out.println("<p>성적 삭제 실패했습니다.</p>");
			out.println("<p><a href='javascript:history.back()'>[다시 시도]</a></p>");
		}else{
			out.println("<script>");
			out.println("alert('성적이 삭제되었습니다.');");
			out.println("location.href='sungjukList.jsp';");
			out.println("</script>");
		}//if end
		
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
