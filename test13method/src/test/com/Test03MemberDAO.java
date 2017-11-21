package test.com;

public class Test03MemberDAO {

	public Test03MemberDAO() {
		System.out.println("Test03MemberDAO()....");
	}

	public int insert(Test03MemberVO vo) {
		System.out.println("insert()....");
		System.out.println(vo.getNum());
		System.out.println(vo.getId());
		System.out.println(vo.getPw());
		System.out.println(vo.getName());
		System.out.println(vo.getTel());
		return 1;
	}

	public int update(Test03MemberVO vo) {
		System.out.println("update()....");
		System.out.println(vo.getNum());
		System.out.println(vo.getId());
		System.out.println(vo.getPw());
		System.out.println(vo.getName());
		System.out.println(vo.getTel());
		return 1;
	}

	public int delete(Test03MemberVO vo) {
		System.out.println("delete()....");
		System.out.println(vo.getNum());
		System.out.println(vo.getId());
		System.out.println(vo.getPw());
		System.out.println(vo.getName());
		System.out.println(vo.getTel());
		return 1;
	}

	public Test03MemberVO[] select() {
		System.out.println("select()....");
		Test03MemberVO vo1 = new Test03MemberVO();
		vo1.setNum(11);
		vo1.setId("admin");
		vo1.setPw("hi123456");
		vo1.setName("kim");
		vo1.setTel("010");
		Test03MemberVO vo2 = new Test03MemberVO();
		vo2.setNum(22);
		vo2.setId("admin22");
		vo2.setPw("hi22222");
		vo2.setName("kim22");
		vo2.setTel("0102222");
//		Test03MemberVO[] vos = new Test03MemberVO[] {vo1,vo2};
		Test03MemberVO[] vos = new Test03MemberVO[2];//null,null
		vos[0] = vo1;
		vos[1] = vo2;
		
		return vos;
	}
	
	public Test03MemberVO search(Test03MemberVO vo) {
		System.out.println("search()....");
		System.out.println(vo.getNum());
		System.out.println(vo.getId());
		System.out.println(vo.getPw());
		System.out.println(vo.getName());
		System.out.println(vo.getTel());
		
		Test03MemberVO vo5 = new Test03MemberVO();
		vo5.setNum(55);
		vo5.setId("admin55");
		vo5.setPw("hi5555");
		vo5.setName("kim44");
		vo5.setTel("0105555");
		return vo5;
	}

}
