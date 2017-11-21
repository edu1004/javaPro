package test.com;


public class Test03MainMember {

	public static void main(String[] args) {
		System.out.println("member...");
		
		
		Test03MemberDAO dao = new Test03MemberDAO();
		
		//1.insert
		Test03MemberVO vo = new Test03MemberVO();
		vo.setNum(11);
		vo.setId("admin");
		vo.setPw("hi123456");
		vo.setName("kim");
		vo.setTel("010");
		int result = dao.insert(vo);
		System.out.println("insert:"+result);
		//////////////////////////////////////
		
		//2.update
		Test03MemberVO vo2 = new Test03MemberVO();
		vo2.setNum(22);
		vo2.setId("admin22");
		vo2.setPw("hi222222");
		vo2.setName("kim22");
		vo2.setTel("010222");
		int result2 = dao.update(vo2);
		System.out.println("update:"+result2);
		//////////////////////////////////////
		
		
		//3.delete
		Test03MemberVO vo3 = new Test03MemberVO();
		vo3.setNum(33);
		vo3.setId("admin333");
		vo3.setPw("hi3333");
		vo3.setName("kim33");
		vo3.setTel("010333");
		int result3 = dao.delete(vo3);
		System.out.println("delete:"+result3);
		//////////////////////////////////////
		
		//4.select
		Test03MemberVO[] vos = dao.select();
		System.out.println("select:"+vos);
		System.out.println("select:"+vos.length);
		//vos가 null이 아니도록 하고
		//회원2명의 정보를 출력하시오
		for (int i = 0; i < vos.length; i++) {
			System.out.println(vos[i].getNum());
			System.out.println(vos[i].getId());
			System.out.println(vos[i].getPw());
			System.out.println(vos[i].getName());
			System.out.println(vos[i].getTel());
		}
		
		//5.search
		Test03MemberVO vo4 = new Test03MemberVO();
		vo4.setNum(4444);
		vo4.setId("admin4444");
		vo4.setPw("hi4444");
		vo4.setName("kim44");
		vo4.setTel("0104444");
		Test03MemberVO vo5 = dao.search(vo4);
		System.out.println(vo5.getNum());
		System.out.println(vo5.getId());
		System.out.println(vo5.getPw());
		System.out.println(vo5.getName());
		System.out.println(vo5.getTel());
		
		
	}// end main()

}// end class
