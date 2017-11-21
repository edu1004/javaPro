package test.com;

public class Test03Student {
	
	int num;
	String name;
	int kor;
	int eng;
	int math;
	
	public Test03Student() {
		System.out.println("Test03Student()...");
		num = 1;
		name = "kim";
		kor = 100;
		eng = 100;
		math = 100;
	}

	public Test03Student(int num, String name, int kor, int eng, int math) {
		System.out.println("Test03Student(int num, String name, int kor, int eng, int math)...");
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

}
