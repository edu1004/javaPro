package test.com;

public class Test02Teacher extends Test02Person {

	String subject;
	String school;
	
	public void teach(){
		System.out.println("Test02Teacher teach()...");
		talk();
		move();
	}
}
