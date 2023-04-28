package net.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBOpen {
	//오라클 데이터베이스 연결 메소드
	public Connection getConnection() {
		Connection con=null;
		try {
			String url     ="jdbc:mysql://localhost/wobada";
			String user    ="wobada";
			String password="wpwnehdls3619";
			String driver  ="org.gjt.mm.mysql.Driver";			
			Class.forName(driver);						
			con=DriverManager.getConnection(url, user, password);	
		} catch (Exception e) {
			System.out.println("오라클 DB 연결 실패 : "+e);
		}//end
		return con;
	}
	
	
}//class end
