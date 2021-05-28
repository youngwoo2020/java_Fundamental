package java_20210528;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sun.jdi.connect.spi.Connection;

public class TransactionDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean success = false;
		java.sql.Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc12", "kpc1212");

			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO member VALUES(202,'kim1','kim2') ");
			// 트렌잭션 시작
			con.setAutoCommit(false);
			pstmt1 = con.prepareStatement(sql.toString());
			pstmt1.executeUpdate();

			sql.setLength(0);

			sql.append("INSERT INTO member VALUES(203,'kim3','kim4");
			pstmt2 = con.prepareStatement(sql.toString());
			pstmt2.executeUpdate();

			success = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (success == true) {
					con.commit();
				} else {
					con.rollback();
				}
				// connection pool 사용할 때는 반드시 해주어야 함.
				con.setAutoCommit(true);
				if (con != null)
					con.close();
				if (pstmt1 != null)
					pstmt1.close();
				if (pstmt2 != null)
					pstmt2.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
