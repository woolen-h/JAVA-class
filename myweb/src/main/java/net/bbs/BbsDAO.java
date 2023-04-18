package net.bbs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.sql.rowset.JoinRowSet;

import net.utility.DBClose;
import net.utility.DBOpen;

public class BbsDAO {//Data Access Object 데이터베이스 관련 작업

    private DBOpen dbopen=null;
    private Connection con=null;
    private PreparedStatement pstmt=null;
    private ResultSet rs=null;
    private StringBuilder sql=null;
	
	public BbsDAO() {
		dbopen=new DBOpen();
	}//end
	
	
	public int create(BbsDTO dto) {
        int cnt=0;
        try {
            con=dbopen.getConnection();//DB연결
            
            sql=new StringBuilder();
            sql.append(" INSERT INTO tb_bbs(bbsno, wname, subject, content, passwd, ip, grpno) ");
            sql.append(" VALUES (bbs_seq.nextval, ?, ?, ?, ?, ?, (SELECT NVL(MAX(bbsno), 0)+1 FROM tb_bbs)) ");
            
            pstmt=con.prepareStatement(sql.toString());
            pstmt.setString(1, dto.getWname());
            pstmt.setString(2, dto.getSubject());
            pstmt.setString(3, dto.getContent());
            pstmt.setString(4, dto.getPasswd());
            pstmt.setString(5, dto.getIp());
            
            cnt=pstmt.executeUpdate();
            
        }catch (Exception e) {
            System.out.println("추가실패:"+e);
        }finally {
            DBClose.close(con, pstmt);
        }//end
        return cnt;
	}//create() end
	
	
	public ArrayList<BbsDTO> list(){
		ArrayList<BbsDTO> list=null;
		try {
			con=dbopen.getConnection();
			
			sql=new StringBuilder();
            sql.append(" SELECT bbsno, wname, subject, readcnt, regdt, indent ");
            sql.append(" FROM tb_bbs ");
            sql.append(" ORDER BY grpno DESC, ansnum ASC ");
			
			pstmt=con.prepareStatement(sql.toString());
			rs=pstmt.executeQuery();
			if(rs.next()) {
				list=new ArrayList<>();
				do {
					BbsDTO dto=new BbsDTO(); //한줄담기
					dto.setBbsno(rs.getInt("bbsno"));
                    dto.setWname(rs.getString("wname"));
                    dto.setSubject(rs.getString("subject"));
                    dto.setReadcnt(rs.getInt("readcnt"));
                    dto.setRegdt(rs.getString("regdt"));
                    dto.setIndent(rs.getInt("indent"));
                    list.add(dto);//list에 모으기
				}while(rs.next());
			}//if end			
			
        }catch (Exception e) {
            System.out.println("전체목록실패:"+e);
        }finally {
            DBClose.close(con, pstmt, rs);
        }//end
		return list;
	}//list() end
	
	
    public int count() {
        int cnt=0;
        try {
            con=dbopen.getConnection();
            
            sql=new StringBuilder();
            sql.append(" SELECT COUNT(*) as cnt ");
            sql.append(" FROM tb_bbs ");
            
            pstmt=con.prepareStatement(sql.toString());
            rs=pstmt.executeQuery();
            if(rs.next()) {
                cnt=rs.getInt("cnt");
            }//if end
            
        }catch (Exception e) {
            System.out.println("글갯수실패:"+e);
        }finally {
            DBClose.close(con, pstmt, rs);
        }//end
        return cnt;
    }//count() end
	
	
	public BbsDTO read(int bbsno) {
		BbsDTO dto=null;
		try {
			con=dbopen.getConnection();
			
			sql=new StringBuilder();
            sql.append(" SELECT bbsno, wname, subject, content, readcnt, regdt, ip, grpno, indent, ansnum ");
            sql.append(" FROM tb_bbs ");
            sql.append(" WHERE bbsno=? ");
			
            pstmt=con.prepareStatement(sql.toString());
            pstmt.setInt(1, bbsno);
            
            rs=pstmt.executeQuery();
            if(rs.next()) {
            	dto=new BbsDTO();
                dto.setBbsno(rs.getInt("bbsno"));
                dto.setWname(rs.getString("wname"));
                dto.setSubject(rs.getString("subject"));
                dto.setContent (rs.getString("content"));
                dto.setReadcnt(rs.getInt("readcnt"));
                dto.setRegdt(rs.getString("regdt"));
                dto.setIp(rs.getString("ip"));
                dto.setGrpno(rs.getInt("grpno"));
                dto.setIndent(rs.getInt("indent"));
                dto.setAnsnum(rs.getInt("ansnum"));
            }//if end
            
        }catch (Exception e) {
            System.out.println("상세보기실패:"+e);
        }finally {
            DBClose.close(con, pstmt, rs);
        }//end
		return dto;		
	}//read() end
	
	
	public void incrementCnt(int bbsno) {
        try {
            con=dbopen.getConnection();
            
            sql=new StringBuilder();
            sql.append(" UPDATE tb_bbs ");
            sql.append(" SET readcnt=readcnt+1 ");
            sql.append(" WHERE bbsno=? ");
            
            pstmt=con.prepareStatement(sql.toString());
            pstmt.setInt(1, bbsno);
            pstmt.executeUpdate();
            
        }catch (Exception e) {
            System.out.println("조회수 증가 실패:"+e);
        }finally {
            DBClose.close(con, pstmt);
        }//end
	}//incrementCnt() end	
	
	
    public int delete(BbsDTO dto) {
        int cnt=0;
        try {
            
            con=dbopen.getConnection();
            sql=new StringBuilder();
            sql.append(" DELETE FROM tb_bbs ");
            sql.append(" WHERE bbsno=? AND passwd=? ");
            
            pstmt=con.prepareStatement(sql.toString());
            pstmt.setInt(1, dto.getBbsno());
            pstmt.setString(2, dto.getPasswd());
            cnt=pstmt.executeUpdate();
            
        }catch (Exception e) {
            System.out.println("삭제 실패:"+e);
        }finally {
            DBClose.close(con, pstmt);
        }//end
        return cnt;
    }//delete() end

    
    public int updateproc(BbsDTO dto) {
        int cnt=0;
        try {
            con=dbopen.getConnection();
            
            sql=new StringBuilder();
            sql.append(" UPDATE tb_bbs ");
            sql.append(" SET wname=? ");
            sql.append(" , subject=? ");
            sql.append(" , content=? ");
            sql.append(" , ip=? ");
            sql.append(" WHERE bbsno=? AND passwd=? ");
            
            pstmt=con.prepareStatement(sql.toString());
            pstmt.setString(1, dto.getWname());
            pstmt.setString(2, dto.getSubject());
            pstmt.setString(3, dto.getContent());
            pstmt.setString(4, dto.getIp());
            pstmt.setInt(5, dto.getBbsno());
            pstmt.setString(6, dto.getPasswd());
            
            cnt=pstmt.executeUpdate();
            
        }catch (Exception e) {
            System.out.println("수정 실패:"+e);
        }finally {
            DBClose.close(con, pstmt);
        }//end
        return cnt;
    }//updateproc() end
    
	
	public int reply(BbsDTO dto) {
        int cnt=0;
        try {
            con=dbopen.getConnection();//DB연결
            sql=new StringBuilder();
            
            // 부모글 정보
            	//부모글 그룹번호
            	int grpno=0;
            	
            	//부모 글 들여 쓰기
            	int indent=0;
            	
            	//부모 글 순서
            	int ansnum=0;
            	
            sql.append(" SELECT grpno, indent, ansnum ");
            sql.append(" FROM tb_bbs ");
            sql.append(" WHERE bbsno=? ");
            pstmt=con.prepareStatement(sql.toString());
            pstmt.setInt(1, dto.getBbsno());
            rs=pstmt.executeQuery();
            if (rs.next()) {
				//그룹번호 : 부모글 그룹번호
            	grpno=rs.getInt("grpno");
            	//들여쓰기 : 부모글 들여쓰기 + 1
            	indent=rs.getInt("indent")+1;
            	//글순서 : 부모글 글순서 + 1
            	ansnum=rs.getInt("ansnum")+1;            	
			}//end
            
            // 글 순서 재조정
            sql.delete(0, sql.length());
            sql.append(" UPDATE tb_bbs ");
            sql.append(" SET ansnum=ansnum+1 ");
            sql.append(" WHERE grpno=? AND ansnum>=? ");
            pstmt=con.prepareStatement(sql.toString());
            pstmt.setInt(1, grpno);
            pstmt.setInt(2, ansnum);
            pstmt.executeUpdate();
                        
            // 답변글 추가
            sql.delete(0, sql.length());
            sql.append(" INSERT INTO tb_bbs (bbsno, wname, subject, content, passwd, ip, grpno, indent, ansnum) ");
            sql.append(" VALUES (bbs_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ?) ");
            
            pstmt=con.prepareStatement(sql.toString());
            pstmt.setString(1, dto.getWname());
            pstmt.setString(2, dto.getSubject());
            pstmt.setString(3, dto.getContent());
            pstmt.setString(4, dto.getPasswd());
            pstmt.setString(5, dto.getIp());
            pstmt.setInt(6, grpno);
            pstmt.setInt(7, indent);
            pstmt.setInt(8, ansnum);
            
            cnt=pstmt.executeUpdate();
            
        }catch (Exception e) {
            System.out.println("답변 쓰기 실패:"+e);
        }finally {
            DBClose.close(con, pstmt, rs);
        }//end
        return cnt;
	}//reply() end
	
