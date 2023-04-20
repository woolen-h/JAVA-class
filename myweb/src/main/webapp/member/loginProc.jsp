<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ include file="../header.jsp" %>
    <%@ include file="ssi.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginProc</title>
</head>
<body>
<h3>로   그   인   결   과</h3>
<%
out.println("<hr>");
String id=request.getParameter("id").trim();
String passwd=request.getParameter("passwd").trim();

dto.setId(id);
dto.setPasswd(passwd);

String mlevel=dao.loginProc(dto);
if(mlevel==null){
	out.println("<p>아이디/비밀번호 다시 한 번 확인해주세요</p>");
	out.println("<p><a href='javascript:history.back()'>[다시 시도]</a></p>");
}else{
	//out.print("로그인 성공<hr>");
	//out.print("회원등급 : "+mlevel);
	session.setAttribute("s_id", id);
	session.setAttribute("s_passwd", passwd);
	session.setAttribute("s_mlevel", mlevel);
	//->웹서버가 사용자PC에 저장하는 텍스트 파일로 된 정보
    //->각 브라우저의 쿠키삭제의 영향을 받는다
    //->보안에 취약하다
    //->예)아이디저장, 오늘창그만보기, 클락한상품목록
	//->예)오늘창그만보기는 자바스크립트 쿠키. 참조)https://www.w3schools.com/js/js_cookies.asp
	//쿠키 시작
		String c_id=Utility.checkNull(request.getParameter("c_id"));
		Cookie cookie=null;
		if(c_id.equals("SAVE")){ //ID 저장 체크
			//쿠키 변수 선언 new Cookie("변수명", 값)
			cookie=new Cookie("c_id", id);
			//쿠키 생존 기간
			cookie.setMaxAge(60*60*24*30);
		} else{ //ID 저장 체크 X
			cookie=new Cookie("c_id", "");
			cookie.setMaxAge(0);
		}//if end
		//요청 사용자 PC 쿠키 값 저장
		response.addCookie(cookie);
	//쿠키 끝
	//첫 페이지 이동
	String root=Utility.getRoot();
	response.sendRedirect(root+"/index.jsp");
	
}


%> 
</body>
<%@ include file="../footer.jsp" %>
</html>