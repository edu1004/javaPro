package semi.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class DBDAO {

	List<log_inVO> list = new ArrayList<log_inVO>();
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	int flag;
	
	public DBDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("jdbc driver successed");
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc driver failed");
			e.printStackTrace();
		}
	}

	
	
	
	
public int Login(String ID1, String PW1){

	try {
		// 1.커넥션객체 생성
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "student", "hi123456");
		System.out.println("conn successed..");

		// 2.디비 질의문 작성
		String sql = "select * from student";
	
		// 3.질의문 처리 객체 생성
		pstmt = conn.prepareStatement(sql);

		// 4.질의문 실행
		rs = pstmt.executeQuery();
		
		while (rs.next()) {
			
			log_inVO vo = new log_inVO();
			vo.setID(rs.getString("ID"));
			vo.setPW(rs.getString("PW"));
			
			list.add(vo);
	
			if(vo.getID().equals(ID1) && vo.getPW().equals(PW1))
			{
				flag = 1;
				break;
			}
			

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

		return flag;
	}
	
	
}
