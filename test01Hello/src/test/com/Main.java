package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		// �ý���ȭ���Է¿� �ڵ��κ�////////////////////////
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		///////////////////////////////////////////////////

		String sus = br.readLine();
		String[] temp = sus.split(" ");
		System.out.println(Integer.parseInt(temp[0])+Integer.parseInt(temp[1]));

	}
}
