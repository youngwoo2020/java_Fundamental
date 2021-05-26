package java_20210526;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCInsertDemo {
	public static void main(String[] args) {

		// 1.드라이버 로드한다.
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드리이버 로드 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("드리이버로드 실패 : " + e.getMessage());
		}

		Connection con = null;
		PreparedStatement pstmt = null; 
		try {
			// 2. 데이터베이스와 연결할 수 있는 connection객체를 생성한다.
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kpc", // url
					"kpc12", // user
					"kpc1212"); // password
			System.out.println("데이터베이스 연결 성공");
			
			//3. sql문을 전송할 수 있는 preparedStatement 객체를 생성한다
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO member(num,NAME,addr)");
			sql.append("VALUES(?,?,?)");
			
			//pre~의 반환값이 string이기 때문에 stringbuilder를 string클래스로 변환하는 것이 toSring
			pstmt = con.prepareStatement(sql.toString());
			//setString(index,값)
			//4. 바인딩(?)변수 설정하기
			pstmt.setInt(1, 11);
			pstmt.setString(2, "두테르테");
			pstmt.setString(3, "필리핀");
			
			//5.sql문을 전송한다.
			int  resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의 수 : "+resultCount);
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
				if(con!=null)
				con.close();
				if(pstmt!=null)
				pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}