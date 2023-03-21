package oop0320;

import java.security.PublicKey;

class BbsDTO {
private int bbsno;
private String writer;
private String subject;

public BbsDTO() {} // 생성자함수

public int getBbsno() {
	return this.bbsno;
}
public void setBbsno(int bbsno) {
	this.bbsno=bbsno;
}

public String getWrite() {
	return this.writer;
}
public void setWrite(String writer) {
	this.writer=writer;
}

public String getSubject() {
	return this.subject;
}
public void setSubject(String subject) {
	this.subject=subject;
}}