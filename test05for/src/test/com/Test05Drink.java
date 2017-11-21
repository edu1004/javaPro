package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test05Drink {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 시스템화면입력용 코딩부분////////////////////////
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		///////////////////////////////////////////////////

		System.out.println("=================");
		System.out.println("자판기");
		System.out.println("=================");

		// System.exit(0);//강제종료, 리턴 return,break
		int money = 0;
		int balance = 0;

		for (int i = 0; i < 3; i++) {
			System.out.print("["+(i+1)+"]"+"Input MONEY : ");
			money = Integer.parseInt(br.readLine()) + balance;
			System.out.print("잔액 : " + money);
			System.out.println();
			String menuStr = "";
			if (money >= 900) {
				menuStr = "menu : 1.콜라(500원) 2.사이다(700원) 3.쥬스(900원) \n원하는 정수를 입력하세요.";
			} else if (money >= 700) {
				menuStr = "menu : 1.콜라(500원) 2.사이다(700원) \n원하는 정수를 입력하세요.";
			} else if (money >= 500) {
				menuStr = "menu : 1.콜라(500원)  \n원하는 정수를 입력하세요.";
			} else if (money < 500) {
				System.out.println("금액부족");
				balance = money;
				continue;
			}
			System.out.println(menuStr);
			String menu = br.readLine();
			String drink = "";
			int price = 500;
			if (menu.equals("1")) {
				drink = "콜라";
				price = 500;
			} else if (menu.equals("2")) {
				drink = "사이다";
				price = 700;
			} else if (menu.equals("3")) {
				drink = "쥬스";
				price = 900;
			}
			balance = money - price;
			System.out.println("선택한 음료:" + drink);

			System.out.println("잔액:" + balance);
		}
		System.out.println("======자판기 종료==========");

	}

}
