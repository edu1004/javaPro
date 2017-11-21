package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test01while {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//시스템화면입력용 코딩부분////////////////////////
		InputStream is =  System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		///////////////////////////////////////////////////
		System.out.println("start while");
		
		boolean b = true;
		int i = 0;
		while (i<10) {
			System.out.println(i);
			i++;
		}
		
//		String x = "";//!=,
//		while(!x.equals("x")) {
//			System.out.println("xxxxxxxxx");
//			System.out.println("종료하려면 x입력");
//			x = br.readLine();
//		}
		
		
		while(b) {
			System.out.println("xxxxxxxxx");
			System.out.println("종료하려면 x입력");
			String x = br.readLine();
			if(x.equals("x")) break;
		}
		System.out.println("end while");
	}

}
