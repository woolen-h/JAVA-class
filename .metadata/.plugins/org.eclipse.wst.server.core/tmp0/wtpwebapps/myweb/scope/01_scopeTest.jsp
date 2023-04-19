<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>내장개객체 및 내부변수</h3>
<%
/*
	- JSP페이지가 서블릿에서 변환될때(.class) JSP컨테이너(Tomcat웹서버)가 자동적으로 제공
	- JSP페이지 내에서 제공하는 특수한 레퍼런스(참조) 타입의 변수
	- 객체 생성 없이 바로 사용할 수 있는 JSP의 객체

	*/
	//각 내부변수에 값 올리기
	pageContext.setAttribute("kor", 100);
	request.setAttribute("eng", 200);
	session.setAttribute("mat", 300);
	application.setAttribute("uname", "ITIWILL");
	
	//내부 변수값 가져오기
	out.print(pageContext.getAttribute("kor"));
	out.print(request.getAttribute("eng"));
	out.print(session.getAttribute("mat"));
	out.print(application.getAttribute("uname"));
	
	pageContext.getAttribute("kor");
	int kor=(int)obj;
	int eng=(int)request.getAttribute("eng");
	int mat=(int)session.getAttribute("mat");
	String uname=(String)application.getAttribute("uname");
	
	out.print("1. pageContext 영역 : " + kor + "<hr>");
	out.print("2. request 영역 : " + eng + "<hr>");
	out.print("3. session 영역 : " + mat + "<hr>");
	out.print("4. application 영역 : " + uname + "<hr>");
	
	//내부 변수 삭제
	pageContext.removeAttribute("kor");
	request.removeAttribute("eng");
	session.removeAttribute("mat");
	application.removeAttribute("uname");
	out.print("<p>SCOPE영역 변수 삭제 후</p>");
	out.print("1. pageContext 영역 : " + pageContext.getAttribute("kor") + "<hr>");
	out.print("2. request 영역 : " + request.getAttribute("eng") + "<hr>");
	out.print("3. session 영역 : " + session.getAttribute("mat") + "<hr>");
	out.print("4. application 영역 : " + application.getAttribute("uname") + "<hr>");
	
%>
</body>
</html>