package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test04Member {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//�ý���ȭ���Է¿� �ڵ��κ�////////////////////////
		InputStream is =  System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		///////////////////////////////////////////////////
		// ȸ���������α׷�
		System.out.println("=================");
		System.out.println("ȸ������ ���α׷�");
		System.out.println("=================");
		
		
		//2�� ȸ����� ���
		String list = "";
		for (int i = 0; i < 2; i++) {
			System.out.print("ID : ");
			String id = br.readLine();
			System.out.println();
			System.out.println("=================");
			System.out.print("PW : ");
			String pw = "hi123456";
			System.out.println();
			System.out.println("=================");
			System.out.print("NAME : ");
			String name = "kim";
			System.out.println();
			System.out.println("=================");
			System.out.print("TEL : ");
			String tel = "010";
			System.out.println();
			System.out.println("=================");
			System.out.println(""+id+" : "+pw+" : "+name+" : "+tel+"");
			System.out.println("=================");
			list += ""+id+" : "+pw+" : "+name+" : "+tel+"\n";
		}
		System.out.println(list);
		System.out.println("======ȸ����������==========");
	}

}
