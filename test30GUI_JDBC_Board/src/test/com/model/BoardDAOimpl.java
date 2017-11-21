package test.com.model;

import java.util.ArrayList;
import java.util.List;

public class BoardDAOimpl implements BoardDAO{
	
	public BoardDAOimpl() {
		System.out.println("BoardDAO()...");
		
	}
	
	@Override
	public int insert(BoardVO bvo) {
		System.out.println("insert()");
		System.out.println(bvo.getTitle());
		System.out.println(bvo.getContent());
		System.out.println(bvo.getWriter());
		
		return 1;
	}
	
	@Override
	public BoardVO selectOne(BoardVO bvo) {
		System.out.println("selectOne()");
		System.out.println(bvo.getNum());
		
		return null;
	}
	
	@Override
	public int update(BoardVO bvo) {
		System.out.println("update()");
		System.out.println(bvo.getNum());
		System.out.println(bvo.getTitle());
		System.out.println(bvo.getContent());
		System.out.println(bvo.getWriter());
		
		return 1;
	}

	@Override
	public int delete(BoardVO bvo) {
		System.out.println("delete()");
		System.out.println(bvo.getNum());
		
		
		return 0;
		
	}
	
	@Override
	public List<BoardVO> selectAll() {
		List<BoardVO> list = new ArrayList<>();
		
		for (int i = 0; i < 2; i++) {
			BoardVO vo = new BoardVO();
			vo.setNum(i+1);
			vo.setTitle("title"+(i+1));
			vo.setContent("content"+(i+1));
			vo.setWriter("kim"+(i+1));
			vo.setRegDate(new java.sql.Date(System.currentTimeMillis()));
			list.add(vo);
		}
		
		return list;
	}

}
