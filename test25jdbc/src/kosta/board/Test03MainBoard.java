package kosta.board;

import java.util.Date;

public class Test03MainBoard {

	public static void main(String[] args) {

		Test03BoardDAOimpl bDAO = new Test03BoardDAOimpl();

		// insert
		Test03BoardVO bvo = new Test03BoardVO();
		bvo.setNum(1);
		bvo.setTitle("title");
		bvo.setContent("content");
		bvo.setWriter("writer");
		bvo.setRegDate(new Date());
		int result = bDAO.insert(bvo);
		System.out.println("insert:" + result);

		System.out.println("==============");

//		// update
//		Test03BoardVO bvo3 = new Test03BoardVO();
//		bvo3.setNum(33);
//		bvo3.setTitle("title33");
//		bvo3.setContent("content33");
//		bvo3.setWriter("writer33");
//		bvo3.setRegDate(new Date());
//		int result2 = bDAO.update(bvo3);
//		System.out.println("update:" + result2);

		System.out.println("==============");

//		// delete
//		Test03BoardVO bvo4 = new Test03BoardVO();
//		bvo4.setNum(44);
//		bvo4.setTitle("title44");
//		bvo4.setContent("content44");
//		bvo4.setWriter("writer44");
//		bvo4.setRegDate(new Date());
//		int result3 = bDAO.delete(bvo4);
//		System.out.println("delete:" + result3);

		System.out.println("==============");

//		// selectOne
//		Test03BoardVO bvo2 = new Test03BoardVO();
//		bvo2.setNum(22);
//		bvo2.setTitle("title22");
//		bvo2.setContent("content22");
//		bvo2.setWriter("writer22");
//		bvo2.setRegDate(new Date());
//		Test03BoardVO bvo5 = bDAO.selectOne(bvo2);
//		System.out.println(bvo5.getNum());
//		System.out.println(bvo5.getTitle());
//		System.out.println(bvo5.getContent());
//		System.out.println(bvo5.getWriter());
//		System.out.println(bvo5.getRegDate());

		System.out.println("==============");
		
//		// selectAll   + selectAll():Test03BoardVO[]
//		Test03BoardVO[] vos = bDAO.selectAll();
//		System.out.println(vos.length);
//		for (int i = 0; i < vos.length; i++) {
//			System.out.print(vos[i].getNum());
//			System.out.print(vos[i].getTitle());
//			System.out.print(vos[i].getContent());
//			System.out.print(vos[i].getWriter());
//			System.out.println(vos[i].getRegDate());
//		}

	}// end main()

}// end class
