<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>02_scopeTest</title>
</head>
<body>
<h3>웹페이지의 SCOPE(유효범위)</h3>

<%

pageContext.setAttribute("one", 100);
request.setAttribute("two", 200);
session.setAttribute("three", 300);
application.setAttribute("uid", "ITWILL");

%>

<!-- <a href="02_scopeResult.jsp">[SCOPE 결과 페이지 이동]</a>

<form action="02_scopeResult.jsp">
<input type="submit" value="[SCOPE 결과 페이지 이동]">
</form> -->

<!-- <script>
alert("[SCOPE 결과 페이지 이동]");
location.href="02_scopeResult.jsp";
</script> -->

<%-- <jsp:forward page="02_scopeResult.jsp"></jsp:forward> --%>
<%


/* response.sendRedirect("02_scopeResult.jsp"); */

String view="02_scopeResult.jsp";
RequestDispatcher rd=request.getRequestDispatcher(view);
rd.forward(request, response);
%>

</body>
</html>