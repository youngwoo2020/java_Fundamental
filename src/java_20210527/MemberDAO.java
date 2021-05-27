package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	// 1.memberDAO 변수인 single을 static변수로 설정한다. (getInstance메서드가 static이기 때문에 멤버변수도
	// static)
	private static MemberDAO single;

	// 2. 생성자의 접근한정자를 private로 설정한다. =>이유: 외부에서 객체 생성을 못하게 하기 위함.
	private MemberDAO() {
		// drive는 매번 해야하기 때문에 생성자로 설정한다.
		try {
			Class.forName("org.mariadb.jdbc.Driver");

		} catch (ClassNotFoundException e) {

			System.err.println("드리이버로드 실패 : " + e.getMessage());
		}
	}

	// memberDAO의 객체는 getInstance()메서드로만 생성한다.
	// getInstance()메서드의 구현은 MemberDAO객체를 한개만 생성할 수 있도록 만들어야 한다.
	// static 메서드로 구현한 이유는 memberDAO객체를 외부에서 생성할 수 없기 때문이다.
	public static MemberDAO getInstance() {
		if (single == null) {
			single = new MemberDAO();
		}
		return single;
	}

	public boolean insert(MemberDTO dto) {
		boolean success = false;

		Connection con = null;
		PreparedStatement pstmt = null;
		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1212");

			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO member(num,NAME,addr)");
			sql.append("VALUES(?,?,?)");

			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setInt(index++, dto.getNum());
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index, dto.getAddr());

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
		return true;
	}

	public boolean update(MemberDTO dto) {
		boolean success = false;

		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc12", "kpc1212");

			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE member ");
			sql.append("SET NAME = ?, addr = ? ");
			sql.append("WHERE num = ? ");

			pstmt = con.prepareStatement(sql.toString());

			int index = 1;

			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getAddr());
			pstmt.setInt(index, dto.getNum());

			pstmt.executeUpdate();
			success = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {

				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return success;
	}

	// 지우기만 하면 되니까 기본키를 매개변수로 잡는다.
	public boolean delete(int num) {
		boolean success = false;

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
			pstmt.setInt(index, num); // delete 매개변수인 num

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

	public ArrayList<MemberDTO> select(int start, int len) {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();

	

		Connection con = null;
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
			pstmt.setInt(index++, start); // 매개변수
			pstmt.setInt(index, len);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				index = 1;
				int num = rs.getInt(index++);// rs.getInt("num");
				String name = rs.getString(index++);// rs.getInt("name");
				String addr = rs.getString(index);// rs.getInt("addr");
				list.add(new MemberDTO());
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
