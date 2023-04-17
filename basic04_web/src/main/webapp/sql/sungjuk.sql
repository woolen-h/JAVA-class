set linesize 1000;
col uname for a10;
col addr for a10;

drop table sungjuk;
create table sungjuk(
     sno   int         not null --일련번호
    ,uname varchar(50) not null --이름
    ,kor   int         not null --국어
    ,eng   int         not null --영어
,mat   int         not null --수학
    ,aver  int         null     --평균
    ,addr  varchar(50)          --주소
    ,wdate date                 --등록일(년월일시분초)
    ,primary key(sno)
);
drop sequence sungjuk_seq;
create sequence sungjuk_seq;
commit;
insert into sungjuk(sno, uname, kor, eng, mat, aver, addr, wdate)
values(sungjuk_seq.nextval, ?, ?, ?, ?, ?, ?, sysdate)

select *
from sungjuk
order by wdate desc;

select *
from sungjuk
where sno=?

delete
from sungjuk
where sno=?

--select문 > sungjukUpdate.jsp
--sungjukUpdateProc.jsp >
update sungjuk
set uname=?, kor=?, eng=?, mat=?, aver=?, addr=?, wdate=sysdate
where sno=?