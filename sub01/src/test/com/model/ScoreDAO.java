package test.com.model;

import java.util.List;

public interface ScoreDAO {

	public int insertScore (ScoreVO vo);
	public int updateScore (ScoreVO vo);
	public ScoreVO selectOneScore (ScoreVO vo);
	public List<ScoreVO> selectAllScore ();
	public List<ScoreVO> scoreRank(int num);
}
