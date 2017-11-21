package test.com;

import java.util.Date;

public class Test03BoardDAO {
	Test03BoardVO[] vos;
	int count;
	
	public Test03BoardDAO() {
		System.out.println("Test03BoardDAO()...");
		count = 0;
		vos = new Test03BoardVO[2];
		vos[0] = new Test03BoardVO();
		vos[1] = new Test03BoardVO();
	}
	
	//CRUD
	//1.insert
	public int insert(Test03BoardVO bvo) {
		System.out.println("insert()");
		System.out.println(bvo.getTitle());
		System.out.println(bvo.getContent());
		System.out.println(bvo.getWriter());
		bvo.setNum(count+1);
		bvo.setRegDate(new Date());
		vos[count] = bvo;
		count++;
		return 0;
	}
	
	//2.select
	public Test03BoardVO selectOne(Test03BoardVO bvo) {
		System.out.println("selectOne()");
		System.out.println(bvo.getNum());
		
		return vos[bvo.getNum()-1];
	}
	
	//3.update
	public int update(Test03BoardVO bvo) {
		System.out.println("update()");
		System.out.println(bvo.getNum());
		System.out.println(bvo.getTitle());
		System.out.println(bvo.getContent());
		System.out.println(bvo.getWriter());
		
		bvo.setRegDate(new Date());
		vos[bvo.getNum()-1] = bvo;
		return 1;
	}

	public int delete(Test03BoardVO bvo) {
		System.out.println("delete()");
		System.out.println(bvo.getNum());
		
		vos[bvo.getNum()-1] = new Test03BoardVO();
		
		return 0;
		
	}
	
	
	public Test03BoardVO[] selectAll() {
		
		return vos;
	}

}
