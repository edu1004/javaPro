package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test05Drink {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// �ý���ȭ���Է¿� �ڵ��κ�////////////////////////
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		///////////////////////////////////////////////////

		System.out.println("=================");
		System.out.println("���Ǳ�");
		System.out.println("=================");

		// System.exit(0);//��������, ���� return,break
		int money = 0;
		int balance = 0;

		for (int i = 0; i < 3; i++) {
			System.out.print("["+(i+1)+"]"+"Input MONEY : ");
			money = Integer.parseInt(br.readLine()) + balance;
			System.out.print("�ܾ� : " + money);
			System.out.println();
			String menuStr = "";
			if (money >= 900) {
				menuStr = "menu : 1.�ݶ�(500��) 2.���̴�(700��) 3.�꽺(900��) \n���ϴ� ������ �Է��ϼ���.";
			} else if (money >= 700) {
				menuStr = "menu : 1.�ݶ�(500��) 2.���̴�(700��) \n���ϴ� ������ �Է��ϼ���.";
			} else if (money >= 500) {
				menuStr = "menu : 1.�ݶ�(500��)  \n���ϴ� ������ �Է��ϼ���.";
			} else if (money < 500) {
				System.out.println("�ݾ׺���");
				balance = money;
				continue;
			}
			System.out.println(menuStr);
			String menu = br.readLine();
			String drink = "";
			int price = 500;
			if (menu.equals("1")) {
				drink = "�ݶ�";
				price = 500;
			} else if (menu.equals("2")) {
				drink = "���̴�";
				price = 700;
			} else if (menu.equals("3")) {
				drink = "�꽺";
				price = 900;
			}
			balance = money - price;
			System.out.println("������ ����:" + drink);

			System.out.println("�ܾ�:" + balance);
		}
		System.out.println("======���Ǳ� ����==========");

	}

}
