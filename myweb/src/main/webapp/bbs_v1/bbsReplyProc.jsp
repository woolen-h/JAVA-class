<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="ssi.jsp" %>
    <%@ include file="../header.jsp" %>
        <!-- 본문 시작 bbsReplyProc.jsp -->
          <% 
          	int bbsno=Integer.parseInt(request.getParameter("bbsno"));
          	String wname=request.getParameter("wname").trim();
          	String subject=request.getParameter("subject").trim();
          	String content=request.getParameter("content").trim();
          	String passwd=request.getParameter("passwd").trim();
          	String ip=request.getRemoteAddr();
          	
          	dto.setBbsno(bbsno);
          	dto.setWname(wname);
          	dto.setSubject(subject);
          	dto.setContent(content);
          	dto.setPasswd(passwd);
          	dto.setIp(ip);
          	
          	int cnt=dao.reply(dto);
          	if(cnt==0){
          		out.println("<p>답글 업로드에 실패하였습니다.</p>");
          		out.println("<p><a href='javascript:history.back()'>[다시시도]</a></p>");
          	}else{
          		out.println("<script>");
          		out.println("alert('답글 업로드에 성공하였습니다.');");
          		out.println("location.href='bbsList.jsp';");
          		out.println("</script>");
          	}
          %>
        <!-- 본문 끝 -->
    <%@ include file="../footer.jsp" %>