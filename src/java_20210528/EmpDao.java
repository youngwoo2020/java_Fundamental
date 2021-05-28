package java_20210528;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpDao {

	private static EmpDao kwon;

	private EmpDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static EmpDao getInstance() {
		if (kwon == null) {
			kwon = new EmpDao();
		}
		return kwon;
	}

	public boolean insert(EmpDto dto) {
		boolean success = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kpc", "kpc12", "kpc1212");

			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) ");
			sql.append("VALUES (?,?,?,?, CURDATE(), ?, ?, ?) ");

			pstmt = con.prepareStatement(sql.toString());
			// cutdate 무시하고 인덱스 잡아야함
			int index = 1;
			pstmt.setInt(index++, dto.getNo());
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getJob());
			pstmt.setInt(index++, dto.getMgr());
			pstmt.setDouble(index++, dto.getSal());
			pstmt.setDouble(index++, dto.getComm());
			pstmt.setInt(index, dto.getDeptNo());

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

	public boolean update(EmpDto dto) {
		boolean success = false;
		return true;
	}

	public boolean delete(int no) {
		boolean success = false;
		return true;
	}

	public ArrayList<EmpDto> select(int start, int len) {
		ArrayList<EmpDto> list = new ArrayList<EmpDto>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kpc", "kpc12", "kpc1212");
			
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT empno, ename, job, mgr, date_format(hiredate,'%Y/%m/%d'), sal, nvl(comm,0), deptno ");
			sql.append("FROM emp ");
			sql.append("ORDER BY hiredate DESC ");
			sql.append("LIMIT ?,? ");
			
			pstmt=con.prepareStatement(sql.toString());
			
			int index = 1;
			pstmt.setInt(index++, start);
			pstmt.setInt(index, len);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				index = 1;
				int no = rs.getInt(index++);
				String name = rs.getNString(index++);
				String job = rs.getNString(index++);
				int mgr = rs.getInt(index++);
				String hiredate = rs.getString(index++);
				double sal = rs.getDouble(index++);
				double comm = rs.getDouble(index++);
				int deptNo = rs.getInt(index);
				list.add(new EmpDto(no, name, job, mgr,hiredate,sal,comm,deptNo));
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
