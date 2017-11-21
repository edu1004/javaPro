package test.com;

public class Test02BBB {
	
	int num;
	double avg;
	String[] models;
	Test02AAA ta;
	
	//오버로딩 규칙
	public Test02BBB(Test02AAA ta) {
		System.out.println("Test02BBB(Test02AAA ta)...");
		this.ta = ta;
	}
	
	public Test02BBB() {
		System.out.println("Test02BBB()...");
	}
	
	public Test02BBB(int num,double avg,String[] models) {
		System.out.println("Test02BBB(int num,double avg,String[] models)...");
		this.num = num;
		this.avg = avg;
		this.models = models;
	}

}
