package test.com;

public class Test02ifelse {

	public static void main(String[] args) {
		System.out.println("if~~else~~");
		// condition ? true value : false value
		int su = -50;
		boolean b = su >= 5;
		if (b) {
			System.out.println("aaaaa");
		} else {
			System.out.println("bbbbb");
		}
		
		if (true) {
			System.out.println("cccc");
			if (b) {
				System.out.println("aaaaa");
			} else {
				System.out.println("bbbbb");
			}
		} else {
			System.out.println("dddd");
		}

	}

}