	public int count2(String col, String word) {
		int cnt=0;
		try {
			con=dbopen.getConnection();
			sql=new StringBuilder();
            sql.append(" SELECT COUNT(*) as cnt ");
            sql.append(" FROM tb_bbs ");
            
            if (word.length()>=1) {
            	String search="";
            	if(col.equals("subject_content")) {
            		search += " where subject like '%" + word +"%' ";
            		search += " or content like '%" + word +"%' ";
            	}else if (col.equals("subject")) {
            		search += " where subject like '%" + word +"%' ";
				}else if (col.equals("content")) {
					search += " where content like '%" + word +"%' ";
				}else if (col.equals("wname")) {
					search += " where wname like '%" + word +"%' ";
				}//if end
            	sql.append(search);
			}// if end
            
            pstmt=con.prepareStatement(sql.toString());
            rs=pstmt.executeQuery();
            if(rs.next()) {
                cnt=rs.getInt("cnt");
            }//if end
		} catch (Exception e) {
			System.out.println("검색 실패 : "+e);
		} finally {
			DBClose.close(con, pstmt, rs);
		}//end
		return cnt;
	}
	
	public ArrayList<BbsDTO> list2(String col, String word){
		ArrayList<BbsDTO> list=null;
		try {
			con=dbopen.getConnection();
			
			sql=new StringBuilder();
            sql.append(" SELECT bbsno, wname, subject, readcnt, regdt, indent ");
            sql.append(" FROM tb_bbs ");
            
            if (word.length()>=1) {
            	String search="";
            	if(col.equals("subject_content")) {
            		search += " where subject like '%" + word +"%' ";
            		search += " or content like '%" + word +"%' ";
            	}else if (col.equals("subject")) {
            		search += " where subject like '%" + word +"%' ";
				}else if (col.equals("content")) {
					search += " where content like '%" + word +"%' ";
				}else if (col.equals("wname")) {
					search += " where wname like '%" + word +"%' ";
				}//if end
            	sql.append(search);
			}// if end
            
            sql.append(" ORDER BY grpno DESC, ansnum ASC ");
			
			pstmt=con.prepareStatement(sql.toString());
			rs=pstmt.executeQuery();
			if(rs.next()) {
				list=new ArrayList<>();
				do {
					BbsDTO dto=new BbsDTO(); //한줄담기
					dto.setBbsno(rs.getInt("bbsno"));
                    dto.setWname(rs.getString("wname"));
                    dto.setSubject(rs.getString("subject"));
                    dto.setReadcnt(rs.getInt("readcnt"));
                    dto.setRegdt(rs.getString("regdt"));
                    dto.setIndent(rs.getInt("indent"));
                    list.add(dto);//list에 모으기
				}while(rs.next());
			}//if end			
			
        }catch (Exception e) {
            System.out.println("전체목록실패:"+e);
        }finally {
            DBClose.close(con, pstmt, rs);
        }//end
		return list;
	}//list2() end
	
