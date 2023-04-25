--테이블 생성
CREATE TABLE tb_pds (
   pdsno      NUMBER         NOT NULL
  ,wname      VARCHAR2(100)  NOT NULL
  ,subject    VARCHAR2(250)  NOT NULL
  ,regdate    DATE           NOT NULL
  ,passwd     VARCHAR2(15)   NOT NULL
  ,readcnt    NUMBER         DEFAULT 0
  ,filename   VARCHAR2(250)  NOT NULL   --파일명
  ,filesize   NUMBER         DEFAULT 0  --파일크기
  ,PRIMARY KEY(pdsno)
);
--시퀀스 생성
create sequence pds_seq;

--행 추가
--pdsno : 시퀀스 일련번호
--wname, subject, passwd : 사용자 입력
--regdate : 오늘 날짜
--filename, filesize

commit;