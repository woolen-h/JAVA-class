package jdbc0328;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test02_selectLike {

	public static void main(String[] args) {
		String col = "uname";
		String word = "나";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
try {
			
			String url     ="jdbc:oracle:thin:@localhost:1521:xe";
			String user    ="c##w";
			String password="1234";
			String driver  ="oracle.jdbc.driver.OracleDriver";			
			Class.forName(driver);						
			con=DriverManager.getConnection(url, user, password);			
			System.out.println("오라클DB 서버 연결 성공!!"); 	
			
			
			StringBuilder sql=new StringBuilder();
			sql.append("SELECT sno, uname, kor, eng, mat, tot, aver, addr, wdate");
			sql.append("FROM sungjuk");
			
			word = word.trim();
			if(word.length()>0) {
				String where=" WHERE " + col + " LIKE '% " + word + "%'";
				sql.append(where);
			}
			sql.append("ORDER BY sno DESC");
			System.out.println(sql.toString());
		}catch (Exception e) {
            System.out.println("오라클 DB 연결 실패 : " + e);
        }finally {//자원반납(순서주의)
            try {
                if(rs!=null) {rs.close();}
            }catch (Exception e) {}

            try {
                if(pstmt!=null) {pstmt.close();}
            }catch (Exception e) {}
                
            try {
                  if(con!=null) {con.close();}
            }catch (Exception e) {}	

	}

}}
