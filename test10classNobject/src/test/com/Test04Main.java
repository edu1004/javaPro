package test.com;

public class Test04Main {

	public static void main(String[] args) {

		Test04Student st01 = new Test04Student();
		System.out.println(st01);
//		st01.num = 1;
//		st01.name = "È«±æµ¿";
//		st01.kor = 99;
//		st01.eng = 99;
//		st01.math = 99;
//		st01.total = st01.kor + st01.eng + st01.math;
//		st01.avg = (double)st01.total/3;
//		st01.grade = "";
//		if(st01.avg>=90) {
//			st01.grade = "A";
//		}else if(st01.avg>=80) {
//			st01.grade = "B";
//		}else if(st01.avg>=70) {
//			st01.grade = "C";
//		}else {
//			st01.grade = "D";
//		}
		
		System.out.println(st01.num);
		System.out.println(st01.name);
		System.out.println(st01.kor);
		System.out.println(st01.eng);
		System.out.println(st01.math);
		System.out.println(st01.total);
		System.out.println(st01.avg);
		System.out.println(st01.grade);
		
		Test04Student st02 = new Test04Student();
		System.out.println(st02);
		st02.num = 2;
		st02.name = "±è±æµ¿";
		st02.kor = 88;
		st02.eng = 88;
		st02.math = 88;
		st02.total = st02.kor + st02.eng + st02.math;
		st02.avg = (double)st02.total/3;
		st02.grade = "";
		if(st02.avg>=90) {
			st02.grade = "A";
		}else if(st02.avg>=80) {
			st02.grade = "B";
		}else if(st02.avg>=70) {
			st02.grade = "C";
		}else {
			st02.grade = "D";
		}
		
		System.out.println(st02.num);
		System.out.println(st02.name);
		System.out.println(st02.kor);
		System.out.println(st02.eng);
		System.out.println(st02.math);
		System.out.println(st02.total);
		System.out.println(st02.avg);
		System.out.println(st02.grade);
		
		
		Test04Student st03 = new Test04Student();
		System.out.println(st03);
		st03.num = 3;
		st03.name = "¹Ú±æµ¿";
		st03.kor = 77;
		st03.eng = 77;
		st03.math = 77;
		st03.total = st03.kor + st03.eng + st03.math;
		st03.avg = (double)st03.total/3;
		st03.grade = "";
		if(st03.avg>=90) {
			st03.grade = "A";
		}else if(st03.avg>=80) {
			st03.grade = "B";
		}else if(st03.avg>=70) {
			st03.grade = "C";
		}else {
			st03.grade = "D";
		}
		
		System.out.println(st03.num);
		System.out.println(st03.name);
		System.out.println(st03.kor);
		System.out.println(st03.eng);
		System.out.println(st03.math);
		System.out.println(st03.total);
		System.out.println(st03.avg);
		System.out.println(st03.grade);
		
		
		

	}

}
