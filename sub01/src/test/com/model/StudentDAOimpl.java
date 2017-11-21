package test.com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOimpl implements StudentDAO {

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	public StudentDAOimpl() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("jdbc driver successed");
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc driver failed");
			e.printStackTrace();
		}
	}

	@Override
	public int insertStd(StudentVO ivo) {
		System.out.println("Student_insert()...");
		int flag = 0;
		try {
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","semistudent","hi123456");
			System.out.println("conn successed....");
			if (ivo.getDeptName().equals("com")) {
				String sql = "insert into student(stdNum, stdName, deptName, birth, gender, tel, address, email ) "
						+ "values(seq_com.nextval, ?, ?, ?, ?, ?, ?, ?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, ivo.getStdName());
				pstmt.setString(2, ivo.getDeptName());
				pstmt.setString(3, ivo.getBirth());
				pstmt.setString(4, ivo.getGender());
				pstmt.setString(5, ivo.getTel());
				pstmt.setString(6, ivo.getAddress());
				pstmt.setString(7, ivo.getEmail());
				flag = pstmt.executeUpdate();			
				
			} else if (ivo.getDeptName().equals("arch")) {
				String sql = "insert into student(stdNum, stdName, deptName, birth, gender, tel, address, email ) "
						+ "values(seq_arch.nextval, ?, ?, ?, ?, ?, ?, ?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, ivo.getStdName());
				pstmt.setString(2, ivo.getDeptName());
				pstmt.setString(3, ivo.getBirth());
				pstmt.setString(4, ivo.getGender());
				pstmt.setString(5, ivo.getTel());
				pstmt.setString(6, ivo.getAddress());
				pstmt.setString(7, ivo.getEmail());
				flag = pstmt.executeUpdate();
				
			} else if (ivo.getDeptName().equals("busi")){
				String sql = "insert into student(stdNum, stdName, deptName, birth, gender, tel, address, email ) "
						+ "values(seq_busi.nextval, ?, ?, ?, ?, ?, ?, ?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, ivo.getStdName());
				pstmt.setString(2, ivo.getDeptName());
				pstmt.setString(3, ivo.getBirth());
				pstmt.setString(4, ivo.getGender());
				pstmt.setString(5, ivo.getTel());
				pstmt.setString(6, ivo.getAddress());
				pstmt.setString(7, ivo.getEmail());
				flag = pstmt.executeUpdate();
				
			} else {
				System.out.println("올바른 학과가 아님.");
			}
		} catch (SQLException e) {
			System.out.println("conn failed...");
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return flag;
	}

	@Override
	public int updateStd(StudentVO ivo) {
		int flag = 0;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "semistudent", "hi123456");
			System.out.println("conn successed....");
			String sql = "update student set stdname=?, birth=?, gender=?, tel=?, address=?, email=? where stdnum=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ivo.getStdName());
			// pstmt.setString(2, ivo.getDeptName());
			pstmt.setString(2, ivo.getBirth());
			pstmt.setString(3, ivo.getGender());
			pstmt.setString(4, ivo.getTel());
			pstmt.setString(5, ivo.getAddress());
			pstmt.setString(6, ivo.getEmail());
			pstmt.setInt(7, ivo.getStdNum());
			flag = pstmt.executeUpdate();

			String sql2 = "update score set stdname=? where stdnum=?";
			pstmt = conn.prepareStatement(sql2);
			pstmt.setString(1, ivo.getStdName());
			pstmt.setInt(2, ivo.getStdNum());

			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("conn failed...");
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return flag;
	}

	@Override
	public int deleteStd(StudentVO vo) {
		int flag = 0;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "semistudent", "hi123456");
			System.out.println("conn success");

			String sql = "delete from student where stdnum = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getStdNum());
			flag = pstmt.executeUpdate();
			
			String sql1 = "delete from score where stdnum = ?";
			pstmt = conn.prepareStatement(sql1);
			pstmt.setInt(1, vo.getStdNum());
			flag += pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("delete fail");
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return flag;
	}

	@Override
	public StudentVO selectOneStd(StudentVO ivo) {

		StudentVO list = new StudentVO();

		try {
			// 1. 커넥션
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "semistudent", "hi123456");
			System.out.println("conn successed.....");
			// 2. 디비 질의문 작성

			String sql = "select * from student where stdnum = ?"; // Database에서는 single ''을 문자로 표현한다.

			// 3. 질의문 처리 객체 생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, ivo.getStdNum());

			// 4. 질의문 실행
			rs = pstmt.executeQuery();

			// rs.next는 다음 줄로 넘어가는 것.
			while (rs.next()) {
				StudentVO vo = new StudentVO();
				vo.setStdNum(rs.getInt("stdNum"));
				vo.setStdName(rs.getString("stdname"));
				vo.setDeptName(rs.getString("deptName"));
				vo.setBirth(rs.getString("birth"));
				vo.setGender(rs.getString("gender"));
				vo.setTel(rs.getString("tel"));
				vo.setAddress(rs.getString("address"));
				vo.setEmail(rs.getString("email"));
				list = vo;
			}

		} catch (SQLException e) {

			System.out.println("conn failed....");
			e.printStackTrace();
		} finally {
			if (rs != null) { // select all의 경우 rs도 사용했기 때문에 rs를 닫아줘야 한다.
				try {
					rs.close();
				} catch (Exception e2) {
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e2) {
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e2) {
				}
			}
		}

		return list;
	}

	@Override
	public List<StudentVO> selectAllStd() {

		List<StudentVO> list = new ArrayList<StudentVO>();

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "semistudent", "hi123456");
			System.out.println("conn successed.....");

			String sql = "select * from student";

			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				StudentVO vo = new StudentVO();
				vo.setStdNum(rs.getInt("stdNum"));
				vo.setStdName(rs.getString("stdname"));
				String deptname = rs.getString("deptName"); 
				if(deptname.equals("com")) {
					deptname = "컴퓨터공학과";
				}else if(deptname.equals("arch")) {
					deptname = "건축공학과";
				}else if(deptname.equals("busi")) {
					deptname = "경영학과";
				}
				vo.setDeptName(deptname);
				vo.setBirth(rs.getString("birth"));
				vo.setGender(rs.getString("gender"));
				vo.setTel(rs.getString("tel"));
				vo.setAddress(rs.getString("address"));
				vo.setEmail(rs.getString("email"));
				list.add(vo);
			}
		} catch (SQLException e) {

			System.out.println("conn failed....");
			e.printStackTrace();
		} finally {
			if (rs != null) { // select all의 경우 rs도 사용했기 때문에 rs를 닫아줘야 한다.
				try {
					rs.close();
				} catch (Exception e2) {
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e2) {
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e2) {
				}
			}
		}

		return list;
	}

}
