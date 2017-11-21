package test.com;

public class Test04Student {
	
	int num;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	String grade;
	
	public Test04Student(int x,int y) {
		
	}
	
	public Test04Student() {
		System.out.println("Test04Student()...");
		//생성자의 주목적:전역변수의 초기화
		num = 1;
		name = "홍길동";
		kor = 99;
		eng = 99;
		math = 99;
		total = kor + eng + math;
		avg = (double)total/3;
		grade = "";
		if(avg>=90) {
			grade = "A";
		}else if(avg>=80) {
			grade = "B";
		}else if(avg>=70) {
			grade = "C";
		}else {
			grade = "D";
		}
	}

}
