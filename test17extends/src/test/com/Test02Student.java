package test.com;

public class Test02Student extends Test02Person {

	int kor;
	int eng;
	String language;
	
	public void study() {
		System.out.println("Test02Student study()...");
		this.talk();
		super.move();
		System.out.println(this.language);
		System.out.println(super.language);
	}
	
	@Override
	public void talk() {
		System.out.println("Test02Student talk()...");
	}
	
	@Override
	public void move() {
		System.out.println("Test02Student move()...");
	}
}
