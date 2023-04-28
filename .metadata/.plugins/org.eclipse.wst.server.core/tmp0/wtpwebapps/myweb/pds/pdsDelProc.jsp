<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="ssi.jsp" %>    
<%@ include file="../header.jsp" %>    
    
<!-- 본문 시작 bbsDelProc.jsp-->
<!-- 글번호(pdsno)와 비밀번호(passwd)가 일치하면 삭제 -->
<h3>* 글삭제 *</h3>
<%
    int pdsno=Integer.parseInt(request.getParameter("pdsno"));
	String passwd =request.getParameter("passwd").trim();
	
	dto.setPdsno(pdsno);
	dto.setPasswd(passwd);
	
	int cnt=dao.delete(pdsno, passwd, "test");
    if(cnt==0){
        out.println("<p>비밀번호가 일치하지 않습니다</p>");
        out.println("<p><a href='javascript:history.back()'>[다시시도]</a></p>");
    }else{
        out.println("<script>");
        out.println("    alert('게시글이 삭제되었습니다');");
        out.println("    location.href='bbsList.jsp';");//목록페이지 이동
        out.println("</script>");
    }//if end
%>
<!-- 본문 끝 -->

<%@ include file="../footer.jsp" %>
