package test.com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ScoreDAOimpl implements ScoreDAO {

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	public ScoreDAOimpl() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("jdbc driver successed");
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc driver failed");
			e.printStackTrace();
		}
	}

	@Override
	public List<ScoreVO> scoreRank(int num) {

		List<ScoreVO> list = new ArrayList<ScoreVO>();
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "semistudent", "hi123456");
			String sql = "select rank() over (partition by deptname order by avg desc) as rk from score order by stdnum";
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();
			// if (num < 1734000) {
			// pstmt.setString(1, "com");
			// } else if (num < 1763000 & num >= 1734000) {
			// pstmt.setString(1, "arch");
			// } else if (num >= 1763000) {
			// pstmt.setString(1, "busi");
			// }

			while (rs.next()) {
				ScoreVO vo = new ScoreVO();
				vo.setRank(Integer.parseInt(rs.getString("rk")));
				list.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("rank failed");
			e.printStackTrace();
		} finally {
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
	public int insertScore(ScoreVO vo) {
		int flag = 0;

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "semistudent", "hi123456");
			String sql = "insert into score(stdnum, stdname, deptname, business, marketing, architecture, design, java, c, toeic, avg, grade) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);

			if (vo.getStdNum() < 1734000) {
				vo.setAvg((vo.getJava() + vo.getC() + vo.getToeic()) / 3);
				pstmt.setInt(1, vo.getStdNum());
				pstmt.setString(2, vo.getStdName());
				pstmt.setString(3, vo.getDeptName());
				pstmt.setInt(4, 0); // 비즈니스
				pstmt.setInt(5, 0); // 마케팅
				pstmt.setInt(6, 0); // 아키텍쳐
				pstmt.setInt(7, 0); // 디자인
				pstmt.setInt(8, vo.getJava()); // 자바
				pstmt.setInt(9, vo.getC()); // c
				pstmt.setInt(10, vo.getToeic()); // 토익
				pstmt.setDouble(11, vo.getAvg()); // avg
				if ((double) vo.getAvg() >= 90) {
					vo.setGrade("A");
				} else if ((double) vo.getAvg() >= 80) {
					vo.setGrade("B");
				} else if ((double) vo.getAvg() >= 70) {
					vo.setGrade("C");
				} else {
					vo.setGrade("D");
				}
				pstmt.setString(12, vo.getGrade()); // grade
			} else if (vo.getStdNum() < 1763000 & vo.getStdNum() >= 1734000) {
				vo.setAvg((double) (vo.getArchitecture() + vo.getDesign() + vo.getToeic()) / 3);
				pstmt.setInt(1, vo.getStdNum());
				pstmt.setString(2, vo.getStdName());
				pstmt.setString(3, vo.getDeptName());
				pstmt.setInt(4, 0); // 비즈니스
				pstmt.setInt(5, 0); // 마케팅
				pstmt.setInt(6, vo.getArchitecture()); // 아키텍쳐
				pstmt.setInt(7, vo.getDesign()); // 디자인
				pstmt.setInt(8, 0); // 자바
				pstmt.setInt(9, 0); // c
				pstmt.setInt(10, vo.getToeic()); // 토익
				pstmt.setDouble(11, vo.getAvg()); // avg
				if ((double) vo.getAvg() >= 90) {
					vo.setGrade("A");
				} else if ((double) vo.getAvg() >= 80) {
					vo.setGrade("B");
				} else if ((double) vo.getAvg() >= 70) {
					vo.setGrade("C");
				} else {
					vo.setGrade("D");
				}
				pstmt.setString(12, vo.getGrade()); // grade
			} else if (vo.getStdNum() >= 1763000) {
				vo.setAvg((double) (vo.getBusiness() + vo.getMarketing() + vo.getToeic()) / 3);
				pstmt.setInt(1, vo.getStdNum());
				pstmt.setString(2, vo.getStdName());
				pstmt.setString(3, vo.getDeptName());
				pstmt.setInt(4, vo.getBusiness()); // 비즈니스
				pstmt.setInt(5, vo.getMarketing()); // 마케팅
				pstmt.setInt(6, 0); // 아키텍쳐
				pstmt.setInt(7, 0); // 디자인
				pstmt.setInt(8, 0); // 자바
				pstmt.setInt(9, 0); // c
				pstmt.setInt(10, vo.getToeic()); // 토익
				pstmt.setDouble(11, vo.getAvg()); // avg
				if ((double) vo.getAvg() >= 90) {
					vo.setGrade("A");
				} else if ((double) vo.getAvg() >= 80) {
					vo.setGrade("B");
				} else if ((double) vo.getAvg() >= 70) {
					vo.setGrade("C");
				} else {
					vo.setGrade("D");
				}
				pstmt.setString(12, vo.getGrade()); // grade
			}

			flag = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("catch");
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
	public int updateScore(ScoreVO vo) {
		int flag = 0;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "semistudent", "hi123456");
			System.out.println("conn success");
			int stdNum = vo.getStdNum();
			System.out.println(vo.getDeptName());
			if (vo.getDeptName().equals("컴퓨터공학과")) {
				vo.setAvg((vo.getJava() + vo.getC() + vo.getToeic()) / 3);
				String sql = "update score set java = ?, c = ?, toeic = ?, avg = ?, grade = ? where stdnum = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, vo.getJava());
				pstmt.setInt(2, vo.getC());
				pstmt.setInt(3, vo.getToeic());
				pstmt.setDouble(4, vo.getAvg()); // avg
				if (vo.getAvg() >= 90) {
					vo.setGrade("A");
				} else if (vo.getAvg() >= 80) {
					vo.setGrade("B");
				} else if (vo.getAvg() >= 70) {
					vo.setGrade("C");
				} else {
					vo.setGrade("D");
				}
				pstmt.setString(5, vo.getGrade()); // grade
				pstmt.setInt(6, vo.getStdNum());

				flag = pstmt.executeUpdate();

			} else if (vo.getDeptName().equals("건축공학과")) {
				vo.setAvg((vo.getArchitecture() + vo.getDesign() + vo.getToeic()) / 3);
				String sql = "update score set architecture = ?, design = ?, toeic = ?, avg = ?, grade = ? where stdnum = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, vo.getArchitecture());
				pstmt.setInt(2, vo.getDesign());
				pstmt.setInt(3, vo.getToeic());
				pstmt.setDouble(4, vo.getAvg()); // avg
				if (vo.getAvg() >= 90) {
					vo.setGrade("A");
				} else if (vo.getAvg() >= 80) {
					vo.setGrade("B");
				} else if (vo.getAvg() >= 70) {
					vo.setGrade("C");
				} else {
					vo.setGrade("D");
				}
				pstmt.setString(5, vo.getGrade()); // grade
				pstmt.setInt(6, vo.getStdNum());

				flag = pstmt.executeUpdate();

			} else if (vo.getDeptName().equals("경영학과")) {
				vo.setAvg((vo.getBusiness() + vo.getMarketing() + vo.getToeic()) / 3);
				String sql = "update score set business = ?, marketing = ?, toeic = ?, avg = ?, grade = ? where stdnum = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, vo.getBusiness());
				pstmt.setInt(2, vo.getMarketing());
				pstmt.setInt(3, vo.getToeic());
				pstmt.setDouble(4, vo.getAvg()); // avg
				if (vo.getAvg() >= 90) {
					vo.setGrade("A");
				} else if (vo.getAvg() >= 80) {
					vo.setGrade("B");
				} else if (vo.getAvg() >= 70) {
					vo.setGrade("C");
				} else {
					vo.setGrade("D");
				}
				pstmt.setString(5, vo.getGrade()); // grade
				pstmt.setInt(6, vo.getStdNum());

				flag = pstmt.executeUpdate();
			}

		} catch (SQLException e) {
			System.out.println("update fail");
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
	public ScoreVO selectOneScore(ScoreVO vo) {

		ScoreVO list = new ScoreVO();

		try {
			// 1. 커넥션
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "semistudent", "hi123456");
			// 2. 디비 질의문 작성

			String sql = "select * from score where stdnum = ?"; // Database에서는 single ''을 문자로 표현한다.

			// 3. 질의문 처리 객체 생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getStdNum());

			// 4. 질의문 실행
			rs = pstmt.executeQuery();
			// rs.next는 다음 줄로 넘어가는 것.
			while (rs.next()) {
				ScoreVO vos = new ScoreVO();
				if (rs.getString("deptname").equals("com")) {
					vos.setStdNum(vo.getStdNum());
					vos.setDeptName(rs.getString("deptname"));
					vos.setStdName(rs.getString("stdname"));
					vos.setJava(rs.getInt("java"));
					vos.setC(rs.getInt("c"));
					vos.setToeic(rs.getInt("toeic"));
					list = vos;
				} else if (rs.getString("deptname").equals("arch")) {
					vos.setStdNum(vo.getStdNum());
					vos.setDeptName(rs.getString("deptname"));
					vos.setStdName(rs.getString("stdname"));
					vos.setArchitecture(rs.getInt("architecture"));
					vos.setDesign(rs.getInt("design"));
					vos.setToeic(rs.getInt("toeic"));
					list = vos;
				} else if (rs.getString("deptname").equals("busi")) {
					vos.setStdNum(vo.getStdNum());
					vos.setDeptName(rs.getString("deptname"));
					vos.setStdName(rs.getString("stdname"));
					vos.setBusiness(rs.getInt("business"));
					vos.setMarketing(rs.getInt("marketing"));
					vos.setToeic(rs.getInt("toeic"));
					list = vos;
				}
			}

		} catch (SQLException e) {

			System.out.println("conn failed....");
			e.printStackTrace();
		} finally {
			if (rs != null) { // select all의 경우 rs도 사용했기 때문에 rs를 닫아줘야 한다.
				try {
					rs.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}

		return list;
	}

	@Override
	   public List<ScoreVO> selectAllScore() {

	      List<ScoreVO> list = new ArrayList<ScoreVO>();

	      try {
	         conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "semistudent", "hi123456");
	         System.out.println("conn successed...");

	         // 2. DQL 작성
	         String sql = "select * from score order by stdnum";
	         // 3. 질의문 처리 객체 생성
	         pstmt = conn.prepareStatement(sql);
	         // 4. 질의문 실행
	         rs = pstmt.executeQuery();

	         while (rs.next()) {

	            ScoreVO vo = new ScoreVO();
	            vo.setStdNum(rs.getInt("stdnum"));
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
	            vo.setBusiness(rs.getInt("business"));
	            vo.setMarketing(rs.getInt("marketing"));
	            vo.setArchitecture(rs.getInt("architecture"));
	            vo.setDesign(rs.getInt("design"));
	            vo.setJava(rs.getInt("java"));
	            vo.setC(rs.getInt("c"));
	            vo.setToeic(rs.getInt("toeic"));
	            vo.setAvg(rs.getDouble("avg"));
	            vo.setGrade(rs.getString("grade"));
	            list.add(vo);

	         }
	      } catch (SQLException e) {
	         System.out.println("selectAll failed...");
	      } finally {
	         // 5. 닫기
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

}
