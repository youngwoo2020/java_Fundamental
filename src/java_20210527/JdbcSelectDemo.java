package java_20210527;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.jdi.connect.spi.Connection;

public class JdbcSelectDemo {
	public static void main(String[] args) {
		// 1. 드라이버 로드한다.
		// 2. 데이터베이스와 연결할 수 있는 connection객체를 생성한다.
		// 3. sql문을 전송할 수 있는 preparedStatement 객체를 생성한다
		// 4. 바인딩(?)변수 설정하기
		// 5. sql문을 전송(executeQuery)하여 resultSet 객체를 생성한다.
		// 6. resultSet에서 데이터를 추출(getxx(index))한다.
		// 7. 모든 자원을 반납한다.

		try {
			Class.forName("org.mariadb.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		java.sql.Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc12", "kpc1212");
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT num, NAME, addr ");
			sql.append("FROM member ");
			sql.append("ORDER BY num DESC ");
			sql.append("LIMIT ?,? ");

			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setInt(index++, 0);
			pstmt.setInt(index, 2);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				index = 1;
				int num = rs.getInt(index++);// rs.getInt("num");
				String name = rs.getString(index++);// rs.getInt("name");
				String addr = rs.getString(index);// rs.getInt("addr");
				System.out.printf("%d, %s, %s %n", num, name, addr);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
