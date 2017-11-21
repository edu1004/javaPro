package test.com;

public class Test03StudentDAO {

	//+ insert(Test03StudentVO vo):int
	public int insert(Test03StudentVO vo) {
		System.out.println("insert()....");
		System.out.println(vo.getNum());
		System.out.println(vo.getName());
		System.out.println(vo.getKor());
		System.out.println(vo.getEng());
		System.out.println(vo.getMath());
		System.out.println(vo.getTotal());
		System.out.println(vo.getAvg());
		System.out.println(vo.getGrade());
		return 0;
	}

	
	
	//+ update(Test03StudentVO vo):int
	public int update(Test03StudentVO vo) {
		System.out.println("update()....");
		System.out.println(vo.getNum());
		System.out.println(vo.getName());
		System.out.println(vo.getKor());
		System.out.println(vo.getEng());
		System.out.println(vo.getMath());
		System.out.println(vo.getTotal());
		System.out.println(vo.getAvg());
		System.out.println(vo.getGrade());
		return 0;
	}
	
	//+ delete(Test03StudentVO vo):int
	public int delete(Test03StudentVO vo) {
		System.out.println("delete()....");
		System.out.println(vo.getNum());
		System.out.println(vo.getName());
		System.out.println(vo.getKor());
		System.out.println(vo.getEng());
		System.out.println(vo.getMath());
		System.out.println(vo.getTotal());
		System.out.println(vo.getAvg());
		System.out.println(vo.getGrade());
		return 0;
	}
	
	//+ selectOne(Test03StudentVO vo):Test03StudentVO
	public Test03StudentVO selectOne(Test03StudentVO vo) {
		System.out.println("selectOne()....");
		System.out.println(vo.getNum());
		System.out.println(vo.getName());
		System.out.println(vo.getKor());
		System.out.println(vo.getEng());
		System.out.println(vo.getMath());
		System.out.println(vo.getTotal());
		System.out.println(vo.getAvg());
		System.out.println(vo.getGrade());
		
		
		Test03StudentVO vo2 = new Test03StudentVO();
		vo2.setNum(11);
		vo2.setName("kim11");
		vo2.setKor(11);
		vo2.setEng(22);
		vo2.setMath(33);
		vo2.setTotal(vo2.getKor() + vo2.getEng() + vo2.getMath());
		vo2.setAvg((double) vo2.getTotal() / 3);
		String grade2 = "";
		if (vo2.getAvg() >= 90) {
			grade2 = "A";
		} else if (vo2.getAvg() >= 80) {
			grade2 = "B";
		} else if (vo2.getAvg() >= 70) {
			grade2 = "C";
		} else {
			grade2 = "D";
		}
		vo2.setGrade(grade2);
		
		return vo2;
	}
	
	//+ selectAll():Test03StudentVO[]
	
}
