package test.com;

public class Test02AAA {
	
	int num;
	String name;
	String tel;
	

	public Test02AAA() {
		System.out.println("Test02AAA()..");
		num = 1;
		name = "kim";
		tel = "010";
	}


	public Test02AAA(int num, String name, String tel) {
		this.num = num;
		this.name = name;
		this.tel = tel;
	}
}
