<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/layout.css">
</head>
<body>
<div>
<h3>아이디 중복 확인</h3>
<form action="idCheckProc.jsp">
아이디 : <input type="text" name="id" id="id" maxlength="10" autofocus="autofocus">
<input type="submit" value="중복확인">
</form>
</div>
<script>
function blankCheck() {
	let id=document.getElementById("id").value;
	id=id.trim();
	if(id.length<5){
		alert("아이디는 5 ~ 10글자 이내로 입력해 주세요.");
		return false;
	}//if
	return true;
}
</script>
</body>
</html>