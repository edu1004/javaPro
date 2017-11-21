package test.com.view;

import java.util.List;

import test.com.model.BoardDAO;
import test.com.model.BoardDAOimpl;
import test.com.model.BoardVO;

public class BoardMain {

	public static void main(String[] args) {
		System.out.println("board");
		
//		BoardDAO dao = new BoardDAOimpl();
//		
//		//1.insert
//		BoardVO vo = new BoardVO();
//		vo.setTitle("title");
//		vo.setContent("content");
//		vo.setWriter("kim");
//		int result = dao.insert(vo);
//		
		
//		BoardDAO dao = new BoardDAOimpl();
//		
//		List<BoardVO> list = dao.selectAll();
//		System.out.println(list.size());
//		for (int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i).getNum()+" ");
//			System.out.print(list.get(i).getTitle()+" ");
//			System.out.print(list.get(i).getContent()+" ");
//			System.out.print(list.get(i).getWriter()+" ");
//			System.out.println(list.get(i).getRegDate());
//		}
		
		
		
//		new InsertPage();
		new SelectPage();
		
		
		
		
	}

}
