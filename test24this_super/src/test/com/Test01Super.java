package test.com;

public class Test01Super {
	String id;
	String pw;

	public Test01Super() {
		System.out.println("Test01Super()..");
		id = "system";
		pw = "hi123456";
	}
	
	public Test01Super(String id) {
		this();
		System.out.println("Test01Super(String id)..");
		this.id = id;
	}
	
}
