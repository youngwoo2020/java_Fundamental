package java_20210526;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUpdateDemo {
	public static void main(String[] args) {
		// 1. 드라이브를 로드한다.
		try {
			Class.forName("org.mariadb.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			// 2. 데이터 베이스와 연결한다.
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc12", "kpc1212");
			// 3.sql문을 전송할 수 있는 preparedStatememt 객체를 생성
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE member ");
			sql.append("SET NAME = ?, addr = ? ");
			sql.append("WHERE num = ? ");

			pstmt = con.prepareStatement(sql.toString());

			// 4. 바인딩 변수를 설정한다.
			int index = 1;
			//++앞에쓰면 증가후 대입, ++뒤에쓰면 대입 후 증가
			pstmt.setString(index++, "두테르테2");
			pstmt.setString(index++, "필리핀2");
			pstmt.setInt(index, 11);

			// 5. sql문을 전송한다.
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의 수 : " + resultCount);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// 6. 모든 자원을 반납한다.
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
