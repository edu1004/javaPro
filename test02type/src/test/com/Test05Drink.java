package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test05Drink {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//�ý���ȭ���Է¿� �ڵ��κ�////////////////////////
		InputStream is =  System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		///////////////////////////////////////////////////
		
		
		System.out.println("=================");
		System.out.println("���Ǳ�");
		System.out.println("=================");
		System.out.print("MONEY : ");
		int money = Integer.parseInt(br.readLine());
		System.out.println();
		System.out.println("menu : 1.�ݶ�(500��) 2.���̴�(700��) 3.�꽺(900��) ");
		System.out.println("���ϴ� ������ �Է��ϼ���.");
		String menu = "1";
		String drink = menu.equals("1") ? "�ݶ�": "���̴�" ;
		int price = 500;
		int balance = money-price<0 ? money : money-price;
		String message = money-price<0 ? "�ݾ׺���:"+money : "�ܾ�:"+balance;
		
		System.out.println("������ ����:"+drink);
		System.out.println(message);
		
		//System.exit(0);//��������, ���� return,break

		System.out.println("=================");
		

	}

}
