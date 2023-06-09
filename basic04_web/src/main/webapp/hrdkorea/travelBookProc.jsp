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
<title>travelBookProc.jsp</title>
</head>
<body>
<section>
<h3>예약등록</h3>

<%
request.setCharacterEncoding("UTF-8");

Connection con=null;
PreparedStatement pstmt=null;
ResultSet rs=null;

String rno=			request.getParameter("rno");
if (rno!=null){
	rno=rno.trim();
} 
String tcode=		request.getParameter("tcode");
String rjumin1=		request.getParameter("rjumin1");
if (rjumin1!=null){
	rjumin1=rjumin1.trim();
} 
String rjumin2=		request.getParameter("rjumin2");
if (rjumin2!=null){
	rjumin2=rjumin2.trim();
} 
String rjumin=		rjumin1+rjumin2;
String rname=		request.getParameter("rname");
if (rname!=null){
	rname=rname.trim();
} 
String rphone1=		request.getParameter("rphone1");
if (rphone1!=null){
	rphone1=rphone1.trim();
} 
String rphone2=		request.getParameter("rphone2");
if (rphone2!=null){
	rphone2=rphone2.trim();
}
String rphone3=		request.getParameter("rphone3");
if (rphone3!=null){
	rphone3=rphone3.trim();
} 
String remail=		request.getParameter("remail");
if (remail!=null){
	remail=remail.trim();
} 
String rstat=		request.getParameter("rstat");
if (rstat != null) {
    rstat = rstat.trim();
} 

try{
    String url     ="jdbc:oracle:thin:@localhost:1522:xe";
    String user    ="c##w";
    String password="1234";
    String driver  ="oracle.jdbc.driver.OracleDriver";          
    Class.forName(driver);                      
    con=DriverManager.getConnection(url, user, password);          
//    out.println("오라클 DB 서버 연결 성공");    
    
    StringBuilder sql=new StringBuilder();
    sql.append(" insert into tbl_reserve_01(rno, rjumin, rname, rphone1, rphone2, rphone3, remail, rstat, tcode) ");
    sql.append(" values (?, ?, ?, ?, ?, ?, ?, ?, ?) ");
    
    pstmt=con.prepareStatement(sql.toString());
    pstmt.setString(1, rno);
    pstmt.setString(2, rjumin);
    pstmt.setString(3, rname);
    pstmt.setString(4, rphone1);
    pstmt.setString(5, rphone2);
    pstmt.setString(6, rphone3);
    pstmt.setString(7, remail);
    pstmt.setString(8, rstat);
    pstmt.setString(9, tcode);
    
    int result = pstmt.executeUpdate();
    if(result > 0){
        out.print("등록 성공!");
    }
    rs = pstmt.executeQuery("SELECT * FROM tbl_reserve_01");
} catch(Exception e) {
    e.printStackTrace();
} finally {
    try {
        if(rs!=null) rs.close();
        if(pstmt!=null) pstmt.close();
        if(con!=null) con.close();
    } catch(Exception e) {
        e.printStackTrace();
    }
}
%>
</section>
</body>
</html>