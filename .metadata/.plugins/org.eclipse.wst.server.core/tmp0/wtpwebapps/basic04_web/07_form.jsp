<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>07_form.jsp</title>
<script>
function validate(){
	//이름 5~20글자 이내에서 입력
	let uname=document.getElementById("uname").value;
	uname=uname.trim();
	if(uname.length<5 || uname.length>20){
		alert("이름 5~20글자 이내에서 입력해주세요");
		return false;
	}
	return true;
}
</script>
</head>
<body>
<h3>성적 입력</h3>
<form name="sungjukfrm" id="sungjukfrm" method="post" action="07_ok.jsp" onsubmit="return validate()">
이름 : <input type="text" name="uname" id="uname" maxlength="20" placeholder="이름" required="required">
<hr>
국어 : <input type="number" name="kor" id="kor" size="5" min="0" max="100">
<hr>
영어 : <input type="number" name="eng" id="eng" size="5" min="0" max="100">
<hr>
수학 : <input type="number" name="mat" id="mat" size="5" min="0" max="100">
<hr>
<input type="submit" value="전송">
<input type="reset" value="취소">
 <!--
 method=get 
 - 생략시 기본값
 - 사용자 입력요청 정보 노출
 - 한글 안 깨짐
 method=post(tomcat9 이하)한글깨짐 현상
 한글 인코딩
 - 
  -->
</form>
</body>
</html>