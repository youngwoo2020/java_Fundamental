package java_20210526.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCInsertDemo {
	public static void main(String[] args) {
		// 1.드라이버 로드한다.
		// 2. 데이터베이스와 연결할 수 있는 connection객체를 생성한다.
		//3. sql문을 전송할 수 있는 preparedStatement 객체를 생성한다
		//4. 바인딩(?)변수 설정하기
		//5.sql문을 전송한다.
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			Connection con = null;
			PreparedStatement pstmt = null;
			
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc","kpc12","kpc1212");
			
			StringBuilder sql = new StringBuilder();
			sql.append("sql");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 0);
			
			int resultCount = pstmt.executeUpdate();
			
			
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
}
