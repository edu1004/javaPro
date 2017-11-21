package test.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test02Main {

	public static void main(String[] args) {
		System.out.println("inner class..2");
//		Object obj = new Object();
//		Test02 t2 = new Test02(obj);
//		BufferedReader br = new BufferedReader(new InputStreamReader(null));

		Test02 t2 = new Test02(new Test01Anonymous() {
			@Override
			public void aaa() {
				System.out.println("inner aaa()");
			}
		});
		
		Test02 t3 = new Test02();
		t3.addListener(new Test01Anonymous() {
			@Override
			public void aaa() {
				System.out.println("addListener aaa()");
			}
		});
		t3.addListener(new Test01Anonymous2() {
			@Override
			public void bbb() {
				System.out.println("addListener bbb()");
			}
		});
		t3.addListener(new Test01Anonymous3() {
			@Override
			public void ccc() {
				System.out.println("addListener ccc()");
			}
		});
		
			
	}

}
