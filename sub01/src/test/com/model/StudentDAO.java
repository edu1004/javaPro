package test.com.model;

import java.util.List;

public interface StudentDAO {
	
	public int insertStd (StudentVO ivo);
	public int updateStd (StudentVO ivo);
	public int deleteStd (StudentVO ivo);
	public StudentVO selectOneStd (StudentVO ivo);
	public List<StudentVO> selectAllStd ();
}
