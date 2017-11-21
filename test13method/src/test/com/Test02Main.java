package test.com;

public class Test02Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("mothod...");
		
		Test02BBB tb = new Test02BBB();
		tb.bbb();
		String b2 = tb.bbb2();
		System.out.println(b2);
		
		tb.bbb3(100);
		String[] b4 = tb.bbb4(33, 44);
		for (int i = 0; i < b4.length; i++) {
			System.out.println(b4[i]);
		}
	}

}
