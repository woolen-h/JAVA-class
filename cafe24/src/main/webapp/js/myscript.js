/**
 * myscript.js 
 */
function bbsCheck(){
    //게시판 유효성 검사
    //작성자 2글자 이상
    let wname=document.getElementById("wname").value;
    wname=wname.trim();
    if(wname.length<2){
        alert("이름은 두 글자 이상이어야 합니다.");
        document.getElementById("wname").focus();
        return false;
    }
    //제목 2글자 이상
    let subject=document.getElementById("subject").value;
    subject=subject.trim();
    if(subject.length<2){
        alert("제목은 두 글자 이상이어야 합니다.");
        document.getElementById("subject").focus();
        return false;
    }
    //내용 2글자 이상
    let content=document.getElementById("content").value;
    content=content.trim();
    if(content.length<2){
        alert("내용은 두 글자 이상이어야 합니다.");
        document.getElementById("content").focus();
        return false;
    }
    //비밀번호 숫자만
    let passwd=document.getElementById("passwd").value;
    passwd=passwd.trim();
    if(passwd.length<4 || isNaN(passwd)){
        alert("비밀번호는 네 글자 이상 숫자로 입력해주세요.");
        document.getElementById("passwd").focus();
        return false;
    }

    return true;
}//bbsCheck

function searchCheck(){
	let word=document.getElementById("word").value;
	word=word.trim();
	if(word.length==0){
		alert("검색어를 입력해주세요.");
		return false;
	}// if end
	return true;
}//searchCheck()

function loginCheck(){
	let id=document.getElementById("id").value;
	id=id.trim();
	if(id.length<5 || id.length>10){
		alert("아이디는 5 ~ 10글자 이내입니다.");
		return false;
	}//if end
	let passwd=document.getElementById("passwd").value;
	passwd=passwd.trim();
	if(passwd.length<5 || passwd.length>10){
		alert("비밀번호는 5 ~ 10글자 이내입니다.");
		return false;
	}//if end
	return true;
}//loginCheck()

function idCheck(){
	//->부모창과 자식창이 한몸으로 구성되어 있음
	//->참조 https://www.w3schools.com/bootstrap/bootstrap_modal.asp
	//->부모창과 자식창이 별개로 구성되어 있음
	//->모바일에 기반을 둔 frontend단에서는 사용하지 말것!!
	//->참조 https://www.w3schools.com/jsref/met_win_open.asp
	window.open("idCheckForm.jsp", "idwin", "width=400, height=350");
}

function memberCheck(){
	//1)아이디 5~10글자 인지?
	let id=document.getElementById("id").value;
	id=id.trim();
	if(id.length<5 || id.length>10){
		alert("아이디는 5 ~ 10글자 이내입니다.");
		return false;
	}//if end
    //2)비밀번호 5~10글자 인지?
	let passwd=document.getElementById("passwd").value;
	passwd=passwd.trim();
	if(passwd.length<5 || passwd.length>10){
		alert("비밀번호는 5 ~ 10글자 이내입니다.");
		return false;
	}//if end
    //3)비밀번호와 비밀번호확인이 서로 일치하는지?
	let repasswd=document.getElementById("repasswd").value;
	repasswd=repasswd.trim();
	if(repasswd!=passwd){
		alert("비밀번호가 일치하지 않습니다.");
		return false;
	}//if
    //4)이름 두글자 이상 인지?
	let mname=document.getElementById("mname").value;
	mname=mname.trim();
	if(mname.length<4){
		alert("이름은 두 글자 이상 입력하세요.")
		return false;
	}
    //5)이메일 5글자 인지?
	let email=document.getElementById("email").value;
	email=email.trim();
	if(email.length<5){
		alert("이메일은 5글자 이상 입력해 주세요.");
		return false;
	}//if
    //6)직업을 선택했는지?
    let job=document.getElementById("job").value;
	job=job.trim();
	if(job.value()==0){
		alert("직업을 선택해주세요.");
		return false;
	}//if
    return true;
}

function emailCheck() { 
	let email=document.getElementById("email").value;
	email=email.trim();
	if(email.length<5){
		alert("이메일은 5 ~ 10글자 이내로 입력해 주세요.");
		return false;
	}//if
	if(email.value()==""){
		alert("이메일을 입력해 주세요.");
		return false;
	}//if
	return true;
          	}
          	
function findIDCheck(){
	let mname=document.getElementById("mname").value;
	mname=mname.trim();
	if(mname.length<=1){
		alert("이름은 2글자 이상 입력해 주세요.");
		document.getElementById("mname").focus();
		return false;
	}//if
	let email=document.getElementById("email").value;
	email=email.trim();
	if(email.length<5){
		alert("이메일은 5글자 이상 입력해 주세요.");
		document.getElementById("email").focus();
		return false;
	}//if
return true;
}

function pdsCheck(){
    //포토갤러리 유효성 검사
    //이름
    let wname=document.getElementById("wname").value;
    wname=wname.trim();
    if(wname.length<2){
        alert("이름은 두 글자 이상이어야 합니다.");
        document.getElementById("wname").focus();
        return false;
    }
    //제목
    let subject=document.getElementById("subject").value;
    subject=subject.trim();
    if(subject.length<2){
        alert("제목은 두 글자 이상이어야 합니다.");
        document.getElementById("subject").focus();
        return false;
    }
    //비밀번호
    let passwd=document.getElementById("passwd").value;
    passwd=passwd.trim();
    if(passwd.length<4 || isNaN(passwd)){
        alert("비밀번호는 네 글자 이상 숫자로 입력해주세요.");
        document.getElementById("passwd").focus();
        return false;
    }
    //첨부파일 png, jpg, gif
    let filename=document.getElementById("filename").value;
    filename=filename.trim();
    if(filename.length==0){
        alert("첨부파일 선택하세요.");
        return false;
	}else{
		let dot=filename.lastIndexof(".");
		let ext=filename.substr(dot+1);
		ext=ext.toLowerCase();
		if(ext=="png" ||ext=="jpg"||ext=="gif"){
			return true;
		}else{
			alert('이미지 파일만 업로드 가능합니다.');
			return false;
		}
	}//if
    }//pdsCheck()
    
    
    function pwCheck2(){
		let passwd=document.getElementById("passwd").value;
    	passwd=passwd.trim();
    	if(passwd.length<4 || isNaN(passwd)){
        alert("비밀번호는 네 글자 이상 숫자로 입력해주세요.");
        document.getElementById("passwd").focus();
        return false;
    	}//if
		let message="첨부파일도 삭제됩니다\n 계속 진행할까요?"
		if(confirm(message)){
			return true;
		}else{
			return false;
		}//if
	}//pwCheck2