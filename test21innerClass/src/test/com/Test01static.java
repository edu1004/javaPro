package test.com;

public class Test01static {
	String name;
	
	public static class Test01inner{
		static String userName = "lee";
		public Test01inner() {
			System.out.println("Test01inner()");
		}
		public void testInner() {
			System.out.println("static testInner()...");
		}
	}

}
