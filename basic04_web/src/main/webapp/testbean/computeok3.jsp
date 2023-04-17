<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="net.testbean.*" %>

<jsp:useBean id="comp" class="net.testbean.Compute" scope="page"></jsp:useBean>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>computeok1</title>
</head>
<body>
<h3>계산 결과</h3>
<h4>3)java bean</h4>
<!-- 
- Java Bean(id)가 제대로 생성 안될 수도 있음.
	    해당프로젝트 우클릭 Refresh
                        Validate
                        Project -> Clean하고 테스트할것!!
                         -->
<%
int num1=Integer.parseInt(request.getParameter("num1").trim());
int num2=Integer.parseInt(request.getParameter("num2").trim());

out.print(num1+"+"+num2+"="+comp.add(num1,num2));
out.print("<hr>");
out.print(num1+"-"+num2+"="+comp.sub(num1,num2));
out.print("<hr>");
out.print(num1+"*"+num2+"="+comp.mul(num1,num2));
out.print("<hr>");
out.print(num1+"/"+num2+"="+comp.div(num1,num2));
out.print("<hr>");
out.print(num1+"%"+num2+"="+comp.mod(num1,num2));
out.print("<hr>");
%>
</body>
</html>