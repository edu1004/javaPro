package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test05Drink {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//시스템화면입력용 코딩부분////////////////////////
		InputStream is =  System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		///////////////////////////////////////////////////
		
		
		System.out.println("=================");
		System.out.println("자판기");
		System.out.println("=================");
		System.out.print("MONEY : ");
		int money = Integer.parseInt(br.readLine());
		System.out.println();
		System.out.println("menu : 1.콜라(500원) 2.사이다(700원) 3.쥬스(900원) ");
		System.out.println("원하는 정수를 입력하세요.");
		String menu = "1";
		String drink = menu.equals("1") ? "콜라": "사이다" ;
		int price = 500;
		int balance = money-price<0 ? money : money-price;
		String message = money-price<0 ? "금액부족:"+money : "잔액:"+balance;
		
		System.out.println("선택한 음료:"+drink);
		System.out.println(message);
		
		//System.exit(0);//강제종료, 리턴 return,break

		System.out.println("=================");
		

	}

}
