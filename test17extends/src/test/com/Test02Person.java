package test.com;

public class Test02Person extends Test02Animal{

	String language;
	String fashion;
	
	public void talk() {
		System.out.println("Test02Person talk()...");
		super.move();
		System.out.println(toString());
	}
	
	@Override
	public void move() {
		System.out.println("Test02Person move()...");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "kim";
	}
}
