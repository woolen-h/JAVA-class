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