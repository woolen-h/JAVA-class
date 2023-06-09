package net.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.websocket.Session;
import net.utility.DBClose;
import net.utility.DBOpen;
import net.utility.MyAuthenticator;
import oracle.jdbc.driver.Message;

public class MemberDAO {
	private DBOpen dbopen = null;
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private StringBuilder sql = null;
	
	public MemberDAO() {
		dbopen = new DBOpen(); 
	}//end
	
	public String loginProc(MemberDTO dto) {
		String mlevel = null;
		try {
			con=dbopen.getConnection();
			sql=new StringBuilder();
			sql.append(" SELECT mlevel ");
			sql.append(" FROM member ");
			sql.append(" WHERE id=? and passwd=? ");
			sql.append(" and mlevel in ('A1', 'B1', 'C1', 'D1') ");
			
			pstmt=con.prepareStatement(sql.toString());
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPasswd());
			
			rs=pstmt.executeQuery();
			if (rs.next()) {
				mlevel=rs.getString("mlevel");
			}//if
		} catch (Exception e) {
			System.out.println("로그인 실패 : "+e);
		} finally {
			DBClose.close(con, pstmt, rs);
		}//try
		return mlevel;
	}//loginProc() 

	public int duplecateID(String id) {
		int cnt=0;
		try {
			con=dbopen.getConnection();
			sql=new StringBuilder();
			sql.append("select count(id) as cnt ");
			sql.append("from member ");
			sql.append("where id=? ");
			
			pstmt=con.prepareStatement(sql.toString());
			pstmt.setString(1, id);
			
			rs=pstmt.executeQuery();
			if(rs.next()) {
				cnt=rs.getInt("cnt");
			}//if
		} catch (Exception e) {
			System.out.println("아이디 중복 확인 실패 : "+e);
			// TODO: handle exception
		} finally {
			DBClose.close(con, pstmt, rs);
		}//try
		return cnt;
	}//duple
	public boolean findID(MemberDTO dto) {
		boolean flag=false;
		try {
			con=dbopen.getConnection();
			sql=new StringBuilder();
			//이름과 이메일이 일치하는 ID
			sql.append(" select id ");
			sql.append(" from member ");
			sql.append(" where mname=? and email=? ");
			pstmt=con.prepareStatement(sql.toString());
			pstmt.setString(1, dto.getMname());
			pstmt.setString(2, dto.getEmail());
			rs=pstmt.executeQuery();
			if (rs.next()) {//이름과 이메일 일치
				//아이디 가져오기
				String id=rs.getString("id");
				//[임시비밀번호]
				//대,소문자, 숫자이용 랜덤 10글자
				String[] ch= {
						"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
						"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
						"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
				};//ch[0]~ch[61]
				//ch배열에서 랜덤하게 10글자
				StringBuilder imsiPW=new StringBuilder();//임시 비밀번호
				for(int i=0; i<10; i++) {
					int num=(int)(Math.random()*ch.length);
					imsiPW.append(ch[num]);
				}//for
				//임시비밀번호 테이블 수정
				sql=new StringBuilder();
				sql.append(" update member ");
				sql.append(" set passwd=? ");
				sql.append(" where mname=? and email=? ");
				pstmt.setString(1, imsiPW.toString());
				pstmt.setString(2, dto.getMname());
				pstmt.setString(3, dto.getEmail());
				
				int cnt=pstmt.executeUpdate();
				if(cnt==1) {//임시 비밀번호 수정완
					String content="* 임시 비밀번호로 로그인 한 후, 회원 정보 수정에서 비밀번호를 변경하시기 바랍니다.";
					content+="<hr>";
					content+="<table border='1'>";
					content+="<tr>";
					content+="    <th>아이디</th>";
					content+="    <td>" + id + "</td>";
					content+="</tr>";
					content+="<tr>";
					content+="	<th>임시비밀번호</th>";
					content+="	<td>"+imsiPW.toString()+"</td>";
					content+="</tr>";		
					content+="</table>";
					
					String mailServer="mw-002.cafe24.com"; //cafe24 메일서버   
					Properties props=new Properties();
					props.put("mail.smtp.host", mailServer);
					props.put("mail.smtp.auth", true);
					
					Authenticator myAuth=new MyAuthenticator(); //다형성 
					Session sess=Session.getInstance(props, myAuth); 
					
					InternetAddress[] address = { new InternetAddress(dto.getEmail()) }; 
					Message msg=new MimeMessage(sess);
					msg.setRecipients(Message.RecipientType.TO, address);
					msg.setFrom(new InternetAddress("webmaster@itwill.co.kr"));		
					msg.setSubject("Myweb 아이디 / 비번입니다.");
					msg.setContent(content, "text/html; charset=UTF-8");
					msg.setSentDate(new Date());
					Transport.send(msg);
					
					flag=true;
				}//if
			} else {

			}//if
		} catch (Exception e) {
			System.out.println("아이디/비번 찾기 실패 : "+e);
			// TODO: handle exception
		} finally {
			DBClose.close(con, pstmt, rs);
		}
		return flag;
	}//findID()
	
	
}//class

