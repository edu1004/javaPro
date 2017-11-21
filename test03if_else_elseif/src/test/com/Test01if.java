package test.com;

public class Test01if {

	public static void main(String[] args) {
		System.out.println("if~~~~");
		//분기처리를 위한 문법
		boolean b = true;
		b = false;
		if (b) {
			System.out.println("aaaa");
			System.out.println("ccc");
		}
		if (b) System.out.println("bbbb");
		

		System.out.println("ccc");
		
		if (5==5) {
			if (4==4) {
				if (3==3) {
					System.out.println("dddd");
				}
			}
		}
		
		if (true && true) {
			System.out.println("eeee");
		}
		
		if (50>10?true:false) {
			System.out.println("ffff");
		}
		
	}

}
