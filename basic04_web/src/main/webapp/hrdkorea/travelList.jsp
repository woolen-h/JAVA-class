<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>travelList.jsp</title>
<style>
header	{background:fuchsia; color:white;}
nav		{background:olive; color:white;}
footer	{background:orange; color:white;}
table {
width: 100%;
border: 1px solid black;
}
</style>
</head>
<body>
<header>여행예약 프로그램 ver2018-12</header>
<nav>
<jsp:include page="mainmenu.jsp"></jsp:include>
</nav>
<section>
<!-- 본문시작 -->
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
    out.println("오라클 DB 서버 연결 성공");    
    
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
        out.print(rname);
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
<h3>여행내역 조회</h3>
<table border="1">
<tr>
<th>예약번호</th>
<th>주민번호</th>
<th>이름</th>
<th>전화번호</th>
<th>이메일</th>
<th>상태</th>
</tr>
<%
    if (rs != null) {
        while (rs.next()) {
%>
            <tr>
                <td><%=rs.getString("예약번호")%></td>
                <td><%=rs.getString("주민번호")%></td>
                <td><%=rs.getString("이름")%></td>
                <td><%=rs.getString("전화번호")%></td>
                <td><%=rs.getString("이메일")%></td>
                <td><%=rs.getString("상태")%></td>
            </tr>
<%
        }
    }
%>
</table>
<!-- 본문끝 -->
</section>
<footer>
HRDKOREA Copyright&copy;2018 All rights reserved.
Human Resources Development Service of Korea
</footer>
</body>
</html>