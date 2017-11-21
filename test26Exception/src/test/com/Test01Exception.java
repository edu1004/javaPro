package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01Exception {

	public static void main(String[] args) {
		System.out.println("Exception...");

		//예외처리:발생할오류를 사전에 우회하도록 처리하는 방법
		//컴파일시 오류처리
		//실행시 오류처리
		//예외전가(throws)와 예외 처리(try~catch)가 있다
		//비정상적으로 종료되어질것을 정상적으로 종료할수있도록
		//오류를 캐치해서 처리해줄수 있다.
		
		//1.입출력
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						System.in));
		try {
			System.out.println("1...1");
			
			int kor = Integer.parseInt(br.readLine());
			System.out.println("1...2");
			
			System.out.println(10/1);
			System.out.println("1...3");
			
			int[] sus = new int[3];
			System.out.println(sus[3]);
			System.out.println("1...4");
			
			System.out.println("2...");
		} catch (IOException e) {
			System.out.println("3...");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("4...정수형 문자를 입력하세요");
//			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("5...공사중");
			e.printStackTrace();
		} 
		System.out.println("end ....");
		
		
	}

}
