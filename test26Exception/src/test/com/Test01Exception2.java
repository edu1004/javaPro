package test.com;

import java.io.IOException;

public class Test01Exception2 {

	public static void main(String[] args) {
		System.out.println("Exception...");

		Test02AAA ta = new Test02AAA();
		try {
			ta.insert();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int result = ta.update();
		if(result==1)System.out.println("successed");
		else System.out.println("failed");
		
		System.out.println("end ....");
		
		
	}

}
