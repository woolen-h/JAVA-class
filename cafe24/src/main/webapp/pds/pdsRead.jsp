<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="ssi.jsp" %>
    <%@ include file="../header.jsp" %>
        <!-- 본문 시작 pdsList.jsp -->
          <h3>포   토   갤   러   리</h3>
          <h3>상     세     보     기</h3>
          <%
          int pdsno=Integer.parseInt(request.getParameter("pdsno"));
          dto=dao.read(pdsno);
          if(dto==null){
        	  out.println("해당 글 없음");
          }else{
        	  dao.incrementCnt(pdsno);
        	  %>
        	  <table class="table">
        	  <tr>
        	  <th>글제목</th>
        	  <td><%=dto.getSubject()%></td>
        	  </tr>
        	  <tr>
        	  <th>사진</th>
        	  <td><img src='../storage/<%=dto.getFilename()%>'></td>
        	  </tr>
        	  <tr>
        	  <th>파일크기</th>
        	  <td><%=dto.getFilesize()%></td>
        	  </tr>
        	  <tr>
        	  <th>작성자</th>
        	  <td><%=dto.getWname()%></td>
        	  </tr>
        	  <tr>
        	  <th>작성일</th>
        	  <td><%=dto.getRegdate()%></td>
        	  </tr>
        	  <tr>
        	  <th>조회수</th>
        	  <td><%=dto.getReadcnt()%></td>
        	  </tr>
        	  </table>
        	  <hr>
        	  <input type="button" value="삭제" class="btn btn-danger" onclick="location.href='pdsDel.jsp?pdsno=<%=pdsno%>'">
        	  <%
          }//if
          %>
        <!-- 본문 끝 -->
    <%@ include file="../footer.jsp" %>