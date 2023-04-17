select addr, uname, kor, eng, mat
from sungjuk
where addr = 'Seoul';

select avg(kor), avg(eng), avg(mat)
from sungjuk
where addr = 'Seoul';

select 	round(avg(kor),2),
		round(avg(eng),2),
		round(avg(mat),2)
		from sungjuk
		where addr = 'Seoul';
		
		-- 문제 이름에 '나' 문자 있는 행을 조회하시오
		select * from sungjuk
		where uname like '%나%'
		order by sno desc;
		
		-- 학번 g1001이 수강신청한 과목을 과목코드별 조회
		select SU.hakno, SU.gcode, GW.gname
		from tb_sugang SU inner join tb_gwamok GW
		on SU.gcode=GW.gcode;
		
		select SU.hakno, SU.gcode, GW.gname
		from tb_sugang SU inner join tb_gwamok GW
		on SU.gcode=GW.gcode
		where SU.hakno='g1001'
		order by SU.gcode;