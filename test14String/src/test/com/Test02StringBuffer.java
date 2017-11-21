package test.com;

import java.util.StringTokenizer;

public class Test02StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("StringBuffer and StringBuilder");
		long startTime = System.currentTimeMillis();
		// StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 10000000; i++) {
			sb.append("abc");
		}
		System.out.println(System.currentTimeMillis() - startTime);

		System.out.println(sb.toString().length());

		StringTokenizer st = new StringTokenizer("this is a test");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
