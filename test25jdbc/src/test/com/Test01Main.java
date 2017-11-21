package test.com;

import java.util.List;

public class Test01Main {
	public static void main(String[] args) {
		System.out.println("jdbc");

		// 1.드라이버 연결
		Test01DAO dao = new Test01DAOimpl();

		Test01VO vo1 = new Test01VO();
		vo1.setName("bbbb");

		Test01VO vo2 = new Test01VO();
		vo2.setNum(2);
		vo2.setName("kim2");

		Test01VO vo3 = new Test01VO();
		vo3.setNum(3);
		vo3.setName("kim3");

		// 2.Connection(사용자생성)

		// 3.
		// int result = dao.insert(vo1);
		// if (result == 1) {
		// System.out.println("insert successed..");
		// } else {
		// System.out.println("insert failed");
		// }
		/////////////////////////

		// Test01VO vo22 = new Test01VO();
		// vo22.setNum(19);
		// vo22.setName("lee");
		//
		// int result2 = dao.update(vo22);
		// if (result2 >= 1) {
		// System.out.println("update successed..");
		// } else {
		// System.out.println("update failed");
		// }
		// /////////////////////////
		//
		//

		Test01VO vo4 = new Test01VO();
		vo4.setNum(15);
		Test01VO result44 = dao.selectOne(vo4);
		System.out.println(result44.getNum() + ":" + result44.getName());
		//
		// /////////////////////////
		//
		//
		// Test01VO vo33 = new Test01VO();
		// vo33.setNum(11);
		//
		// int result33 = dao.delete(vo33);
		// if (result33 >= 1) {
		// System.out.println("delete successed..");
		// } else {
		// System.out.println("delete failed");
		// }
		// /////////////////////////
		//
		//
		// List<Test01VO> list = dao.selectAll();
		// System.out.println(list);
		// System.out.println(list.size());
		// for (Test01VO x : list) {
		// System.out.println(x.getNum() + ":" + x.getName());
		// }

	}

}