	public ArrayList<BbsDTO> list3(String col, String word, int nowPage, int recordPerPage){
		ArrayList<BbsDTO> list=null;
		//페이지당 출력할 행의 갯수(10개를 기준)
        //1 페이지 : WHERE r>=1  AND r<=10;
        //2 페이지 : WHERE r>=11 AND r<=20;
        //3 페이지 : WHERE r>=21 AND r<=30;
		int startRow = ((nowPage-1) * recordPerPage) + 1 ;
        int endRow   = nowPage * recordPerPage;
        
		try {
			con=dbopen.getConnection();
			sql=new StringBuilder();
			
			word=word.trim();
			
			if (word.length()==0) {//검색어가 존재하지 않는 경우
				sql.append(" select * ");
				sql.append(" from ( ");
				sql.append(" 		select bbsno, subject, wname, readcnt, indent, regdt, rownum as r ");
				sql.append(" 		from ( ");
				sql.append("				select bbsno, subject, wname, readcnt, indent, regdt ");
				sql.append("				from tb_bbs ");
				sql.append("				order by grpno desc, ansnum asc)) ");
				sql.append(" where r>=" + startRow + " and r<=" + endRow);
			}else{//검색어가 존재하는 경우
				sql.append(" select * ");
				sql.append(" from ( ");
				sql.append(" 		select bbsno, subject, wname, readcnt, indent, regdt, rownum as r ");
				sql.append(" 		from ( ");
				sql.append("				select bbsno, subject, wname, readcnt, indent, regdt ");
				sql.append("				from tb_bbs ");
            	String search="";
            	if(col.equals("subject_content")) {
            		search += " where subject like '%" + word +"%' ";
            		search += " or content like '%" + word +"%' ";
            	}else if (col.equals("subject")) {
            		search += " where subject like '%" + word +"%' ";
				}else if (col.equals("content")) {
					search += " where content like '%" + word +"%' ";
				}else if (col.equals("wname")) {
					search += " where wname like '%" + word +"%' ";
				}//if end
            	sql.append(search);
				sql.append("				order by grpno desc, ansnum asc)) ");
				sql.append(" where r>=" + startRow + " and r<=" + endRow);
			}// if end
		
			
			pstmt=con.prepareStatement(sql.toString());
			rs=pstmt.executeQuery();
			if(rs.next()) {
				list=new ArrayList<>();
				do {
					BbsDTO dto=new BbsDTO(); //한줄담기
					dto.setBbsno(rs.getInt("bbsno"));
                    dto.setWname(rs.getString("wname"));
                    dto.setSubject(rs.getString("subject"));
                    dto.setReadcnt(rs.getInt("readcnt"));
                    dto.setRegdt(rs.getString("regdt"));
                    dto.setIndent(rs.getInt("indent"));
                    list.add(dto);//list에 모으기
				}while(rs.next());
			}//if end			
			
        }catch (Exception e) {
            System.out.println("전체목록실패:"+e);
        }finally {
            DBClose.close(con, pstmt, rs);
        }//end
		return list;
	}//list2() end
    
}//class end
