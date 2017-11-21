package test.com;

import java.util.Scanner;

public class Test01String {

	public static void main(String[] args) {

		System.out.println("String...");

		String name = "kim";
		System.out.println(name);
		System.out.println(name.equals("kim"));
		System.out.println("문자열의 길이:" + name.length());

		String str1 = new String("abc");
		System.out.println(str1);

		String str2 = new String(new char[] { 'a', 'B', 'c' });
		System.out.println(str2);

		System.out.println(str1 == str2);
		System.out.println("abc" == "abc");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));

		System.out.println(str1 + str2);
		System.out.println(str1.concat(str2));

		System.out.println("start...");
		long startTime = System.currentTimeMillis();
		String temp = "";
		// for (int i = 0; i < 100000; i++) {
		// temp += str1;
		// }
		// for (int i = 0; i < 100000; i++) {
		// temp = temp.concat(str2);
		// }
		System.out.println(temp.length());
		System.out.println(System.currentTimeMillis() - startTime);
		System.out.println("end...");

		String data = "무궁화피 꽃이 피었습니다.";
		CharSequence data2 = "무궁화피 꽃이 피었습니다.";
		System.out.println(data.indexOf("꽃"));
		System.out.println(data.charAt(4));
		System.out.println(data.charAt(data.indexOf("꽃")));

		System.out.println(data.substring(data.indexOf("피")));
		System.out.println(data.substring(data.indexOf("피"), data.indexOf("었")));
		System.out.println(data.substring(3, 9));

		System.out.println(data.indexOf("피"));
		System.out.println(data.lastIndexOf("피"));

		// http://yangssem.blog.me/test.jpg
		String s = "http://yangssem.blog.me/test.jpg";
		// yangssem.blog.me
		System.out.println(s.substring(7, 23));
		System.out.println(s.substring(s.indexOf("y"), 23));
		System.out.println(s.substring(s.indexOf("y"), s.lastIndexOf("/")));
		// test.jpg
		System.out.println(s.substring(24));
		System.out.println(s.substring(s.lastIndexOf("/") + 1));

		String s2 = "1:aaa:bbb:ccc";
		String[] ss = s2.split(":");
		System.out.println(ss);
		System.out.println(ss.length);
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}

		// 정수 A,B가 있다
		// 프로그램 실행시 A,B에 입력할 정수를 한줄로 입력받고
		// 합산한후 결과를 출력하는 프로그램을 완성하시오.
		// 1 2
		// 3

//		Scanner sc = new Scanner(System.in);
		// int i = sc.nextInt();
		// System.out.println(i);
		// i = sc.nextInt();
		// System.out.println(i);

		System.out.println("\t");//cascade
		System.out.println("\\");//cascade
		System.out.println("\\s");//cascade
		String input = "1 fish 2 fish red fish blue fish";
		Scanner sc = new Scanner(input).useDelimiter("\\s*fish\\s*");
		//정규표현식(RegExp:Regular Expression)
		System.out.println(sc.nextInt());
		System.out.println(sc.nextInt());
		System.out.println(sc.next());
		System.out.println(sc.next());
		sc.close();
		
		String ss2 = "http://yangssem.blog.me/test.jpg";
		System.out.println(ss2.startsWith("http://"));
		System.out.println(ss2.endsWith(".jpg"));
		
		System.out.println("abc".compareTo("abc"));
		System.out.println("abc".compareTo("Abc"));
		System.out.println("abc".compareToIgnoreCase("Abc"));
		System.out.println("abc".compareTo("abc")==0);
		System.out.println('a'-'A');
		
		System.out.println("  abc  ".length());
		System.out.println("  abc  ".trim().length());
		
		
		System.out.println("abc".replace("a", "A"));
		System.out.println("abc".replace("bc", "비씨"));
		System.out.println("abc".replace("bc", "비씨"));
		//주의할것
		String st = "abc";
		st = st.replace("a", "A");
		System.out.println(st);
		
		System.out.println(st.toUpperCase());
		System.out.println(st.toLowerCase());

	}

}
