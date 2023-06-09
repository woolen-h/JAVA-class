<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>session 내장 객체</h3>
<%
// 세션 내장 객체 아이디
out.print("세션 임시 아이디 : ");
out.print(session.getId());
out.print("<hr>");

//세션 변수
session.setAttribute("s_id", "itwill");
session.setAttribute("s_pw", "12341234");

//세션 변수 값 가져오기
Object obj = session.getAttribute("s_id");
String s_id=(String)obj;
String s_pw=(String)session.getAttribute("s_pw");

out.print("세션 변수 s_id : "+s_id+"<hr>");
out.print("세션 변수 s_pw : "+s_pw+"<hr>");

//세션 변수 강제 제거
session.removeAttribute("s_id");
session.removeAttribute("s_pw");

out.print("세션 변수 삭제 후<hr>");
out.print("세션 변수 s_id : "+session.getAttribute("s_id")+"<hr>");
out.print("세션 변수 s_pw : "+session.getAttribute("s_pw")+"<hr>");

//세션 영역 모든 값 삭제
session.invalidate();

//=================================================================
//세션 시간
out.print("현재 세션 유지 시간 : ");
out.print(session.getMaxInactiveInterval());
out.print("초(30분)<hr>");

session.setMaxInactiveInterval(60*10); //10분

out.print("변경된 세션 유지 시간 : ");
out.print(session.getMaxInactiveInterval());
out.print("초(10분)<hr>");
%>

</body>
</html>

