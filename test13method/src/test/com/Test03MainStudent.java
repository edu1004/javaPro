package test.com;

public class Test03MainStudent {

	public static void main(String[] args) {
		Test03StudentVO vo = new Test03StudentVO();
		vo.setNum(10);
		vo.setName("kim");
		vo.setKor(99);
		vo.setEng(88);
		vo.setMath(77);
		vo.setTotal(vo.getKor() + vo.getEng() + vo.getMath());
		vo.setAvg((double) vo.getTotal() / 3);
		String grade = "";
		if (vo.getAvg() >= 90) {
			grade = "A";
		} else if (vo.getAvg() >= 80) {
			grade = "B";
		} else if (vo.getAvg() >= 70) {
			grade = "C";
		} else {
			grade = "D";
		}
		vo.setGrade(grade);

		
		Test03StudentDAO dao = new Test03StudentDAO();
		
		//1.insert
		int result = dao.insert(vo);
		System.out.println("insert:"+result);
		
		//2.update
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
		
		int result2 = dao.update(vo2);
		System.out.println("update:"+result2);
		
		
		//3.delete
		Test03StudentVO vo3 = new Test03StudentVO();
		vo3.setNum(33);
		vo3.setName("kim33");
		vo3.setKor(33);
		vo3.setEng(44);
		vo3.setMath(55);
		vo3.setTotal(vo3.getKor() + vo3.getEng() + vo3.getMath());
		vo3.setAvg((double) vo3.getTotal() / 3);
		String grade3 = "";
		if (vo3.getAvg() >= 90) {
			grade3 = "A";
		} else if (vo3.getAvg() >= 80) {
			grade3 = "B";
		} else if (vo3.getAvg() >= 70) {
			grade3 = "C";
		} else {
			grade3 = "D";
		}
		vo3.setGrade(grade3);
		
		int result3 = dao.delete(vo3);
		System.out.println("delete:"+result3);
		
		//4.selectOne
		Test03StudentVO vo4 = new Test03StudentVO();
		vo4.setNum(33);
		vo4.setName("kim33");
		vo4.setKor(33);
		vo4.setEng(44);
		vo4.setMath(55);
		vo4.setTotal(vo4.getKor() + vo4.getEng() + vo4.getMath());
		vo4.setAvg((double) vo4.getTotal() / 3);
		String grade4 = "";
		if (vo4.getAvg() >= 90) {
			grade4 = "A";
		} else if (vo4.getAvg() >= 80) {
			grade4 = "B";
		} else if (vo4.getAvg() >= 70) {
			grade4 = "C";
		} else {
			grade4 = "D";
		}
		vo4.setGrade(grade4);
		
		Test03StudentVO svo = dao.selectOne(vo4);
		System.out.println(svo.getNum());
		System.out.println(svo.getName());
		System.out.println(svo.getKor());
		System.out.println(svo.getEng());
		System.out.println(svo.getMath());
		System.out.println(svo.getTotal());
		System.out.println(svo.getAvg());
		System.out.println(svo.getGrade());

	}// end main()

}// end class
