package test.com;

import java.util.Date;

import test.net.Test02Board;

public class Test02Main {

	public static void main(String[] args) {
		System.out.println("main..");
		
		
		Test02Board tb01 = new Test02Board();
//		System.out.println(tb01.num);
		System.out.println(tb01.title);
//		System.out.println(tb01.content);
//		System.out.println(tb01.writer);//private���ٺҰ�
		System.out.println(tb01.regDate);
		
		Test02Board tb02 = new Test02Board(
				2,"java","good","whoareyou",new Date());
//		System.out.println(tb02.num);
		System.out.println(tb02.title);
//		System.out.println(tb02.content);
//		System.out.println(tb02.writer);//private���ٺҰ�
		System.out.println(tb02.regDate);
		
		Test02Board tb03 = new Test02Board();
//		tb03.num = 3;//default���ٺҰ�
		tb03.title = "java2";
//		tb03.content = "good2";//protected���ٺҰ�
		//tb03.writer = "me";//private���ٺҰ�
		tb03.regDate = new Date();
//		System.out.println(tb03.num);
		System.out.println(tb03.title);
//		System.out.println(tb03.content);
		//System.out.println(tb03.writer);//private���ٺҰ�
		System.out.println(tb03.regDate);

	}

}
