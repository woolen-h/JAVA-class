<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.util.Enumeration"%>

<%@page import="java.io.File"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="ssi.jsp" %>
    <%@ include file="../header.jsp" %>
        <!-- 본문 시작 pdsList.jsp -->
          <h3>사진 업로드 결과</h3>
          <%
          try{
        	  String saveDirectory=application.getRealPath("/storage");
        	  int maxPostSize=1024*1024*10;
        	  String encoding="UTF-8";
        	  MultipartRequest mr = new MultipartRequest(request, saveDirectory, maxPostSize, encoding, new DefaultFileRenamePolicy());
        	  
        	  String fileName="";	//파일명
        	  long fileSize=0;		//파일크기
        	  File file=null;		//실제 파일
        	  String item="";		//name="filename"
        	  
        	  Enumeration files = mr.getFileNames();
        	  while(files.hasMoreElements()){
        		  item=(String)files.nextElement();
        		  fileName=mr.getFilesystemName(item);
        		  if(fileName!=null){
        			  file=mr.getFile(item);
        			  if(file.exists()){
        				  fileSize=file.length();
        			  }
        		  }//if
       
        		  String wname=mr.getParameter("wname").trim();
        		  String subject=mr.getParameter("subject").trim();
        		  String passwd=mr.getParameter("passwd").trim();
        		  
        		  dto.setWname(wname);
        		  dto.setSubject(subject);
        		  dto.setPasswd(passwd);
        		  dto.setFilename(fileName);
        		  dto.setFilesize(fileSize);
        		  
        		  int cnt=dao.create(dto);
        		  if(cnt==0){
        			  out.println("<p>사진 올리기 실패</p>");
                	  out.println("<a href='javascript:history.back();'>[다시시도]</a>");
        		  }else{
        			  out.println("<script>");
                	  out.println("alert('사진이 추가되었습니다.');");
        			  out.println("location.href='pdsList.jsp';");
                	  out.println("</script>");
        		  }
        	  }
          }catch(Exception e){
        	  out.print(e);
        	  out.print("<p>사진 올리기 실패</p>");
        	  out.print("<a href='javascript:history.back();'>[다시시도]</a>");
          }//end
          
          %>
        <!-- 본문 끝 -->
    <%@ include file="../footer.jsp" %>