<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="org.xml.sax.ext.DefaultHandler2"%>
<%@page import="javax.swing.plaf.multi.MultiPanelUI"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>파일 첨부 테스트 결과</h3>
<%
/* request.setCharacterEncoding("UTF-8");
out.print(request.getParameter("uname"));
out.print("<hr>");
out.print(request.getParameter("subject"));
out.print("<hr>");
out.print(request.getParameter("content"));
out.print("<hr>");
out.print(request.getParameter("filenm"));
out.print("<hr>");
 */
 try{
	//첨부 파일 저장
	 String saveDirectory=application.getRealPath("/storage");
	 /* out.print(saveDirectory); */
	 //I:\java202301\workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\myweb\storage	 
	 //저장 최대 용량
	 int maxPostSize=1024*1024*10;
	 
	 //한글 인코딩
	 String encoding="UTF-8";
	 MultipartRequest mr = new MultipartRequest(request, saveDirectory, maxPostSize, encoding, new DefaultFileRenamePolicy());
	 
	 out.print(mr.getParameter("uname"));
	 out.print("<hr>");
	 out.print(mr.getParameter("subject"));
	 out.print("<hr>");
	 out.print(mr.getParameter("content"));
	 out.print("<hr>");
	 
	Enumeration files=mr.getFileNames();
	
	String item=(String)files.nextElement();
	
	String ofileName=mr.getOriginalFileName(item);
	out.print("원본 파일명 : "+ofileName);
	out.print("<hr>");
	String fileName=mr.getFilesystemName(item);
	out.print("리네임 파일명 : "+fileName);
	out.print("<hr>");
	
	File file=mr.getFile(item);
	if(file.exists()){
		out.print("파일명 : " + file.getName());
		out.print("<hr>");
		out.print("파일크기 : " + file.length() + "byte");
		out.print("<hr>");
	}else{
		out.print("해당 파일이 존재하지 않음!");
	}//if
	 
 }catch(Exception e){
	 out.print(e);
	 out.print("<p>파일 업로드 실패</p>");
	 out.print("<a href='javascript:history.back();'>[다시 시도]</a>");
 }//try
%>
</body>
</html>