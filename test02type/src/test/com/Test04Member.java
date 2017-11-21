package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test04Member {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//시스템화면입력용 코딩부분////////////////////////
		InputStream is =  System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		///////////////////////////////////////////////////
		// 회원가입프로그램
		System.out.println("=================");
		System.out.println("회원가입 프로그램");
		System.out.println("=================");
		System.out.print("ID : ");
		String id = br.readLine();
		System.out.println();
		System.out.println("=================");
		System.out.print("PW : ");
		System.out.println();
		System.out.println("=================");
		System.out.print("NAME : ");
		System.out.println();
		System.out.println("=================");
		System.out.print("TEL : ");
		System.out.println();
		System.out.println("=================");
		System.out.println(""+id+" : hi123456 : KIM : 010");
		System.out.println("=================");
		

	}

}
