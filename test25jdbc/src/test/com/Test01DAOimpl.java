package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test01DAOimpl implements Test01DAO {

	List<Test01VO> list = new ArrayList<Test01VO>();
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	public Test01DAOimpl() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("jdbc driver successed");
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc driver failed");
			e.printStackTrace();
		}
	}

	@Override
	public int insert(Test01VO vo) {
		System.out.println("insert()");
		System.out.println(vo.getName());
		int flag = 0;
		try {
			// 1.커넥션객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "test", "hi123456");
			System.out.println("conn successed..");

			// 2.디비 질의문 작성
			String sql = "insert into test(num, name) " + "values(seq_test_num.nextval, ?)";

			// 3.질의문 처리 객체 생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());

			// 4.질의문 실행
			flag = pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("insert failed..");
			e.printStackTrace();
		} finally {
			// 5.닫기
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
	public List<Test01VO> selectAll() {
		System.out.println("selectAll()...");
		List<Test01VO> list = new ArrayList<Test01VO>();
		try {
			// 1.커넥션객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "test", "hi123456");
			System.out.println("conn successed..");

			// 2.디비 질의문 작성
			String sql = "select * from test";

			// 3.질의문 처리 객체 생성
			pstmt = conn.prepareStatement(sql);

			// 4.질의문 실행
			rs = pstmt.executeQuery();
			System.out.println("selectAll rs:" + rs);

			while (rs.next()) {
				// System.out.println(rs.getInt("num"));
				// System.out.println(rs.getString("name"));
				Test01VO vo = new Test01VO();
				vo.setNum(rs.getInt("num"));
				vo.setName(rs.getString("name"));
				list.add(vo);
			}

		} catch (SQLException e) {
			System.out.println("selectAll failed..");
			e.printStackTrace();
		} finally {
			// 5.닫기
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
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

		return list;
	}

	@Override
	public int update(Test01VO vo) {
		System.out.println("update()");
		System.out.println(vo.getNum());
		System.out.println(vo.getName());
		int flag = 0;
		try {
			// 1.커넥션객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "test", "hi123456");
			System.out.println("conn successed..");

			// 2.디비 질의문 작성
			String sql = "update test set name=? where num=?";

			// 3.질의문 처리 객체 생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getNum());

			// 4.질의문 실행
			flag = pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("update failed..");
		} finally {
			// 5.닫기
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
	public int delete(Test01VO vo) {
		System.out.println("delete()");
		System.out.println(vo.getNum());
		int flag = 0;
		try {
			// 1.커넥션객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "test", "hi123456");
			System.out.println("conn successed..");

			// 2.디비 질의문 작성
			String sql = "delete from test where num=?";

			// 3.질의문 처리 객체 생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getNum());

			// 4.질의문 실행
			flag = pstmt.executeUpdate();
			System.out.println("delete flag:" + flag);
		} catch (SQLException e) {
			System.out.println("delete failed..");
			e.printStackTrace();
		} finally {
			// 5.닫기
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
	public Test01VO selectOne(Test01VO vo) {
		System.out.println("selectOne()");
		System.out.println(vo.getNum());

		Test01VO vo2 = new Test01VO();

		try {
			// 1.커넥션객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "test", "hi123456");
			System.out.println("conn successed..");

			// 2.디비 질의문 작성
			String sql = "select * from test where num=?";

			// 3.질의문 처리 객체 생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getNum());

			// 4.질의문 실행
			rs = pstmt.executeQuery();
			System.out.println("selectOne rs:" + rs);

			while (rs.next()) {
				// System.out.println(rs.getInt("num"));
				// System.out.println(rs.getString("name"));
				vo2.setNum(rs.getInt("num"));
				vo2.setName(rs.getString("name"));
			}

		} catch (SQLException e) {
			System.out.println("selectAll failed..");
			e.printStackTrace();
		} finally {
			// 5.닫기
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
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

		return vo2;
	}

}
