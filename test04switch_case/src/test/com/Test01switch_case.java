package test.com;

public class Test01switch_case {

	public static void main(String[] args) {
		System.out.println("switch~case");
		// 분기처리2.
		// 조건연산이아닌 할당데이터비교로 분기.

		int key = 10;
		switch (key) {
		case 10:
			System.out.println("aaaaa");
			break;
		case 9:
			System.out.println("bbbbb");
			break;

		default:
			System.out.println("default.....");
		}

		String key2 = "admin";
		switch (key2) {
		case "10":
			System.out.println("aaaaa");
			break;
		case "9":
			System.out.println("bbbbb");
			break;
		case "admin":
			System.out.println("ccccc");
			break;

		default:
			System.out.println("default.....");
			break;
		}

		char key3 = 'a';
		switch (key3) {
		case 'a':
			System.out.println("aaaaa");
			break;
		case 'b':
			System.out.println("bbbbb");
			break;
		case 'c':
			System.out.println("ccccc");
			break;

		default:
			System.out.println("default.....");
			break;
		}

		int avg = (int) 99.9;
		System.out.println("평점:" + avg);
		System.out.println("-----------------");
		// char grade = avg>=90 ? 'A': avg>=80 ? 'B': avg>=70 ? 'C': 'D';//삼항연산처리하세요
		char grade = 0;
		// switch (avg/10) {
		// case 9:
		// grade = 'A';
		// break;
		// case 8:
		// grade = 'B';
		// break;
		//
		// default:
		// grade = 'D';
		// break;
		// }

		switch (avg) {
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
		case 92:
		case 91:
		case 90:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;

		default:
			grade = 'D';
			break;
		}

		System.out.println("등급:" + grade);
		System.out.println("=================");

	}// end main

}
