package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteDemo {
	public static void main(String[] args) {

		// 1.드라이버 로드한다.
		// 2. 데이터베이스와 연결할 수 있는 connection객체를 생성한다.
		// 3. sql문을 전송할 수 있는 preparedStatement 객체를 생성한다
		// 4. 바인딩(?)변수 설정하기
		// 5.sql문을 전송한다.

		try {
			Class.forName("org.mariadb.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc12", "kpc1212");
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM member ");
			sql.append("WHERE num = ? ");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 0);

			int index = 1;
			pstmt.setInt(index, 11);

			int resultCount = pstmt.executeUpdate();
			System.out.println("삭제된 행의 갯수 : " + resultCount);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
