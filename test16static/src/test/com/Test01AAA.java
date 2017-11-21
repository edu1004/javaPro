package test.com;

public class Test01AAA {

	public String name;
	public static String name2;
	public static final String NAME3 = null;
	
	
	public void aaa() {
		System.out.println("aaa()");
	}
	public void aaa3() {
		System.out.println("aaa3()");
		System.out.println(name);
		aaa();
	}
	public static void aaa2() {
		System.out.println("static aaa2()");
		Test01AAA a = new Test01AAA();
		a.aaa();
		/*Test01AAA.*/xxx();//내클래스 내부 static 생략가능
	}
	public static void xxx() {
		System.out.println("xxx()...");
	}
	
}
