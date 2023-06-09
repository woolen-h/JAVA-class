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
<title>travelList.jsp</title>
<style>
header	{background:fuchsia; color:white;}
nav		{background:olive; color:white;}
footer	{background:orange; color:white;}
</style>
<script>
function validate() {
	//유효성 검사
	//예약번호 글자갯수 8 확인
	let rno=document.getElementById("rno").value;
	rno=rno.trim();
	if(rno.length!=8){
		alert("예약번호 8글자 입력해 주세요.")
		document.getElementById("rno").focus();
		return false;
	}//if end
	//상품코드 선택 여부 확인
	let tcode=document.getElementById("tcode").value;
	tcode=tcode.trim();
	if(tcode.length==0){
		alert("상품코드 선택해 주세요.");
		return false;
	}//if end
	//주민번호 숫자형 확인
	let rjumin1=document.getElementById().value;
	rjumin1=rjumin1.trim();
	if(isNaN(rjumin1)||rjumin1.length!=6){
		alert("주민번호 앞 6글자 입력해 주세요.")
		document.getElementById("rjumin1").focus();
		return false;
	}//if end
	let rjumin2=document.getElementById("rjumin2").value;
	rjumin2=rjumin2.trim();
	if(isNaN(rjumin2)||rjumin2.length!=7){
		alert("주민번호 뒷 7글자 입력해 주세요.")
		document.getElementById("rjumin2").focus();
		return false;
	}//if end
	let rphone1=document.getElementById("rphone1").value;
	rphone1=rphone1.trim();
	if(isNaN(rphone1)||rphone1.length!=3){
		alert("전화번호 앞 3자리 입력해 주세요.")
		document.getElementById("rphone1").focus();
		return false;
	}//if end
	let rphone2=document.getElementById("rphone2").value;
	rphone2=rphone2.trim();
	if(isNaN(rphone2)||rphone2.length!=4){
		alert("전화번호 중간 4자리 입력해 주세요.")
		document.getElementById("rphone2").focus();
		return false;
	}//if end
	let rphone3=document.getElementById("rphone3").value;
	rphone3=rphone3.trim();
	if(isNaN(rphone3)||rphone3.length!=4){
		alert("전화번호 뒷 4자리 입력해 주세요.")
		document.getElementById("rphone3").focus();
		return false;
	}//if end
	let remail=document.getElementById("remail").value;
	remail=remail.trim();
	if(remail.indexof("@")==-1){
		alert("고객 이메일 다시 입력해 주세요.");
		document.getElementById("remail").focus;
		return false;
	}//if end
	return true;
}//validate
</script>
</head>
<body>
<header>여행예약 프로그램 ver2018-12</header>
<nav>
<jsp:include page="mainmenu.jsp"></jsp:include>
</nav>
<section>
<!-- 본문시작 -->
<form name="travelfrm" id="travelfrm" method="post" action="travelBookProc.jsp" onsubmit="return validate()">
<table border="1">
<tr>
<th>예약번호</th>
<td><input type="text" name="rno" id="rno" size="8" maxlength="8" required="required"></td>
</tr>
<tr>
<th>상품코드</th>
<td>
<select name="tcode" id="tcode">
<option value="">상품선택</option>
<%
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
	
	StringBuilder sql=new StringBuilder();
	sql.append(" SELECT tcode, tarea, tdate ");
	sql.append(" FROM tbl_tourcode_02 ");
	sql.append(" ORDER BY tcode ");
	
	pstmt=con.prepareStatement(sql.toString());
	rs=pstmt.executeQuery();
	if(rs.next()){
		String tname="";
		do {
		tname += "<option value='" +rs.getString("tcode")+"'>";
		tname += "["+rs.getString("tcode")+"]";
		tname += rs.getString("tarea") +" ";
		tname += rs.getString("tdate").substring(0,4)+"-";
		tname += rs.getString("tdate").substring(4,6)+"-";
		tname += rs.getString("tdate").substring(6);
		tname += " 출발";
		tname += "</option>";		
		}while(rs.next());
		
		out.print(tname);
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
</select>
</td>
</tr>
<tr>
<th>주민번호</th>
<td>
<input type="text" name="rjumin1" id="rjumin1" size="6" maxlength="6" required="required">
-
<input type="text" name="rjumin2" id="rjumin2" size="7" maxlength="7" required="required">
</td>
<tr>
<th>예약자성명</th>
<td>
<input type="text" name="rname" id="rname" size="20" maxlength="20" required="required">
</td>
</tr>
<tr>
<th>예약자전화</th>
<td>
<input type="text" name="rphone1" id="rphone1" size="3" maxlength="3" required="required">
<input type="text" name="rphone2" id="rphone2" size="4" maxlength="4" required="required">
<input type="text" name="rphone3" id="rphone3" size="4" maxlength="4" required="required">
</td>
</tr>
<tr>
<th>고객이메일</th>
<td>
<input type="text" name="remail" id="remail" size="30" maxlength="30" required="required">
</td>
</tr>
<tr>
<th>결제상태</th>
<td>
<input type="radio" name="rstat" id="rstat" value="1" checked="checked">미납
<input type="radio" name="rstat" id="rstat" value="2">완납
</td>
</tr>
<tr>
<td>
<input type="button" value="수정" onclick="Location.href='travelUpdate.jsp?rno<%=rs.getString("rno")%>'">
<input type="button" value="삭제" onclick="Location.href='travelDel.jsp?rno<%=rs.getString("rno")%>'">
</td>
</tr>
</table>
</form>
<!-- 본문끝 -->
</section>
<footer>
HRDKOREA Copyright&copy;2018 All rights reserved.
Human Resources Development Service of Korea
</footer>
</body>
</html>