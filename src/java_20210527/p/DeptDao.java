package java_20210527.p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DeptDao {
	private static DeptDao single;

	private DeptDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static DeptDao getInstance() {
		if (single == null) {
			single = new DeptDao();
		}
		return single;
	}

	public boolean insert(DeptDto dto) {
		boolean success = false;
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc13", "kpc1212");

			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO dept ");
			sql.append("VALUES(?, ?, ?) ");

			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setInt(index++, dto.getNo());
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index, dto.getLoc());

			pstmt.executeUpdate();

			success = true;
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

		return success;

	}

	public ArrayList<DeptDto> select(int start, int len) {
		ArrayList<DeptDto> list = new ArrayList<DeptDto>();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc13", "kpc1212");

			StringBuilder sql = new StringBuilder();
			sql.append("SELECT deptno, dname ");
			sql.append("FROM dept ");
			sql.append("ORDER BY deptno ");
			sql.append("LIMIT ?,? ");

			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setInt(index++, start);
			pstmt.setInt(index++, len);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				index = 1;
				int no = rs.getInt(index++);
				String name = rs.getString(index++);
				String loc = rs.getString(index);
				list.add(new DeptDto(no, name, loc));
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

		return list;
	}

}