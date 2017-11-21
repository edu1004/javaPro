package test.com;

public class Test01Member {
	
	String name = "kim";
	
	public void testOuter() {
		Test01inner inner = new Test01inner();
		System.out.println("testOuter():"+inner.userName);
	}
	
	public class Test01inner {
		String userName;
		public Test01inner() {
			System.out.println("Test01inner():"+name);
			userName = name+"입니다";
		}
		
		public void testInner() {
			System.out.println("testInner():"+name);
		}
	}
	public class Test01inner2 {
		String userName;
		public Test01inner2() {
			System.out.println("Test01inner():"+name);
			userName = name+"입니다";
		}
		
		public void testInner() {
			System.out.println("testInner():"+name);
		}
	}

}
