package test.com;

public class Test01local {
	String name = "kim";
	
	public void testOuter() {
		/*final*/ String userName = "han";
		
		class Test01inner{
			public Test01inner() {
				// TODO Auto-generated constructor stub
			}
			public void testInner() {
				System.out.println(name);
//				userName = "kkk";//수정시도하지않으면 final선언 생략가능
				System.out.println(userName);
			}
		}
		Test01inner inner = new Test01inner();
		
	}

}
