<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="ssi.jsp" %>
    <%@ include file="../header.jsp" %> 
        <!-- 본문 시작 bbsList.jsp -->
          <h3>글 목록</h3>
          <p><a href="bbsForm.jsp">[글쓰기]</a></p>
          
<table class="tb_li" border="1">
<tr>
<th>작성자</th>
<th>제목</th>
<th>조회수</th>
<th>작성일</th>
</tr>
<%
ArrayList<BbsDTO> list=dao.list2(col, word);  
if(list==null){
	out.println("<tr>");
	out.println("<td colspan='5'>글 없음</td>");
	out.println("</tr>");
}else{
	String today=Utility.getDate();
	
	for(int i=0; i<list.size(); i++){
		dto=list.get(i);
%>
<tr>
	<td>
	<%=dto.getWname() %>
	</td>
	<td>
	<%
	// 답변 이미지 출력
	for(int n=1; n<=dto.getIndent(); n++){
		out.println("<img src='../images/reply.gif'>");
	}//for end
	%>
	<a href="bbsRead.jsp?bbsno=<%=dto.getBbsno() %>&col=<%=col%>&word=<%=word%>"><%=dto.getSubject() %></a>
	<%
	// 오늘 작성한 글 제목 뒤 new 출력
	String regdt=dto.getRegdt().substring(0,10);
	if(regdt.equals(today)){ //작성일이 오늘과 동일
		out.println("<img src='../images/new.gif'>");
	}//if
	if(dto.getReadcnt()>=10){
		out.println("<img src='../images/hot.gif'>");
	}//if
	%>
	</td>
	<td><%=dto.getReadcnt() %></td>
	<td><%=dto.getRegdt().substring(0,10) %></td>
</tr>
<%
	}//for end
	int totalRecord=dao.count2(col, word);
	out.println("<tr>");
	out.println("<td>");
	out.println("글 작성 수 : "+totalRecord+"건");
	out.println("</td>");
	out.println("</tr>");
	%>
	<!-- 검색 시작 -->
	<tr>
	<td colspan="4" style='text-align: center; height: 50px;'>
	<form action="bbsList.jsp" onsubmit="return searchCheck()">
		<select name=col>
		<option value="subject_content">제목 + 내용</option>
		<option value="subject">제목</option>
		<option value="content">내용</option>
		<option value="wname">작성자</option>
		</select>
		<input type="text" name="word" id="word">
		<input type="submit" value="검색">
	</form>
	</td>
	</tr>
	<!-- 검색 끝 -->
	<%
}
%>
</table>
        <!-- 본문 끝 -->
    <%@ include file="../footer.jsp" %>